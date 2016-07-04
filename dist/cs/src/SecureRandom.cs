
#pragma warning disable 109, 114, 219, 429, 168, 162
public class SecureRandom : global::haxe.lang.HxObject {
	
	public SecureRandom(global::haxe.lang.EmptyObject empty) {
	}
	
	
	public SecureRandom() {
		global::SecureRandom.__hx_ctor__SecureRandom(this);
	}
	
	
	public static void __hx_ctor__SecureRandom(global::SecureRandom __temp_me9) {
	}
	
	
	public static global::haxe.io.Bytes getSecureRandomBytes(int length) {
		string reason = "";
		try {
			global::haxe.io.Bytes @out = global::haxe.io.Bytes.alloc(length);
			global::System.Security.Cryptography.RNGCryptoServiceProvider rng = new global::System.Security.Cryptography.RNGCryptoServiceProvider();
			( rng as global::System.Security.Cryptography.RandomNumberGenerator ).GetBytes(((byte[]) (@out.b) ));
			return @out;
		}
		catch (global::System.Exception __temp_catchallException1){
			global::haxe.lang.Exceptions.exception = __temp_catchallException1;
			object __temp_catchall2 = __temp_catchallException1;
			if (( __temp_catchall2 is global::haxe.lang.HaxeException )) {
				__temp_catchall2 = ((global::haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			{
				object e = __temp_catchall2;
				reason = global::haxe.lang.Runtime.concat("", global::Std.@string(e));
			}
			
		}
		
		
		throw global::haxe.lang.HaxeException.wrap(global::haxe.lang.Runtime.concat("Can\'t find a secure source of random bytes. Reason: ", reason));
	}
	
	
	public static new object __hx_createEmpty() {
		return new global::SecureRandom(global::haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static new object __hx_create(global::Array arr) {
		return new global::SecureRandom();
	}
	
	
}


