// Generated by Haxe 3.4.7
package haxe.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class BytesBuffer extends haxe.lang.HxObject
{
	public BytesBuffer(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public BytesBuffer()
	{
		//line 45 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
		haxe.io.BytesBuffer.__hx_ctor_haxe_io_BytesBuffer(this);
	}
	
	
	public static void __hx_ctor_haxe_io_BytesBuffer(haxe.io.BytesBuffer __hx_this)
	{
		//line 58 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
		__hx_this.b = new java.io.ByteArrayOutputStream();
	}
	
	
	public java.io.ByteArrayOutputStream b;
	
	
	
	public haxe.io.Bytes getBytes()
	{
		//line 204 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
		byte[] buf = this.b.toByteArray();
		//line 205 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
		haxe.io.Bytes bytes = new haxe.io.Bytes(buf.length, buf);
		//line 214 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
		this.b = null;
		//line 215 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
		return bytes;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
		{
			//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
			switch (field.hashCode())
			{
				case 98:
				{
					//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
					if (field.equals("b")) 
					{
						//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
						this.b = ((java.io.ByteArrayOutputStream) (value) );
						//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
						return value;
					}
					
					//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
					break;
				}
				
				
			}
			
			//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
		{
			//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
			switch (field.hashCode())
			{
				case 1950049973:
				{
					//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
					if (field.equals("getBytes")) 
					{
						//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getBytes")) );
					}
					
					//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
					break;
				}
				
				
				case 98:
				{
					//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
					if (field.equals("b")) 
					{
						//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
						return this.b;
					}
					
					//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
					break;
				}
				
				
			}
			
			//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
		{
			//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
			switch (field.hashCode())
			{
				case 1950049973:
				{
					//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
					if (field.equals("getBytes")) 
					{
						//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
						return this.getBytes();
					}
					
					//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
					break;
				}
				
				
			}
			
			//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
		baseArr.push("length");
		//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
		baseArr.push("b");
		//line 24 "/usr/share/haxe/std/haxe/io/BytesBuffer.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


