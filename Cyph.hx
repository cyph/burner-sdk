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

	public static function initiateSession (?options: Array<Int>) : String {
		if (options == null) {
			options	= [];
		}

		return 'https://' +
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
			Cyph.generateGuid(26)
		;
	}
}
