package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Cyph extends haxe.lang.HxObject
{
	static
	{
		//line 6 "/home/ubuntu/sdk/Cyph.hx"
		haxe.root.Cyph.addressSpace = ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.String>(new java.lang.String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"}).map(( (( haxe.root.Cyph_Anon_13__Fun.__hx_current != null )) ? (haxe.root.Cyph_Anon_13__Fun.__hx_current) : (haxe.root.Cyph_Anon_13__Fun.__hx_current = ((haxe.root.Cyph_Anon_13__Fun) (new haxe.root.Cyph_Anon_13__Fun()) )) ))) );
		//line 17 "/home/ubuntu/sdk/Cyph.hx"
		haxe.root.Cyph.services = new haxe.lang.DynamicObject(new java.lang.String[]{"chat", "video", "voice"}, new java.lang.Object[]{"cyph.im", "cyph.video", "cyph.audio"}, new java.lang.String[]{}, new double[]{});
		//line 23 "/home/ubuntu/sdk/Cyph.hx"
		haxe.root.Cyph.options = new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{"disableP2P", "modestBranding", "nativeCrypto", "video", "voice"}, new double[]{((double) (((double) (4) )) ), ((double) (((double) (3) )) ), ((double) (((double) (5) )) ), ((double) (((double) (2) )) ), ((double) (((double) (1) )) )});
	}
	
	public Cyph(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Cyph()
	{
		//line 5 "/home/ubuntu/sdk/Cyph.hx"
		haxe.root.Cyph.__hx_ctor__Cyph(this);
	}
	
	
	public static void __hx_ctor__Cyph(haxe.root.Cyph __temp_me3)
	{
	}
	
	
	public static haxe.root.Array<java.lang.Object> addressSpace;
	
	public static java.lang.Object services;
	
	public static java.lang.Object options;
	
	public static java.lang.String generateGuid(int length)
	{
		//line 32 "/home/ubuntu/sdk/Cyph.hx"
		int byteLength = ( length * 4 );
		//line 33 "/home/ubuntu/sdk/Cyph.hx"
		haxe.io.Bytes randomBytes = haxe.root.SecureRandom.getSecureRandomBytes(byteLength);
		//line 34 "/home/ubuntu/sdk/Cyph.hx"
		haxe.io.ArrayBufferViewImpl randomNumbers = haxe.io._UInt32Array.UInt32Array_Impl_.fromBytes(randomBytes, null, null);
		//line 36 "/home/ubuntu/sdk/Cyph.hx"
		{
			//line 36 "/home/ubuntu/sdk/Cyph.hx"
			int _g = 0;
			//line 36 "/home/ubuntu/sdk/Cyph.hx"
			while (( _g < length ))
			{
				//line 36 "/home/ubuntu/sdk/Cyph.hx"
				int i = _g++;
				//line 37 "/home/ubuntu/sdk/Cyph.hx"
				{
					//line 37 "/home/ubuntu/sdk/Cyph.hx"
					int __temp_stmt2 = 0;
					//line 37 "/home/ubuntu/sdk/Cyph.hx"
					{
						//line 38 "/home/ubuntu/sdk/Cyph.hx"
						double __temp_stmt4 = 0.0;
						//line 38 "/home/ubuntu/sdk/Cyph.hx"
						{
							//line 38 "/home/ubuntu/sdk/Cyph.hx"
							int _int = 0;
							//line 38 "/home/ubuntu/sdk/Cyph.hx"
							int __temp_stmt5 = 0;
							//line 38 "/home/ubuntu/sdk/Cyph.hx"
							{
								//line 38 "/home/ubuntu/sdk/Cyph.hx"
								haxe.io.Bytes _this = ((haxe.io.ArrayBufferViewImpl) (randomNumbers) ).bytes;
								//line 38 "/home/ubuntu/sdk/Cyph.hx"
								int pos = ( (( i << 2 )) + ((haxe.io.ArrayBufferViewImpl) (randomNumbers) ).byteOffset );
								//line 38 "/home/ubuntu/sdk/Cyph.hx"
								__temp_stmt5 = ( ( ( ( _this.b[pos] & 255 ) | ( (( _this.b[( pos + 1 )] & 255 )) << 8 ) ) | ( (( _this.b[( pos + 2 )] & 255 )) << 16 ) ) | ( (( _this.b[( pos + 3 )] & 255 )) << 24 ) );
							}
							
							//line 38 "/home/ubuntu/sdk/Cyph.hx"
							_int = ((int) (__temp_stmt5) );
							//line 38 "/home/ubuntu/sdk/Cyph.hx"
							__temp_stmt4 = ( (( _int < 0 )) ? (( 4294967296.0 + _int )) : (( _int + 0.0 )) );
						}
						
						//line 37 "/home/ubuntu/sdk/Cyph.hx"
						double __temp_stmt3 = java.lang.Math.floor(( ( __temp_stmt4 / 4294967296.0 ) * haxe.root.Cyph.addressSpace.length ));
						//line 37 "/home/ubuntu/sdk/Cyph.hx"
						double x = ((double) (((int) (__temp_stmt3) )) );
						//line 37 "/home/ubuntu/sdk/Cyph.hx"
						__temp_stmt2 = ((int) (x) );
					}
					
					//line 37 "/home/ubuntu/sdk/Cyph.hx"
					java.lang.Object __temp_stmt1 = haxe.root.Cyph.addressSpace.__get(__temp_stmt2);
					//line 37 "/home/ubuntu/sdk/Cyph.hx"
					int v = ((int) (haxe.lang.Runtime.toInt(__temp_stmt1)) );
					//line 37 "/home/ubuntu/sdk/Cyph.hx"
					randomBytes.b[i] = ((byte) (v) );
				}
				
			}
			
		}
		
		//line 42 "/home/ubuntu/sdk/Cyph.hx"
		java.lang.String guid = new haxe.io.BytesInput(randomBytes, 0, length).readString(length);
		//line 43 "/home/ubuntu/sdk/Cyph.hx"
		randomBytes.fill(0, byteLength, 0);
		//line 44 "/home/ubuntu/sdk/Cyph.hx"
		return guid;
	}
	
	
	public static java.lang.String initiateSession(haxe.root.Array<java.lang.Object> options)
	{
		//line 48 "/home/ubuntu/sdk/Cyph.hx"
		if (( options == null )) 
		{
			//line 49 "/home/ubuntu/sdk/Cyph.hx"
			options = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{});
		}
		
		//line 52 "/home/ubuntu/sdk/Cyph.hx"
		return ( ( ( ( ( ( "https://" + (( (( options.indexOf(((int) (haxe.lang.Runtime.getField_f(haxe.root.Cyph.options, "video", true)) ), null) > -1 )) ? (haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(haxe.root.Cyph.services, "video", true))) : (( (( options.indexOf(((int) (haxe.lang.Runtime.getField_f(haxe.root.Cyph.options, "voice", true)) ), null) > -1 )) ? (haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(haxe.root.Cyph.services, "voice", true))) : (haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(haxe.root.Cyph.services, "chat", true))) )) )) ) + "/#" ) + (( (( options.indexOf(((int) (haxe.lang.Runtime.getField_f(haxe.root.Cyph.options, "modestBranding", true)) ), null) > -1 )) ? ("&") : ("") )) ) + (( (( options.indexOf(((int) (haxe.lang.Runtime.getField_f(haxe.root.Cyph.options, "disableP2P", true)) ), null) > -1 )) ? ("$") : ("") )) ) + (( (( options.indexOf(((int) (haxe.lang.Runtime.getField_f(haxe.root.Cyph.options, "nativeCrypto", true)) ), null) > -1 )) ? ("%") : ("") )) ) + haxe.root.Cyph.generateGuid(26) );
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 5 "/home/ubuntu/sdk/Cyph.hx"
		return new haxe.root.Cyph(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 5 "/home/ubuntu/sdk/Cyph.hx"
		return new haxe.root.Cyph();
	}
	
	
}


