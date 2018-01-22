package haxe.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class BytesInput extends haxe.io.Input
{
	public BytesInput(haxe.lang.EmptyObject empty)
	{
		//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public BytesInput(haxe.io.Bytes b, java.lang.Object pos, java.lang.Object len)
	{
		//line 38 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		haxe.io.BytesInput.__hx_ctor_haxe_io_BytesInput(this, b, pos, len);
	}
	
	
	public static void __hx_ctor_haxe_io_BytesInput(haxe.io.BytesInput __temp_me20, haxe.io.Bytes b, java.lang.Object pos, java.lang.Object len)
	{
		//line 39 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		if (haxe.lang.Runtime.eq(pos, null)) 
		{
			//line 39 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
			pos = 0;
		}
		
		//line 40 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		if (haxe.lang.Runtime.eq(len, null)) 
		{
			//line 40 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
			len = ( ((int) (b.length) ) - ((int) (haxe.lang.Runtime.toInt(pos)) ) );
		}
		
		//line 41 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		if (( ( ( haxe.lang.Runtime.compare(pos, 0) < 0 ) || ( haxe.lang.Runtime.compare(len, 0) < 0 ) ) || ( ( ((int) (haxe.lang.Runtime.toInt(pos)) ) + ((int) (haxe.lang.Runtime.toInt(len)) ) ) > b.length ) )) 
		{
			//line 41 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.OutsideBounds);
		}
		
		//line 53 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		__temp_me20.b = b.b;
		//line 54 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		__temp_me20.pos = ((int) (haxe.lang.Runtime.toInt(pos)) );
		//line 55 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		__temp_me20.len = ((int) (haxe.lang.Runtime.toInt(len)) );
		//line 56 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		__temp_me20.totlen = ((int) (haxe.lang.Runtime.toInt(len)) );
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		return new haxe.io.BytesInput(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		return new haxe.io.BytesInput(((haxe.io.Bytes) (arr.__get(0)) ), arr.__get(1), arr.__get(2));
	}
	
	
	public byte[] b;
	
	public int pos;
	
	public int len;
	
	public int totlen;
	
	
	
	
	
	@Override public int readByte()
	{
		//line 94 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		if (( this.len == 0 )) 
		{
			//line 95 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
			throw haxe.lang.HaxeException.wrap(new haxe.io.Eof());
		}
		
		//line 96 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		this.len--;
		//line 104 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		return ( this.b[this.pos++] & 255 );
	}
	
	
	@Override public int readBytes(haxe.io.Bytes buf, int pos, int len)
	{
		//line 113 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		if (( ( ( pos < 0 ) || ( len < 0 ) ) || ( ( pos + len ) > buf.length ) )) 
		{
			//line 114 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.OutsideBounds);
		}
		
		//line 121 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		int avail = this.len;
		//line 122 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		if (( len > avail )) 
		{
			//line 122 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
			len = avail;
		}
		
		//line 123 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		if (( len == 0 )) 
		{
			//line 124 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
			throw haxe.lang.HaxeException.wrap(new haxe.io.Eof());
		}
		
		//line 125 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		java.lang.System.arraycopy(((java.lang.Object) (this.b) ), ((int) (this.pos) ), ((java.lang.Object) (buf.b) ), ((int) (pos) ), ((int) (len) ));
		//line 126 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		this.pos += len;
		//line 127 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		this.len -= len;
		//line 154 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		return len;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		{
			//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
			switch (field.hashCode())
			{
				case -867912164:
				{
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("totlen")) 
					{
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						this.totlen = ((int) (value) );
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						return value;
					}
					
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
				case 111188:
				{
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("pos")) 
					{
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						this.pos = ((int) (value) );
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						return value;
					}
					
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
				case 107029:
				{
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("len")) 
					{
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						this.len = ((int) (value) );
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						return value;
					}
					
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
			}
			
			//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		{
			//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
			switch (field.hashCode())
			{
				case -867912164:
				{
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("totlen")) 
					{
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						this.totlen = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						return value;
					}
					
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
				case 98:
				{
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("b")) 
					{
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						this.b = ((byte[]) (value) );
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						return value;
					}
					
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
				case 107029:
				{
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("len")) 
					{
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						this.len = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						return value;
					}
					
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
				case 111188:
				{
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("pos")) 
					{
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						this.pos = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						return value;
					}
					
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
			}
			
			//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		{
			//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
			switch (field.hashCode())
			{
				case -1140063115:
				{
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("readBytes")) 
					{
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readBytes")) );
					}
					
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
				case 98:
				{
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("b")) 
					{
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						return this.b;
					}
					
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
				case -868060226:
				{
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("readByte")) 
					{
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readByte")) );
					}
					
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
				case 111188:
				{
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("pos")) 
					{
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						return this.pos;
					}
					
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
				case -867912164:
				{
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("totlen")) 
					{
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						return this.totlen;
					}
					
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
				case 107029:
				{
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("len")) 
					{
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						return this.len;
					}
					
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
			}
			
			//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		{
			//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
			switch (field.hashCode())
			{
				case -867912164:
				{
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("totlen")) 
					{
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						return ((double) (this.totlen) );
					}
					
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
				case 111188:
				{
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("pos")) 
					{
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						return ((double) (this.pos) );
					}
					
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
				case 107029:
				{
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("len")) 
					{
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
						return ((double) (this.len) );
					}
					
					//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
			}
			
			//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		baseArr.push("length");
		//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		baseArr.push("position");
		//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		baseArr.push("totlen");
		//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		baseArr.push("len");
		//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		baseArr.push("pos");
		//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		baseArr.push("b");
		//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
		{
			//line 24 "/usr/share/haxe/std/haxe/io/BytesInput.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


