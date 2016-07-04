/*
 * Copyright (c) 2007 Henri Torgemane. All Rights Reserved.
 *
 * Forked from https://github.com/soywiz/haxe-crypto/blob/master/src/com/hurlant/crypto/prng/SecureRandom.hx.
 */

import haxe.io.Bytes;
import haxe.io.BytesData;

class SecureRandom {
	static public function getSecureRandomBytes (length: Int) : Bytes {
		var reason = '';
		try {
			#if flash
				return Bytes.ofData(untyped __global__["flash.crypto.generateRandomBytes"](length));
			#elseif js
				untyped __js__('var Crypto = typeof crypto === "undefined" ? require("crypto") : crypto');
				var bytes: Dynamic = untyped __js__("(Crypto.randomBytes) ? Crypto.randomBytes({0}) : Crypto.getRandomValues(new Uint8Array({0}))", length);
				var out = Bytes.alloc(length);
				for (n in 0 ... length) out.set(n, bytes[n]);
				return out;
			#elseif python
				var out = Bytes.alloc(length);
				var str = RandomOs.urandom(length);
				for (n in 0 ... length) out.set(n, str.charCodeAt(n));
				return out;
			#elseif java
				return Bytes.ofData(java.security.SecureRandom.getSeed(length));
			#elseif cs
				var out = Bytes.alloc(length);
				var rng = new cs.system.security.cryptography.RNGCryptoServiceProvider();
				rng.GetBytes(out.getData());
				return out;
			#elseif sys
				var out = Bytes.alloc(length);
				#if windows
					var input = sys.io.File.read("\\Device\\KsecDD");
				#else
					var input = sys.io.File.read("/dev/urandom");
				#end
				input.readBytes(out, 0, length);
				input.close();
				return out;
			#end
		} catch (e: Dynamic) {
			reason = '$e';
		}
		throw "Can't find a secure source of random bytes. Reason: " + reason;
	}
}

#if python
@:pythonImport("os")
extern class RandomOs {
	static public function urandom (count: Int) : String;
}
#end
