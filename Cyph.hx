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
		chat: 'cyph.im',
		voice: 'cyph.audio',
		video: 'cyph.video'
	};

	public static var options		= {
		voice: 1,
		video: 2,
		modestBranding: 3,
		disableP2P: 4,
		nativeCrypto: 5
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
					var data	= {method: "GET"};

					if (post) {
						data.method		= "POST";
						data.headers	= {"Content-Type": "application/x-www-form-urlencoded"};
						data.body		= parameters.
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

		for (o in parameters) {
			http.setParameter(o.k, o.v);
		}

		http.request(post);
	}

	public static function initiateSession (
		apiKey: String,
		?options: Array<Int>,
		onData: String -> Void,
		onError: String -> Void
	) : Void {
		if (options == null) {
			options	= [];
		}

		var cyphId	= Cyph.generateGuid(7);

		var cyphUrl	= 'https://' +
			(
				options.indexOf(Cyph.options.video) > -1 ?
					Cyph.services.video :
					options.indexOf(Cyph.options.voice) > -1 ?
						Cyph.services.voice :
						Cyph.services.chat
			) +
			'/#' +
			(options.indexOf(Cyph.options.modestBranding) > -1 ? '&' : '') +
			(options.indexOf(Cyph.options.disableP2P) > -1 ? '$' : '') +
			(options.indexOf(Cyph.options.nativeCrypto) > -1 ? '%' : '') +
			cyphId +
			Cyph.generateGuid(19)
		;

		Cyph.request(
			'https://api.cyph.com/preauth',
			true,
			[
				{k: 'apiKey', v: apiKey},
				{k: 'id', v: cyphId}
			],
			function (data) { onData(cyphUrl); },
			onError
		);
	}
}
