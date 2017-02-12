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
		chat: 'buu700-master.cyph.ws',
		voice: 'buu700-master.cyph.ws/#audio',
		video: 'buu700-master.cyph.ws/#video'
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
		parameters: Array<{k: String, v: String}>,
		onData: String -> Void,
		onError: String -> Void
	) : Void {
		#if js
			var isNode: Bool	= untyped __js__('
				typeof module !== "undefined" && module.exports
			');

			if (isNode) {
				untyped __js__('
					var request	= require("request");

					var callback	= function(err, response, body) {
						if (err) {
							onError(err);
						}
						else if (response.statusCode !== 200) {
							onError(body);
						}
						else {
							onData(body);
						}
					};

					if (post) {
						var data	= {form: {}, url: url};

						parameters.forEach(function (o) {
							data.form[o.k]	= o.v;
						});

						request.post(data, callback);
					}
					else {
						request(url, callback);
					}
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
			(options.indexOf(Cyph.options.telehealth) > -1 ? '@' : '') +
			(options.indexOf(Cyph.options.modestBranding) > -1 ? '&' : '') +
			(options.indexOf(Cyph.options.disableP2P) > -1 ? '$' : '') +
			(options.indexOf(Cyph.options.nativeCrypto) > -1 ? '%' : '') +
			cyphId +
			Cyph.generateGuid(19)
		;

		Cyph.request(
			'https://buu700-master-dot-cyphme.appspot.com/preauth',
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
