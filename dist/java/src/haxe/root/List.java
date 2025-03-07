// Generated by Haxe 3.4.7
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class List<T> extends haxe.lang.HxObject
{
	public List(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public List()
	{
		//line 43 "/usr/share/haxe/std/List.hx"
		haxe.root.List.__hx_ctor__List(((haxe.root.List<T>) (this) ));
	}
	
	
	public static <T_c> void __hx_ctor__List(haxe.root.List<T_c> __hx_this)
	{
		//line 44 "/usr/share/haxe/std/List.hx"
		__hx_this.length = 0;
	}
	
	
	public _List.ListNode<T> h;
	
	public _List.ListNode<T> q;
	
	public int length;
	
	public void add(T item)
	{
		//line 53 "/usr/share/haxe/std/List.hx"
		_List.ListNode<T> x = new _List.ListNode<T>(item, null);
		//line 54 "/usr/share/haxe/std/List.hx"
		if (( this.h == null )) 
		{
			//line 55 "/usr/share/haxe/std/List.hx"
			this.h = x;
		}
		else
		{
			//line 57 "/usr/share/haxe/std/List.hx"
			this.q.next = x;
		}
		
		//line 58 "/usr/share/haxe/std/List.hx"
		this.q = x;
		//line 59 "/usr/share/haxe/std/List.hx"
		this.length++;
	}
	
	
	public void push(T item)
	{
		//line 68 "/usr/share/haxe/std/List.hx"
		_List.ListNode<T> x = new _List.ListNode<T>(item, this.h);
		//line 69 "/usr/share/haxe/std/List.hx"
		this.h = x;
		//line 70 "/usr/share/haxe/std/List.hx"
		if (( this.q == null )) 
		{
			//line 71 "/usr/share/haxe/std/List.hx"
			this.q = x;
		}
		
		//line 72 "/usr/share/haxe/std/List.hx"
		this.length++;
	}
	
	
	public final _List.ListIterator<T> iterator()
	{
		//line 161 "/usr/share/haxe/std/List.hx"
		return new _List.ListIterator<T>(((_List.ListNode<T>) (this.h) ));
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 30 "/usr/share/haxe/std/List.hx"
		{
			//line 30 "/usr/share/haxe/std/List.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "/usr/share/haxe/std/List.hx"
			switch (field.hashCode())
			{
				case -1106363674:
				{
					//line 30 "/usr/share/haxe/std/List.hx"
					if (field.equals("length")) 
					{
						//line 30 "/usr/share/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/share/haxe/std/List.hx"
						this.length = ((int) (value) );
						//line 30 "/usr/share/haxe/std/List.hx"
						return value;
					}
					
					//line 30 "/usr/share/haxe/std/List.hx"
					break;
				}
				
				
			}
			
			//line 30 "/usr/share/haxe/std/List.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "/usr/share/haxe/std/List.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 30 "/usr/share/haxe/std/List.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 30 "/usr/share/haxe/std/List.hx"
		{
			//line 30 "/usr/share/haxe/std/List.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "/usr/share/haxe/std/List.hx"
			switch (field.hashCode())
			{
				case -1106363674:
				{
					//line 30 "/usr/share/haxe/std/List.hx"
					if (field.equals("length")) 
					{
						//line 30 "/usr/share/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/share/haxe/std/List.hx"
						this.length = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 30 "/usr/share/haxe/std/List.hx"
						return value;
					}
					
					//line 30 "/usr/share/haxe/std/List.hx"
					break;
				}
				
				
				case 104:
				{
					//line 30 "/usr/share/haxe/std/List.hx"
					if (field.equals("h")) 
					{
						//line 30 "/usr/share/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/share/haxe/std/List.hx"
						this.h = ((_List.ListNode<T>) (value) );
						//line 30 "/usr/share/haxe/std/List.hx"
						return value;
					}
					
					//line 30 "/usr/share/haxe/std/List.hx"
					break;
				}
				
				
				case 113:
				{
					//line 30 "/usr/share/haxe/std/List.hx"
					if (field.equals("q")) 
					{
						//line 30 "/usr/share/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/share/haxe/std/List.hx"
						this.q = ((_List.ListNode<T>) (value) );
						//line 30 "/usr/share/haxe/std/List.hx"
						return value;
					}
					
					//line 30 "/usr/share/haxe/std/List.hx"
					break;
				}
				
				
			}
			
			//line 30 "/usr/share/haxe/std/List.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "/usr/share/haxe/std/List.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 30 "/usr/share/haxe/std/List.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 30 "/usr/share/haxe/std/List.hx"
		{
			//line 30 "/usr/share/haxe/std/List.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "/usr/share/haxe/std/List.hx"
			switch (field.hashCode())
			{
				case 1182533742:
				{
					//line 30 "/usr/share/haxe/std/List.hx"
					if (field.equals("iterator")) 
					{
						//line 30 "/usr/share/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/share/haxe/std/List.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "iterator")) );
					}
					
					//line 30 "/usr/share/haxe/std/List.hx"
					break;
				}
				
				
				case 104:
				{
					//line 30 "/usr/share/haxe/std/List.hx"
					if (field.equals("h")) 
					{
						//line 30 "/usr/share/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/share/haxe/std/List.hx"
						return this.h;
					}
					
					//line 30 "/usr/share/haxe/std/List.hx"
					break;
				}
				
				
				case 3452698:
				{
					//line 30 "/usr/share/haxe/std/List.hx"
					if (field.equals("push")) 
					{
						//line 30 "/usr/share/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/share/haxe/std/List.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "push")) );
					}
					
					//line 30 "/usr/share/haxe/std/List.hx"
					break;
				}
				
				
				case 113:
				{
					//line 30 "/usr/share/haxe/std/List.hx"
					if (field.equals("q")) 
					{
						//line 30 "/usr/share/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/share/haxe/std/List.hx"
						return this.q;
					}
					
					//line 30 "/usr/share/haxe/std/List.hx"
					break;
				}
				
				
				case 96417:
				{
					//line 30 "/usr/share/haxe/std/List.hx"
					if (field.equals("add")) 
					{
						//line 30 "/usr/share/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/share/haxe/std/List.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "add")) );
					}
					
					//line 30 "/usr/share/haxe/std/List.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 30 "/usr/share/haxe/std/List.hx"
					if (field.equals("length")) 
					{
						//line 30 "/usr/share/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/share/haxe/std/List.hx"
						return this.length;
					}
					
					//line 30 "/usr/share/haxe/std/List.hx"
					break;
				}
				
				
			}
			
			//line 30 "/usr/share/haxe/std/List.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "/usr/share/haxe/std/List.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 30 "/usr/share/haxe/std/List.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 30 "/usr/share/haxe/std/List.hx"
		{
			//line 30 "/usr/share/haxe/std/List.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "/usr/share/haxe/std/List.hx"
			switch (field.hashCode())
			{
				case -1106363674:
				{
					//line 30 "/usr/share/haxe/std/List.hx"
					if (field.equals("length")) 
					{
						//line 30 "/usr/share/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/share/haxe/std/List.hx"
						return ((double) (this.length) );
					}
					
					//line 30 "/usr/share/haxe/std/List.hx"
					break;
				}
				
				
			}
			
			//line 30 "/usr/share/haxe/std/List.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "/usr/share/haxe/std/List.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 30 "/usr/share/haxe/std/List.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 30 "/usr/share/haxe/std/List.hx"
		{
			//line 30 "/usr/share/haxe/std/List.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "/usr/share/haxe/std/List.hx"
			switch (field.hashCode())
			{
				case 1182533742:
				{
					//line 30 "/usr/share/haxe/std/List.hx"
					if (field.equals("iterator")) 
					{
						//line 30 "/usr/share/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/share/haxe/std/List.hx"
						return this.iterator();
					}
					
					//line 30 "/usr/share/haxe/std/List.hx"
					break;
				}
				
				
				case 96417:
				{
					//line 30 "/usr/share/haxe/std/List.hx"
					if (field.equals("add")) 
					{
						//line 30 "/usr/share/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/share/haxe/std/List.hx"
						this.add(((T) (dynargs.__get(0)) ));
					}
					
					//line 30 "/usr/share/haxe/std/List.hx"
					break;
				}
				
				
				case 3452698:
				{
					//line 30 "/usr/share/haxe/std/List.hx"
					if (field.equals("push")) 
					{
						//line 30 "/usr/share/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/share/haxe/std/List.hx"
						this.push(((T) (dynargs.__get(0)) ));
					}
					
					//line 30 "/usr/share/haxe/std/List.hx"
					break;
				}
				
				
			}
			
			//line 30 "/usr/share/haxe/std/List.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "/usr/share/haxe/std/List.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 30 "/usr/share/haxe/std/List.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 30 "/usr/share/haxe/std/List.hx"
		baseArr.push("length");
		//line 30 "/usr/share/haxe/std/List.hx"
		baseArr.push("q");
		//line 30 "/usr/share/haxe/std/List.hx"
		baseArr.push("h");
		//line 30 "/usr/share/haxe/std/List.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


