
#pragma warning disable 109, 114, 219, 429, 168, 162
public class Cyph : global::haxe.lang.HxObject {
	
	static Cyph() {
		global::Cyph.addressSpace = ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (new global::Array<object>(new object[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"}).map<int>(( (( global::Cyph_Anon_13__Fun.__hx_current != null )) ? (global::Cyph_Anon_13__Fun.__hx_current) : (global::Cyph_Anon_13__Fun.__hx_current = ((global::Cyph_Anon_13__Fun) (new global::Cyph_Anon_13__Fun()) )) ))) ))) );
		global::Cyph.services = new global::haxe.lang.DynamicObject(new int[]{922489979, 989275570, 1103060696}, new object[]{"cyph.video", "cyph.audio", "cyph.im"}, new int[]{}, new double[]{});
		global::Cyph.options = new global::haxe.lang.DynamicObject(new int[]{}, new object[]{}, new int[]{916821830, 922489979, 989275570, 1047139896, 1145895711}, new double[]{((double) (4) ), ((double) (2) ), ((double) (1) ), ((double) (5) ), ((double) (3) )});
	}
	
	
	public Cyph(global::haxe.lang.EmptyObject empty) {
	}
	
	
	public Cyph() {
		global::Cyph.__hx_ctor__Cyph(this);
	}
	
	
	public static void __hx_ctor__Cyph(global::Cyph __temp_me7) {
	}
	
	
	public static global::Array<object> addressSpace;
	
	public static object services;
	
	public static object options;
	
	public static string generateGuid(int length) {
		unchecked {
			int byteLength = ( length * 4 );
			global::haxe.io.Bytes randomBytes = global::SecureRandom.getSecureRandomBytes(byteLength);
			global::haxe.io.ArrayBufferViewImpl randomNumbers = global::haxe.io._UInt32Array.UInt32Array_Impl_.fromBytes(randomBytes, default(global::haxe.lang.Null<int>), default(global::haxe.lang.Null<int>));
			{
				int _g = 0;
				while (( _g < length )) {
					int i = _g++;
					{
						int __temp_stmt1 = default(int);
						{
							double x = default(double);
							{
								int __temp_stmt2 = default(int);
								{
									global::haxe.io.Bytes _this = ((global::haxe.io.ArrayBufferViewImpl) (randomNumbers) ).bytes;
									int pos = ( (( i << 2 )) + ((global::haxe.io.ArrayBufferViewImpl) (randomNumbers) ).byteOffset );
									__temp_stmt2 = ( ( ( ((int) (_this.b[pos]) ) | ( ((int) (_this.b[( pos + 1 )]) ) << 8 ) ) | ( ((int) (_this.b[( pos + 2 )]) ) << 16 ) ) | ( ((int) (_this.b[( pos + 3 )]) ) << 24 ) );
								}
								
								double x1 = global::System.Math.Floor(((double) (( ((double) (( ((uint) (__temp_stmt2) ) / 4294967296.0 )) ) * global::Cyph.addressSpace.length )) ));
								x = ((double) (((int) (x1) )) );
							}
							
							__temp_stmt1 = ((int) (x) );
						}
						
						int v = ((int) (global::haxe.lang.Runtime.toInt(global::Cyph.addressSpace[__temp_stmt1])) );
						randomBytes.b[i] = ((byte) (v) );
					}
					
				}
				
			}
			
			string guid = new global::haxe.io.BytesInput(randomBytes, new global::haxe.lang.Null<int>(0, true), new global::haxe.lang.Null<int>(length, true)).readString(length);
			randomBytes.fill(0, byteLength, 0);
			return guid;
		}
	}
	
	
	public static string initiateSession(global::Array<int> options) {
		unchecked {
			if (( options == null )) {
				options = new global::Array<int>(new int[]{});
			}
			
			return global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("https://", (( (( options.indexOf(((int) (global::haxe.lang.Runtime.getField_f(global::Cyph.options, "video", 922489979, true)) ), default(global::haxe.lang.Null<int>)) > -1 )) ? (global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(global::Cyph.services, "video", 922489979, true))) : (( (( options.indexOf(((int) (global::haxe.lang.Runtime.getField_f(global::Cyph.options, "voice", 989275570, true)) ), default(global::haxe.lang.Null<int>)) > -1 )) ? (global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(global::Cyph.services, "voice", 989275570, true))) : (global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(global::Cyph.services, "chat", 1103060696, true))) )) ))), "/#"), (( (( options.indexOf(((int) (global::haxe.lang.Runtime.getField_f(global::Cyph.options, "modestBranding", 1145895711, true)) ), default(global::haxe.lang.Null<int>)) > -1 )) ? ("&") : ("") ))), (( (( options.indexOf(((int) (global::haxe.lang.Runtime.getField_f(global::Cyph.options, "disableP2P", 916821830, true)) ), default(global::haxe.lang.Null<int>)) > -1 )) ? ("$") : ("") ))), (( (( options.indexOf(((int) (global::haxe.lang.Runtime.getField_f(global::Cyph.options, "nativeCrypto", 1047139896, true)) ), default(global::haxe.lang.Null<int>)) > -1 )) ? ("%") : ("") ))), global::Cyph.generateGuid(26));
		}
	}
	
	
	public static new object __hx_createEmpty() {
		return new global::Cyph(global::haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static new object __hx_create(global::Array arr) {
		return new global::Cyph();
	}
	
	
}



#pragma warning disable 109, 114, 219, 429, 168, 162
public class Cyph_Anon_13__Fun : global::haxe.lang.Function {
	
	public Cyph_Anon_13__Fun() : base(1, 0) {
	}
	
	
	public static global::Cyph_Anon_13__Fun __hx_current;
	
	public override object __hx_invoke1_o(double __fn_float1, object __fn_dyn1) {
		string s = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.toString(__fn_float1)) : (global::haxe.lang.Runtime.toString(__fn_dyn1)) );
		return (global::haxe.lang.StringExt.charCodeAt(s, 0)).toDynamic();
	}
	
	
}


