package haxe.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ArrayBufferViewImpl extends haxe.lang.HxObject
{
	public ArrayBufferViewImpl(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ArrayBufferViewImpl(haxe.io.Bytes bytes, int pos, int length)
	{
		//line 9 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
		haxe.io.ArrayBufferViewImpl.__hx_ctor_haxe_io_ArrayBufferViewImpl(this, bytes, pos, length);
	}
	
	
	public static void __hx_ctor_haxe_io_ArrayBufferViewImpl(haxe.io.ArrayBufferViewImpl __temp_me15, haxe.io.Bytes bytes, int pos, int length)
	{
		//line 10 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
		__temp_me15.bytes = bytes;
		//line 11 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
		__temp_me15.byteOffset = pos;
		//line 12 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
		__temp_me15.byteLength = length;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
		return new haxe.io.ArrayBufferViewImpl(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
		return new haxe.io.ArrayBufferViewImpl(((haxe.io.Bytes) (arr.__get(0)) ), ((int) (haxe.lang.Runtime.toInt(arr.__get(1))) ), ((int) (haxe.lang.Runtime.toInt(arr.__get(2))) ));
	}
	
	
	public haxe.io.Bytes bytes;
	
	public int byteOffset;
	
	public int byteLength;
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
		{
			//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
			switch (field.hashCode())
			{
				case 281453070:
				{
					//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
					if (field.equals("byteLength")) 
					{
						//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
						this.byteLength = ((int) (value) );
						//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
						return value;
					}
					
					//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
					break;
				}
				
				
				case 368036795:
				{
					//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
					if (field.equals("byteOffset")) 
					{
						//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
						this.byteOffset = ((int) (value) );
						//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
						return value;
					}
					
					//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
					break;
				}
				
				
			}
			
			//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
		{
			//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
			switch (field.hashCode())
			{
				case 281453070:
				{
					//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
					if (field.equals("byteLength")) 
					{
						//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
						this.byteLength = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
						return value;
					}
					
					//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
					break;
				}
				
				
				case 94224491:
				{
					//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
					if (field.equals("bytes")) 
					{
						//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
						this.bytes = ((haxe.io.Bytes) (value) );
						//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
						return value;
					}
					
					//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
					break;
				}
				
				
				case 368036795:
				{
					//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
					if (field.equals("byteOffset")) 
					{
						//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
						this.byteOffset = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
						return value;
					}
					
					//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
					break;
				}
				
				
			}
			
			//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
		{
			//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
			switch (field.hashCode())
			{
				case 281453070:
				{
					//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
					if (field.equals("byteLength")) 
					{
						//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
						return this.byteLength;
					}
					
					//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
					break;
				}
				
				
				case 94224491:
				{
					//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
					if (field.equals("bytes")) 
					{
						//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
						return this.bytes;
					}
					
					//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
					break;
				}
				
				
				case 368036795:
				{
					//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
					if (field.equals("byteOffset")) 
					{
						//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
						return this.byteOffset;
					}
					
					//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
					break;
				}
				
				
			}
			
			//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
		{
			//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
			switch (field.hashCode())
			{
				case 281453070:
				{
					//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
					if (field.equals("byteLength")) 
					{
						//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
						return ((double) (this.byteLength) );
					}
					
					//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
					break;
				}
				
				
				case 368036795:
				{
					//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
					if (field.equals("byteOffset")) 
					{
						//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
						__temp_executeDef1 = false;
						//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
						return ((double) (this.byteOffset) );
					}
					
					//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
					break;
				}
				
				
			}
			
			//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
		baseArr.push("byteLength");
		//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
		baseArr.push("byteOffset");
		//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
		baseArr.push("bytes");
		//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
		{
			//line 5 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


