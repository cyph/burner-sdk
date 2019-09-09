// Generated by Haxe 3.4.7
package haxe.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Input extends haxe.lang.HxObject
{
	public Input(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Input()
	{
		//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
		haxe.io.Input.__hx_ctor_haxe_io_Input(this);
	}
	
	
	public static void __hx_ctor_haxe_io_Input(haxe.io.Input __hx_this)
	{
	}
	
	
	public int readByte()
	{
		//line 53 "/usr/share/haxe/std/haxe/io/Input.hx"
		throw haxe.lang.HaxeException.wrap("Not implemented");
	}
	
	
	public int readBytes(haxe.io.Bytes s, int pos, int len)
	{
		//line 65 "/usr/share/haxe/std/haxe/io/Input.hx"
		int k = len;
		//line 66 "/usr/share/haxe/std/haxe/io/Input.hx"
		byte[] b = s.b;
		//line 67 "/usr/share/haxe/std/haxe/io/Input.hx"
		if (( ( ( pos < 0 ) || ( len < 0 ) ) || ( ( pos + len ) > s.length ) )) 
		{
			//line 68 "/usr/share/haxe/std/haxe/io/Input.hx"
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.OutsideBounds);
		}
		
		//line 70 "/usr/share/haxe/std/haxe/io/Input.hx"
		try 
		{
			//line 70 "/usr/share/haxe/std/haxe/io/Input.hx"
			while (( k > 0 ))
			{
				//line 78 "/usr/share/haxe/std/haxe/io/Input.hx"
				b[pos] = ((byte) (this.readByte()) );
				//line 80 "/usr/share/haxe/std/haxe/io/Input.hx"
				 ++ pos;
				//line 81 "/usr/share/haxe/std/haxe/io/Input.hx"
				 -- k;
			}
			
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 70 "/usr/share/haxe/std/haxe/io/Input.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 83 "/usr/share/haxe/std/haxe/io/Input.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 83 "/usr/share/haxe/std/haxe/io/Input.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 83 "/usr/share/haxe/std/haxe/io/Input.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 83 "/usr/share/haxe/std/haxe/io/Input.hx"
			if (( __temp_catchall2 instanceof haxe.io.Eof )) 
			{
				//line 83 "/usr/share/haxe/std/haxe/io/Input.hx"
				haxe.io.Eof eof = ((haxe.io.Eof) (__temp_catchall2) );
				//line 83 "/usr/share/haxe/std/haxe/io/Input.hx"
				{
				}
				
			}
			else
			{
				//line 83 "/usr/share/haxe/std/haxe/io/Input.hx"
				throw haxe.lang.HaxeException.wrap(__temp_catchallException1);
			}
			
		}
		
		
		//line 84 "/usr/share/haxe/std/haxe/io/Input.hx"
		return ( len - k );
	}
	
	
	public void readFullBytes(haxe.io.Bytes s, int pos, int len)
	{
		//line 135 "/usr/share/haxe/std/haxe/io/Input.hx"
		while (( len > 0 ))
		{
			//line 136 "/usr/share/haxe/std/haxe/io/Input.hx"
			int k = this.readBytes(s, pos, len);
			//line 137 "/usr/share/haxe/std/haxe/io/Input.hx"
			if (( k == 0 )) 
			{
				//line 138 "/usr/share/haxe/std/haxe/io/Input.hx"
				throw haxe.lang.HaxeException.wrap(haxe.io.Error.Blocked);
			}
			
			//line 139 "/usr/share/haxe/std/haxe/io/Input.hx"
			pos += k;
			//line 140 "/usr/share/haxe/std/haxe/io/Input.hx"
			len -= k;
		}
		
	}
	
	
	public java.lang.String readString(int len)
	{
		//line 304 "/usr/share/haxe/std/haxe/io/Input.hx"
		haxe.io.Bytes b = haxe.io.Bytes.alloc(len);
		//line 305 "/usr/share/haxe/std/haxe/io/Input.hx"
		this.readFullBytes(b, 0, len);
		//line 309 "/usr/share/haxe/std/haxe/io/Input.hx"
		return b.toString();
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
		{
			//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
			boolean __temp_executeDef1 = true;
			//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
			switch (field.hashCode())
			{
				case -500196025:
				{
					//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
					if (field.equals("readString")) 
					{
						//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
						__temp_executeDef1 = false;
						//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readString")) );
					}
					
					//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
					break;
				}
				
				
				case -868060226:
				{
					//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
					if (field.equals("readByte")) 
					{
						//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
						__temp_executeDef1 = false;
						//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readByte")) );
					}
					
					//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
					break;
				}
				
				
				case 682499622:
				{
					//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
					if (field.equals("readFullBytes")) 
					{
						//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
						__temp_executeDef1 = false;
						//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readFullBytes")) );
					}
					
					//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
					break;
				}
				
				
				case -1140063115:
				{
					//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
					if (field.equals("readBytes")) 
					{
						//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
						__temp_executeDef1 = false;
						//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readBytes")) );
					}
					
					//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
					break;
				}
				
				
			}
			
			//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
			if (__temp_executeDef1) 
			{
				//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
		{
			//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
			boolean __temp_executeDef1 = true;
			//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
			switch (field.hashCode())
			{
				case -500196025:
				{
					//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
					if (field.equals("readString")) 
					{
						//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
						__temp_executeDef1 = false;
						//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
						return this.readString(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
					break;
				}
				
				
				case -868060226:
				{
					//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
					if (field.equals("readByte")) 
					{
						//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
						__temp_executeDef1 = false;
						//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
						return this.readByte();
					}
					
					//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
					break;
				}
				
				
				case 682499622:
				{
					//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
					if (field.equals("readFullBytes")) 
					{
						//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
						__temp_executeDef1 = false;
						//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
						this.readFullBytes(((haxe.io.Bytes) (dynargs.__get(0)) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(2))) ));
					}
					
					//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
					break;
				}
				
				
				case -1140063115:
				{
					//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
					if (field.equals("readBytes")) 
					{
						//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
						__temp_executeDef1 = false;
						//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
						return this.readBytes(((haxe.io.Bytes) (dynargs.__get(0)) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(2))) ));
					}
					
					//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
					break;
				}
				
				
			}
			
			//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
			if (__temp_executeDef1) 
			{
				//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 31 "/usr/share/haxe/std/haxe/io/Input.hx"
		return null;
	}
	
	
}


