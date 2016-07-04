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
		//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
		haxe.io.Input.__hx_ctor_haxe_io_Input(this);
	}
	
	
	public static void __hx_ctor_haxe_io_Input(haxe.io.Input __temp_me11)
	{
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
		return new haxe.io.Input(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
		return new haxe.io.Input();
	}
	
	
	public int readByte()
	{
		//line 50 "/usr/share/haxe/std/haxe/io/Input.hx"
		throw haxe.lang.HaxeException.wrap("Not implemented");
	}
	
	
	public int readBytes(haxe.io.Bytes s, int pos, int len)
	{
		//line 62 "/usr/share/haxe/std/haxe/io/Input.hx"
		int k = len;
		//line 63 "/usr/share/haxe/std/haxe/io/Input.hx"
		byte[] b = s.b;
		//line 64 "/usr/share/haxe/std/haxe/io/Input.hx"
		if (( ( ( pos < 0 ) || ( len < 0 ) ) || ( ( pos + len ) > s.length ) )) 
		{
			//line 65 "/usr/share/haxe/std/haxe/io/Input.hx"
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.OutsideBounds);
		}
		
		//line 66 "/usr/share/haxe/std/haxe/io/Input.hx"
		while (( k > 0 ))
		{
			//line 74 "/usr/share/haxe/std/haxe/io/Input.hx"
			b[pos] = ((byte) (this.readByte()) );
			//line 76 "/usr/share/haxe/std/haxe/io/Input.hx"
			pos++;
			//line 77 "/usr/share/haxe/std/haxe/io/Input.hx"
			k--;
		}
		
		//line 79 "/usr/share/haxe/std/haxe/io/Input.hx"
		return len;
	}
	
	
	public void readFullBytes(haxe.io.Bytes s, int pos, int len)
	{
		//line 131 "/usr/share/haxe/std/haxe/io/Input.hx"
		while (( len > 0 ))
		{
			//line 132 "/usr/share/haxe/std/haxe/io/Input.hx"
			int k = this.readBytes(s, pos, len);
			//line 133 "/usr/share/haxe/std/haxe/io/Input.hx"
			pos += k;
			//line 134 "/usr/share/haxe/std/haxe/io/Input.hx"
			len -= k;
		}
		
	}
	
	
	public java.lang.String readString(int len)
	{
		//line 295 "/usr/share/haxe/std/haxe/io/Input.hx"
		haxe.io.Bytes b = haxe.io.Bytes.alloc(len);
		//line 296 "/usr/share/haxe/std/haxe/io/Input.hx"
		this.readFullBytes(b, 0, len);
		//line 300 "/usr/share/haxe/std/haxe/io/Input.hx"
		return b.toString();
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
		{
			//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
			switch (field.hashCode())
			{
				case -500196025:
				{
					//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
					if (field.equals("readString")) 
					{
						//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
						__temp_executeDef1 = false;
						//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readString")) );
					}
					
					//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
					break;
				}
				
				
				case -868060226:
				{
					//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
					if (field.equals("readByte")) 
					{
						//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
						__temp_executeDef1 = false;
						//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readByte")) );
					}
					
					//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
					break;
				}
				
				
				case 682499622:
				{
					//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
					if (field.equals("readFullBytes")) 
					{
						//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
						__temp_executeDef1 = false;
						//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readFullBytes")) );
					}
					
					//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
					break;
				}
				
				
				case -1140063115:
				{
					//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
					if (field.equals("readBytes")) 
					{
						//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
						__temp_executeDef1 = false;
						//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readBytes")) );
					}
					
					//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
					break;
				}
				
				
			}
			
			//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
		{
			//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
			switch (field.hashCode())
			{
				case -500196025:
				{
					//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
					if (field.equals("readString")) 
					{
						//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
						__temp_executeDef1 = false;
						//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
						return this.readString(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
					break;
				}
				
				
				case -868060226:
				{
					//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
					if (field.equals("readByte")) 
					{
						//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
						__temp_executeDef1 = false;
						//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
						return this.readByte();
					}
					
					//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
					break;
				}
				
				
				case 682499622:
				{
					//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
					if (field.equals("readFullBytes")) 
					{
						//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
						__temp_executeDef1 = false;
						//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
						this.readFullBytes(((haxe.io.Bytes) (dynargs.__get(0)) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(2))) ));
					}
					
					//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
					break;
				}
				
				
				case -1140063115:
				{
					//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
					if (field.equals("readBytes")) 
					{
						//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
						__temp_executeDef1 = false;
						//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
						return this.readBytes(((haxe.io.Bytes) (dynargs.__get(0)) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(2))) ));
					}
					
					//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
					break;
				}
				
				
			}
			
			//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 28 "/usr/share/haxe/std/haxe/io/Input.hx"
		return null;
	}
	
	
}


