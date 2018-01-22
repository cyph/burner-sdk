package _List;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ListIterator<T> extends haxe.lang.HxObject
{
	public ListIterator(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ListIterator(haxe.root.Array head)
	{
		//line 244 "/usr/share/haxe/std/List.hx"
		_List.ListIterator.__hx_ctor__List_ListIterator(this, head);
	}
	
	
	public static <T_c> void __hx_ctor__List_ListIterator(_List.ListIterator<T_c> __temp_me7, haxe.root.Array head)
	{
		//line 245 "/usr/share/haxe/std/List.hx"
		__temp_me7.head = head;
		//line 246 "/usr/share/haxe/std/List.hx"
		__temp_me7.val = null;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 240 "/usr/share/haxe/std/List.hx"
		return new _List.ListIterator<java.lang.Object>(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 240 "/usr/share/haxe/std/List.hx"
		return new _List.ListIterator<java.lang.Object>(((haxe.root.Array) (arr.__get(0)) ));
	}
	
	
	public haxe.root.Array head;
	
	public java.lang.Object val;
	
	public final boolean hasNext()
	{
		//line 250 "/usr/share/haxe/std/List.hx"
		return ( this.head != null );
	}
	
	
	public final T next()
	{
		//line 254 "/usr/share/haxe/std/List.hx"
		this.val = this.head.__get(0);
		//line 255 "/usr/share/haxe/std/List.hx"
		this.head = ((haxe.root.Array) (this.head.__get(1)) );
		//line 256 "/usr/share/haxe/std/List.hx"
		return ((T) (this.val) );
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 240 "/usr/share/haxe/std/List.hx"
		{
			//line 240 "/usr/share/haxe/std/List.hx"
			boolean __temp_executeDef1 = true;
			//line 240 "/usr/share/haxe/std/List.hx"
			switch (field.hashCode())
			{
				case 116513:
				{
					//line 240 "/usr/share/haxe/std/List.hx"
					if (field.equals("val")) 
					{
						//line 240 "/usr/share/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 240 "/usr/share/haxe/std/List.hx"
						this.val = ((java.lang.Object) (value) );
						//line 240 "/usr/share/haxe/std/List.hx"
						return value;
					}
					
					//line 240 "/usr/share/haxe/std/List.hx"
					break;
				}
				
				
			}
			
			//line 240 "/usr/share/haxe/std/List.hx"
			if (__temp_executeDef1) 
			{
				//line 240 "/usr/share/haxe/std/List.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 240 "/usr/share/haxe/std/List.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 240 "/usr/share/haxe/std/List.hx"
		{
			//line 240 "/usr/share/haxe/std/List.hx"
			boolean __temp_executeDef1 = true;
			//line 240 "/usr/share/haxe/std/List.hx"
			switch (field.hashCode())
			{
				case 116513:
				{
					//line 240 "/usr/share/haxe/std/List.hx"
					if (field.equals("val")) 
					{
						//line 240 "/usr/share/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 240 "/usr/share/haxe/std/List.hx"
						this.val = ((java.lang.Object) (value) );
						//line 240 "/usr/share/haxe/std/List.hx"
						return value;
					}
					
					//line 240 "/usr/share/haxe/std/List.hx"
					break;
				}
				
				
				case 3198432:
				{
					//line 240 "/usr/share/haxe/std/List.hx"
					if (field.equals("head")) 
					{
						//line 240 "/usr/share/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 240 "/usr/share/haxe/std/List.hx"
						this.head = ((haxe.root.Array) (value) );
						//line 240 "/usr/share/haxe/std/List.hx"
						return value;
					}
					
					//line 240 "/usr/share/haxe/std/List.hx"
					break;
				}
				
				
			}
			
			//line 240 "/usr/share/haxe/std/List.hx"
			if (__temp_executeDef1) 
			{
				//line 240 "/usr/share/haxe/std/List.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 240 "/usr/share/haxe/std/List.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 240 "/usr/share/haxe/std/List.hx"
		{
			//line 240 "/usr/share/haxe/std/List.hx"
			boolean __temp_executeDef1 = true;
			//line 240 "/usr/share/haxe/std/List.hx"
			switch (field.hashCode())
			{
				case 3377907:
				{
					//line 240 "/usr/share/haxe/std/List.hx"
					if (field.equals("next")) 
					{
						//line 240 "/usr/share/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 240 "/usr/share/haxe/std/List.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "next")) );
					}
					
					//line 240 "/usr/share/haxe/std/List.hx"
					break;
				}
				
				
				case 3198432:
				{
					//line 240 "/usr/share/haxe/std/List.hx"
					if (field.equals("head")) 
					{
						//line 240 "/usr/share/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 240 "/usr/share/haxe/std/List.hx"
						return this.head;
					}
					
					//line 240 "/usr/share/haxe/std/List.hx"
					break;
				}
				
				
				case 696759469:
				{
					//line 240 "/usr/share/haxe/std/List.hx"
					if (field.equals("hasNext")) 
					{
						//line 240 "/usr/share/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 240 "/usr/share/haxe/std/List.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "hasNext")) );
					}
					
					//line 240 "/usr/share/haxe/std/List.hx"
					break;
				}
				
				
				case 116513:
				{
					//line 240 "/usr/share/haxe/std/List.hx"
					if (field.equals("val")) 
					{
						//line 240 "/usr/share/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 240 "/usr/share/haxe/std/List.hx"
						return this.val;
					}
					
					//line 240 "/usr/share/haxe/std/List.hx"
					break;
				}
				
				
			}
			
			//line 240 "/usr/share/haxe/std/List.hx"
			if (__temp_executeDef1) 
			{
				//line 240 "/usr/share/haxe/std/List.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 240 "/usr/share/haxe/std/List.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 240 "/usr/share/haxe/std/List.hx"
		{
			//line 240 "/usr/share/haxe/std/List.hx"
			boolean __temp_executeDef1 = true;
			//line 240 "/usr/share/haxe/std/List.hx"
			switch (field.hashCode())
			{
				case 116513:
				{
					//line 240 "/usr/share/haxe/std/List.hx"
					if (field.equals("val")) 
					{
						//line 240 "/usr/share/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 240 "/usr/share/haxe/std/List.hx"
						return ((double) (haxe.lang.Runtime.toDouble(this.val)) );
					}
					
					//line 240 "/usr/share/haxe/std/List.hx"
					break;
				}
				
				
			}
			
			//line 240 "/usr/share/haxe/std/List.hx"
			if (__temp_executeDef1) 
			{
				//line 240 "/usr/share/haxe/std/List.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 240 "/usr/share/haxe/std/List.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 240 "/usr/share/haxe/std/List.hx"
		{
			//line 240 "/usr/share/haxe/std/List.hx"
			boolean __temp_executeDef1 = true;
			//line 240 "/usr/share/haxe/std/List.hx"
			switch (field.hashCode())
			{
				case 3377907:
				{
					//line 240 "/usr/share/haxe/std/List.hx"
					if (field.equals("next")) 
					{
						//line 240 "/usr/share/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 240 "/usr/share/haxe/std/List.hx"
						return this.next();
					}
					
					//line 240 "/usr/share/haxe/std/List.hx"
					break;
				}
				
				
				case 696759469:
				{
					//line 240 "/usr/share/haxe/std/List.hx"
					if (field.equals("hasNext")) 
					{
						//line 240 "/usr/share/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 240 "/usr/share/haxe/std/List.hx"
						return this.hasNext();
					}
					
					//line 240 "/usr/share/haxe/std/List.hx"
					break;
				}
				
				
			}
			
			//line 240 "/usr/share/haxe/std/List.hx"
			if (__temp_executeDef1) 
			{
				//line 240 "/usr/share/haxe/std/List.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 240 "/usr/share/haxe/std/List.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 240 "/usr/share/haxe/std/List.hx"
		baseArr.push("val");
		//line 240 "/usr/share/haxe/std/List.hx"
		baseArr.push("head");
		//line 240 "/usr/share/haxe/std/List.hx"
		{
			//line 240 "/usr/share/haxe/std/List.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


