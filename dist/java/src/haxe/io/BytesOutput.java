package haxe.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class BytesOutput extends haxe.io.Output
{
	public BytesOutput(haxe.lang.EmptyObject empty)
	{
		//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public BytesOutput()
	{
		//line 35 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
		haxe.io.BytesOutput.__hx_ctor_haxe_io_BytesOutput(this);
	}
	
	
	public static void __hx_ctor_haxe_io_BytesOutput(haxe.io.BytesOutput __temp_me22)
	{
		//line 40 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
		__temp_me22.b = new haxe.io.BytesBuffer();
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
		return new haxe.io.BytesOutput(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
		return new haxe.io.BytesOutput();
	}
	
	
	public haxe.io.BytesBuffer b;
	
	
	
	@Override public void writeByte(int c)
	{
		//line 55 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
		try 
		{
			//line 55 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
			this.b.b.write(((int) (c) ));
		}
		catch (java.lang.Throwable typedException)
		{
			//line 51 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
			throw haxe.lang.HaxeException.wrap(typedException);
		}
		
		
	}
	
	
	@Override public int writeBytes(haxe.io.Bytes buf, int pos, int len)
	{
		//line 59 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
		try 
		{
			//line 64 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
			{
				//line 64 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
				if (( ( ( pos < 0 ) || ( len < 0 ) ) || ( ( pos + len ) > buf.length ) )) 
				{
					//line 64 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
					throw haxe.lang.HaxeException.wrap(haxe.io.Error.OutsideBounds);
				}
				
				//line 64 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
				this.b.b.write(((byte[]) (buf.b) ), ((int) (pos) ), ((int) (len) ));
			}
			
			//line 66 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
			return len;
		}
		catch (java.lang.Throwable typedException)
		{
			//line 59 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
			throw haxe.lang.HaxeException.wrap(typedException);
		}
		
		
	}
	
	
	public haxe.io.Bytes getBytes()
	{
		//line 131 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
		return this.b.getBytes();
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
		{
			//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
			switch (field.hashCode())
			{
				case 98:
				{
					//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
					if (field.equals("b")) 
					{
						//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
						this.b = ((haxe.io.BytesBuffer) (value) );
						//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
						return value;
					}
					
					//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
					break;
				}
				
				
			}
			
			//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
		{
			//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
			switch (field.hashCode())
			{
				case 1950049973:
				{
					//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
					if (field.equals("getBytes")) 
					{
						//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getBytes")) );
					}
					
					//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
					break;
				}
				
				
				case 98:
				{
					//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
					if (field.equals("b")) 
					{
						//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
						return this.b;
					}
					
					//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
					break;
				}
				
				
				case -662729780:
				{
					//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
					if (field.equals("writeBytes")) 
					{
						//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "writeBytes")) );
					}
					
					//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
					break;
				}
				
				
				case -1406851705:
				{
					//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
					if (field.equals("writeByte")) 
					{
						//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "writeByte")) );
					}
					
					//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
					break;
				}
				
				
			}
			
			//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
		{
			//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
			int __temp_hash2 = field.hashCode();
			//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
			switch (__temp_hash2)
			{
				case -662729780:
				case -1406851705:
				{
					//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
					if (( (( ( __temp_hash2 == -662729780 ) && field.equals("writeBytes") )) || field.equals("writeByte") )) 
					{
						//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
						return haxe.lang.Runtime.slowCallField(this, field, dynargs);
					}
					
					//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
					break;
				}
				
				
				case 1950049973:
				{
					//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
					if (field.equals("getBytes")) 
					{
						//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
						return this.getBytes();
					}
					
					//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
					break;
				}
				
				
			}
			
			//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
		baseArr.push("length");
		//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
		baseArr.push("b");
		//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
		{
			//line 24 "/usr/share/haxe/std/haxe/io/BytesOutput.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


