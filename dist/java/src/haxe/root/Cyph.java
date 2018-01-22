package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Cyph extends haxe.lang.HxObject
{
	static
	{
		//line 8 "/cyph/Cyph.hx"
		haxe.root.Cyph.addressSpace = ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.String>(new java.lang.String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"}).map(( (( haxe.root.Cyph_Anon_15__Fun.__hx_current != null )) ? (haxe.root.Cyph_Anon_15__Fun.__hx_current) : (haxe.root.Cyph_Anon_15__Fun.__hx_current = ((haxe.root.Cyph_Anon_15__Fun) (new haxe.root.Cyph_Anon_15__Fun()) )) ))) );
		//line 19 "/cyph/Cyph.hx"
		haxe.root.Cyph.services = new haxe.lang.DynamicObject(new java.lang.String[]{"backend", "chat", "telehealth", "video", "voice"}, new java.lang.Object[]{"https://api.cyph.com", "https://cyph.im/#", "https://cyph.healthcare/#", "https://cyph.video/#", "https://cyph.audio/#"}, new java.lang.String[]{}, new double[]{});
		//line 27 "/cyph/Cyph.hx"
		haxe.root.Cyph.options = new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{"disableP2P", "modestBranding", "telehealth", "video", "voice"}, new double[]{((double) (((double) (1) )) ), ((double) (((double) (2) )) ), ((double) (((double) (3) )) ), ((double) (((double) (4) )) ), ((double) (((double) (5) )) )});
	}
	
	public Cyph(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Cyph()
	{
		//line 7 "/cyph/Cyph.hx"
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
		//line 36 "/cyph/Cyph.hx"
		int byteLength = ( length * 4 );
		//line 37 "/cyph/Cyph.hx"
		haxe.io.Bytes randomBytes = haxe.root.SecureRandom.getSecureRandomBytes(byteLength);
		//line 38 "/cyph/Cyph.hx"
		haxe.io.ArrayBufferViewImpl randomNumbers = haxe.io._UInt32Array.UInt32Array_Impl_.fromBytes(randomBytes, null, null);
		//line 40 "/cyph/Cyph.hx"
		{
			//line 40 "/cyph/Cyph.hx"
			int _g = 0;
			//line 40 "/cyph/Cyph.hx"
			while (( _g < length ))
			{
				//line 40 "/cyph/Cyph.hx"
				int i = _g++;
				//line 41 "/cyph/Cyph.hx"
				{
					//line 41 "/cyph/Cyph.hx"
					int __temp_stmt2 = 0;
					//line 41 "/cyph/Cyph.hx"
					{
						//line 42 "/cyph/Cyph.hx"
						double __temp_stmt4 = 0.0;
						//line 42 "/cyph/Cyph.hx"
						{
							//line 42 "/cyph/Cyph.hx"
							int _int = 0;
							//line 42 "/cyph/Cyph.hx"
							int __temp_stmt5 = 0;
							//line 42 "/cyph/Cyph.hx"
							{
								//line 42 "/cyph/Cyph.hx"
								haxe.io.Bytes _this = ((haxe.io.ArrayBufferViewImpl) (randomNumbers) ).bytes;
								//line 42 "/cyph/Cyph.hx"
								int pos = ( (( i << 2 )) + ((haxe.io.ArrayBufferViewImpl) (randomNumbers) ).byteOffset );
								//line 42 "/cyph/Cyph.hx"
								__temp_stmt5 = ( ( ( ( _this.b[pos] & 255 ) | ( (( _this.b[( pos + 1 )] & 255 )) << 8 ) ) | ( (( _this.b[( pos + 2 )] & 255 )) << 16 ) ) | ( (( _this.b[( pos + 3 )] & 255 )) << 24 ) );
							}
							
							//line 42 "/cyph/Cyph.hx"
							_int = ((int) (__temp_stmt5) );
							//line 42 "/cyph/Cyph.hx"
							__temp_stmt4 = ( (( _int < 0 )) ? (( 4294967296.0 + _int )) : (( _int + 0.0 )) );
						}
						
						//line 41 "/cyph/Cyph.hx"
						double __temp_stmt3 = java.lang.Math.floor(( ( __temp_stmt4 / 4294967296.0 ) * haxe.root.Cyph.addressSpace.length ));
						//line 41 "/cyph/Cyph.hx"
						double x = ((double) (((int) (__temp_stmt3) )) );
						//line 41 "/cyph/Cyph.hx"
						__temp_stmt2 = ((int) (x) );
					}
					
					//line 41 "/cyph/Cyph.hx"
					java.lang.Object __temp_stmt1 = haxe.root.Cyph.addressSpace.__get(__temp_stmt2);
					//line 41 "/cyph/Cyph.hx"
					int v = ((int) (haxe.lang.Runtime.toInt(__temp_stmt1)) );
					//line 41 "/cyph/Cyph.hx"
					randomBytes.b[i] = ((byte) (v) );
				}
				
			}
			
		}
		
		//line 46 "/cyph/Cyph.hx"
		java.lang.String guid = new haxe.io.BytesInput(randomBytes, 0, length).readString(length);
		//line 47 "/cyph/Cyph.hx"
		randomBytes.fill(0, byteLength, 0);
		//line 48 "/cyph/Cyph.hx"
		return guid;
	}
	
	
	public static void request(java.lang.String url, boolean post, haxe.root.Array<java.lang.Object> headers, haxe.root.Array<java.lang.Object> parameters, haxe.lang.Function onData, haxe.lang.Function onError)
	{
		//line 107 "/cyph/Cyph.hx"
		haxe.Http http = new haxe.Http(haxe.lang.Runtime.toString(url));
		//line 108 "/cyph/Cyph.hx"
		http.onData = onData;
		//line 109 "/cyph/Cyph.hx"
		http.onError = onError;
		//line 111 "/cyph/Cyph.hx"
		if (post) 
		{
			//line 112 "/cyph/Cyph.hx"
			http.setPostData("");
		}
		
		//line 115 "/cyph/Cyph.hx"
		{
			//line 115 "/cyph/Cyph.hx"
			int _g = 0;
			//line 115 "/cyph/Cyph.hx"
			while (( _g < headers.length ))
			{
				//line 115 "/cyph/Cyph.hx"
				java.lang.Object o = headers.__get(_g);
				//line 115 "/cyph/Cyph.hx"
				 ++ _g;
				//line 116 "/cyph/Cyph.hx"
				http.setHeader(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(o, "k", true)), haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(o, "v", true)));
			}
			
		}
		
		//line 119 "/cyph/Cyph.hx"
		{
			//line 119 "/cyph/Cyph.hx"
			int _g1 = 0;
			//line 119 "/cyph/Cyph.hx"
			while (( _g1 < parameters.length ))
			{
				//line 119 "/cyph/Cyph.hx"
				java.lang.Object o1 = parameters.__get(_g1);
				//line 119 "/cyph/Cyph.hx"
				 ++ _g1;
				//line 120 "/cyph/Cyph.hx"
				http.setParameter(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(o1, "k", true)), haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(o1, "v", true)));
			}
			
		}
		
		//line 123 "/cyph/Cyph.hx"
		http.request(post);
	}
	
	
	public static java.lang.Object generateLink(haxe.root.Array<java.lang.Object> options, java.lang.Object services)
	{
		//line 136 "/cyph/Cyph.hx"
		java.lang.String id = haxe.root.Cyph.generateGuid(7);
		//line 138 "/cyph/Cyph.hx"
		{
			//line 140 "/cyph/Cyph.hx"
			java.lang.String __temp_odecl1 = ( ( ( ( (( (( options.indexOf(((int) (haxe.lang.Runtime.getField_f(haxe.root.Cyph.options, "telehealth", true)) ), null) > -1 )) ? (haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(services, "telehealth", true))) : (( (( options.indexOf(((int) (haxe.lang.Runtime.getField_f(haxe.root.Cyph.options, "video", true)) ), null) > -1 )) ? (haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(services, "video", true))) : (( (( options.indexOf(((int) (haxe.lang.Runtime.getField_f(haxe.root.Cyph.options, "voice", true)) ), null) > -1 )) ? (haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(services, "voice", true))) : (haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(services, "chat", true))) )) )) )) + (( (( options.indexOf(((int) (haxe.lang.Runtime.getField_f(haxe.root.Cyph.options, "modestBranding", true)) ), null) > -1 )) ? ("!") : ("") )) ) + (( (( options.indexOf(((int) (haxe.lang.Runtime.getField_f(haxe.root.Cyph.options, "disableP2P", true)) ), null) > -1 )) ? ("$") : ("") )) ) + id ) + haxe.root.Cyph.generateGuid(19) );
			//line 138 "/cyph/Cyph.hx"
			return new haxe.lang.DynamicObject(new java.lang.String[]{"id", "link"}, new java.lang.Object[]{id, __temp_odecl1}, new java.lang.String[]{}, new double[]{});
		}
		
	}
	
	
	public static void initiateSession(java.lang.String apiKey, haxe.root.Array<java.lang.Object> options, java.lang.Object services, haxe.lang.Function onData, haxe.lang.Function onError)
	{
		//line 173 "/cyph/Cyph.hx"
		if (( options == null )) 
		{
			//line 174 "/cyph/Cyph.hx"
			options = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{});
		}
		else
		{
		}
		
		//line 182 "/cyph/Cyph.hx"
		if (( services == null )) 
		{
			//line 183 "/cyph/Cyph.hx"
			services = haxe.root.Cyph.services;
		}
		else
		{
		}
		
		//line 191 "/cyph/Cyph.hx"
		if (( haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(services, "backend", true)) == null )) 
		{
			//line 192 "/cyph/Cyph.hx"
			haxe.lang.Runtime.setField(services, "backend", haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(haxe.root.Cyph.services, "backend", true)));
		}
		
		//line 194 "/cyph/Cyph.hx"
		if (( haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(services, "telehealth", true)) == null )) 
		{
			//line 195 "/cyph/Cyph.hx"
			haxe.lang.Runtime.setField(services, "telehealth", ( haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(services, "chat", true)) + "video/" ));
		}
		
		//line 197 "/cyph/Cyph.hx"
		if (( haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(services, "video", true)) == null )) 
		{
			//line 198 "/cyph/Cyph.hx"
			haxe.lang.Runtime.setField(services, "video", ( haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(services, "chat", true)) + "video/" ));
		}
		
		//line 200 "/cyph/Cyph.hx"
		if (( haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(services, "voice", true)) == null )) 
		{
			//line 201 "/cyph/Cyph.hx"
			haxe.lang.Runtime.setField(services, "voice", ( haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(services, "chat", true)) + "audio/" ));
		}
		
		//line 204 "/cyph/Cyph.hx"
		java.lang.Object linkData = haxe.root.Cyph.generateLink(options, services);
		//line 206 "/cyph/Cyph.hx"
		haxe.root.Cyph.request(( ( haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(services, "backend", true)) + "/preauth/" ) + haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(linkData, "id", true)) ), true, new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{new haxe.lang.DynamicObject(new java.lang.String[]{"k", "v"}, new java.lang.Object[]{"Authorization", apiKey}, new java.lang.String[]{}, new double[]{})}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{}), new haxe.root.Cyph_initiateSession_211__Fun(onData, linkData), onError);
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 7 "/cyph/Cyph.hx"
		return new haxe.root.Cyph(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 7 "/cyph/Cyph.hx"
		return new haxe.root.Cyph();
	}
	
	
}


