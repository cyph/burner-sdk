import haxe.Http;
import haxe.io.BytesInput;
import haxe.io.UInt32Array;


@:expose
class Cyph {
	private static var addressSpace	= [
		'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
		'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
		'k', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
		'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E',
		'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
		'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
	].map(function (s: String) {
		return s.charCodeAt(0);
	});

	private static var services		= {
		chat: 'simple-buu700-master-dot-cyph-im-dot-cyphme.appspot.com/#',
		voice: 'simple-buu700-master-dot-cyph-im-dot-cyphme.appspot.com/#audio/',
		video: 'simple-buu700-master-dot-cyph-im-dot-cyphme.appspot.com/#video/'
	};

	public static var options		= {
		voice: 1,
		video: 2,
		modestBranding: 3,
		disableP2P: 4,
		nativeCrypto: 5,
		telehealth: 6
	};

	private static function generateGuid (length: Int) : String {
		var byteLength		= length * 4;
		var randomBytes		= SecureRandom.getSecureRandomBytes(byteLength); 
		var randomNumbers	= UInt32Array.fromBytes(randomBytes);

		for (i in 0...length) {
			randomBytes.set(i, Cyph.addressSpace[Std.int(Math.floor(
				randomNumbers.get(i) / 4294967296.0 * Cyph.addressSpace.length
			))]);
		}

		var guid	= new BytesInput(randomBytes, 0, length).readString(length);
		randomBytes.fill(0, byteLength, 0);
		return guid;
	}

	private static function request (
		url: String,
		post: Bool,
		headers: Array<{k: String, v: String}>,
		parameters: Array<{k: String, v: String}>,
		onData: String -> Void,
		onError: String -> Void
	) : Void {
		#if js
			var fetch: Dynamic	= untyped __js__('(function () {
				try {
					return typeof fetch !== "undefined" ? fetch : require("node-fetch");
				}
				catch (_) {}
			})()');

			if (fetch) {
				untyped __js__('
					var data	= {
						headers: headers.reduce(
							function (acc, o) { acc[o.k] = o.v; return acc; },
							{}
						),
						method: post ? "POST" : "GET"
					};

					if (post && parameters.length > 0) {
						data.headers["Content-Type"]	= "application/x-www-form-urlencoded";
						data.body						= parameters.
							map(function (o) { return o.k + "=" + o.v; }).
							join("&")
						;
					}

					fetch(url, data).
						then(function (response) {
							var responseText	= response.text().then(function (s) {
								return s.trim();
							});
							if (response.ok) {
								return responseText;
							}
							else {
								return responseText.then(function (s) {
									throw new Error(s);
								});
							}
						}).
						then(onData).
						catch(onError)
					;
				');
				return;
			}
		#end

		var http		= new Http(url);
		http.onData		= onData;
		http.onError	= onError;

		for (o in headers) {
			http.setHeader(o.k, o.v);
		}

		for (o in parameters) {
			http.setParameter(o.k, o.v);
		}

		http.request(post);
	}

	public static function generateLink (?options: Array<Int>) : {id: String, link: String} {
		if (options == null) {
			options	= [];
		}

		var id	= Cyph.generateGuid(7);

		return {
			id: id,
			link: 'https://' +
				(
					options.indexOf(Cyph.options.video) > -1 ?
						Cyph.services.video :
						options.indexOf(Cyph.options.voice) > -1 ?
							Cyph.services.voice :
							Cyph.services.chat
				) +
				(options.indexOf(Cyph.options.modestBranding) > -1 ? '&' : '') +
				(options.indexOf(Cyph.options.disableP2P) > -1 ? '$' : '') +
				(options.indexOf(Cyph.options.nativeCrypto) > -1 ? '%' : '') +
				id +
				Cyph.generateGuid(19)
		};
	}

	public static function initiateSession (
		apiKey: String,
		?options: Array<Int>,
		onData: String -> Void,
		onError: String -> Void
	) : Void {
		var linkData	= Cyph.generateLink(options);

		Cyph.request(
			'https://simple-buu700-master-dot-cyphme.appspot.com/preauth/' + linkData.id,
			true,
			[{k: 'Authorization', v: apiKey}],
			[],
			function (data) { onData(linkData.link); },
			onError
		);
	}
}
