// Generated by Haxe 3.4.0

#pragma warning disable 109, 114, 219, 429, 168, 162
public class Cyph : global::haxe.lang.HxObject {
	
	static Cyph() {
		unchecked {
			global::Cyph.addressSpace = ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (new global::Array<object>(new object[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"}).map<int>(((global::haxe.lang.Function) (( (( global::Cyph_Anon_15__Fun.__hx_current != null )) ? (global::Cyph_Anon_15__Fun.__hx_current) : (global::Cyph_Anon_15__Fun.__hx_current = ((global::Cyph_Anon_15__Fun) (new global::Cyph_Anon_15__Fun()) )) )) ))) ))) );
			global::Cyph.services = new global::haxe.lang.DynamicObject(new int[]{922489979, 989275570, 1103060696}, new object[]{"simple-buu700-master-dot-cyph-im-dot-cyphme.appspot.com/#video/", "simple-buu700-master-dot-cyph-im-dot-cyphme.appspot.com/#audio/", "simple-buu700-master-dot-cyph-im-dot-cyphme.appspot.com/#"}, new int[]{}, new double[]{});
			global::Cyph.options = new global::haxe.lang.DynamicObject(new int[]{}, new object[]{}, new int[]{916821830, 922489979, 989275570, 1047139896, 1145895711, 1631774278}, new double[]{((double) (4) ), ((double) (2) ), ((double) (1) ), ((double) (5) ), ((double) (3) ), ((double) (6) )});
		}
	}
	
	
	public Cyph(global::haxe.lang.EmptyObject empty) {
	}
	
	
	public Cyph() {
		global::Cyph.__hx_ctor__Cyph(this);
	}
	
	
	public static void __hx_ctor__Cyph(global::Cyph __hx_this) {
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
				int _g1 = 0;
				int _g = length;
				while (( _g1 < _g )) {
					int i = _g1++;
					{
						global::haxe.io.Bytes _this = ((global::haxe.io.ArrayBufferViewImpl) (randomNumbers) ).bytes;
						int pos = ( (( i << 2 )) + ((global::haxe.io.ArrayBufferViewImpl) (randomNumbers) ).byteOffset );
						int v = ((int) (global::haxe.lang.Runtime.toInt(global::Cyph.addressSpace[((int) (((double) (((int) (global::System.Math.Floor(((double) (( ((double) (( (((uint) (( ( ( ((int) (_this.b[pos]) ) | ( ((int) (_this.b[( pos + 1 )]) ) << 8 ) ) | ( ((int) (_this.b[( pos + 2 )]) ) << 16 ) ) | ( ((int) (_this.b[( pos + 3 )]) ) << 24 ) )) )) / 4294967296.0 )) ) * global::Cyph.addressSpace.length )) ))) )) )) )])) );
						randomBytes.b[i] = ((byte) (v) );
					}
					
				}
				
			}
			
			string guid = new global::haxe.io.BytesInput(randomBytes, new global::haxe.lang.Null<int>(0, true), new global::haxe.lang.Null<int>(length, true)).readString(length);
			randomBytes.fill(0, byteLength, 0);
			return guid;
		}
	}
	
	
	public static void request(string url, bool post, global::Array<object> headers, global::Array<object> parameters, global::haxe.lang.Function onData, global::haxe.lang.Function onError) {
		global::haxe.Http http = new global::haxe.Http(((string) (url) ));
		http.onData = onData;
		http.onError = onError;
		{
			int _g = 0;
			while (( _g < headers.length )) {
				object o = headers[_g];
				 ++ _g;
				http.setHeader(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "k", 107, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o, "v", 118, true)));
			}
			
		}
		
		{
			int _g1 = 0;
			while (( _g1 < parameters.length )) {
				object o1 = parameters[_g1];
				 ++ _g1;
				http.setParameter(global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o1, "k", 107, true)), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(o1, "v", 118, true)));
			}
			
		}
		
		http.request(new global::haxe.lang.Null<bool>(post, true));
	}
	
	
	public static object generateLink(global::Array<int> options) {
		unchecked {
			if (( options == null )) {
				options = new global::Array<int>(new int[]{});
			}
			
			string id = global::Cyph.generateGuid(7);
			{
				string __temp_odecl1 = global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("https://", (( (( options.indexOf(((int) (global::haxe.lang.Runtime.getField_f(global::Cyph.options, "video", 922489979, true)) ), default(global::haxe.lang.Null<int>)) > -1 )) ? (global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(global::Cyph.services, "video", 922489979, true))) : (( (( options.indexOf(((int) (global::haxe.lang.Runtime.getField_f(global::Cyph.options, "voice", 989275570, true)) ), default(global::haxe.lang.Null<int>)) > -1 )) ? (global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(global::Cyph.services, "voice", 989275570, true))) : (global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(global::Cyph.services, "chat", 1103060696, true))) )) ))), "/#"), (( (( options.indexOf(((int) (global::haxe.lang.Runtime.getField_f(global::Cyph.options, "modestBranding", 1145895711, true)) ), default(global::haxe.lang.Null<int>)) > -1 )) ? ("&") : ("") ))), (( (( options.indexOf(((int) (global::haxe.lang.Runtime.getField_f(global::Cyph.options, "disableP2P", 916821830, true)) ), default(global::haxe.lang.Null<int>)) > -1 )) ? ("$") : ("") ))), (( (( options.indexOf(((int) (global::haxe.lang.Runtime.getField_f(global::Cyph.options, "nativeCrypto", 1047139896, true)) ), default(global::haxe.lang.Null<int>)) > -1 )) ? ("%") : ("") ))), id), global::Cyph.generateGuid(19));
				return new global::haxe.lang.DynamicObject(new int[]{23515, 1202919418}, new object[]{id, __temp_odecl1}, new int[]{}, new double[]{});
			}
			
		}
	}
	
	
	public static void initiateSession(string apiKey, global::Array<int> options, global::haxe.lang.Function onData, global::haxe.lang.Function onError) {
		object linkData = global::Cyph.generateLink(options);
		global::Cyph.request(global::haxe.lang.Runtime.concat("https://api.cyph.com/preauth/", global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(linkData, "id", 23515, true))), true, new global::Array<object>(new object[]{new global::haxe.lang.DynamicObject(new int[]{107, 118}, new object[]{"Authorization", apiKey}, new int[]{}, new double[]{})}), new global::Array<object>(new object[]{}), new global::Cyph_initiateSession_159__Fun(onData, linkData), onError);
	}
	
	
}



#pragma warning disable 109, 114, 219, 429, 168, 162
public class Cyph_initiateSession_159__Fun : global::haxe.lang.Function {
	
	public Cyph_initiateSession_159__Fun(global::haxe.lang.Function onData, object linkData) : base(1, 0) {
		this.onData = onData;
		this.linkData = linkData;
	}
	
	
	public override object __hx_invoke1_o(double __fn_float1, object __fn_dyn1) {
		string data = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.toString(__fn_float1)) : (global::haxe.lang.Runtime.toString(__fn_dyn1)) );
		this.onData.__hx_invoke1_o(default(double), global::haxe.lang.Runtime.toString(global::haxe.lang.Runtime.getField(this.linkData, "link", 1202919418, true)));
		return null;
	}
	
	
	public global::haxe.lang.Function onData;
	
	public object linkData;
	
}



#pragma warning disable 109, 114, 219, 429, 168, 162
public class Cyph_Anon_15__Fun : global::haxe.lang.Function {
	
	public Cyph_Anon_15__Fun() : base(1, 0) {
	}
	
	
	public static global::Cyph_Anon_15__Fun __hx_current;
	
	public override object __hx_invoke1_o(double __fn_float1, object __fn_dyn1) {
		string s = ( (( __fn_dyn1 == global::haxe.lang.Runtime.undefined )) ? (global::haxe.lang.Runtime.toString(__fn_float1)) : (global::haxe.lang.Runtime.toString(__fn_dyn1)) );
		return (global::haxe.lang.StringExt.charCodeAt(s, 0)).toDynamic();
	}
	
	
}


