package sys.net;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Host extends haxe.lang.HxObject
{
	public Host(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Host(java.lang.String name)
	{
		//line 30 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
		sys.net.Host.__hx_ctor_sys_net_Host(this, name);
	}
	
	
	public static void __hx_ctor_sys_net_Host(sys.net.Host __temp_me35, java.lang.String name)
	{
		//line 33 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
		try 
		{
			//line 33 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
			__temp_me35.wrapped = java.net.InetAddress.getByName(haxe.lang.Runtime.toString(name));
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 33 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 34 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 34 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 34 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 34 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
			{
				//line 34 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
				java.lang.Object e = __temp_catchall2;
				//line 34 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
				throw haxe.lang.HaxeException.wrap(e);
			}
			
		}
		
		
		//line 35 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
		byte[] rawIp = __temp_me35.wrapped.getAddress();
		//line 37 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
		__temp_me35.ip = ( ( ( ((int) (rawIp[3]) ) | ( ((int) (rawIp[2]) ) << 8 ) ) | ( ((int) (rawIp[1]) ) << 16 ) ) | ( ((int) (rawIp[0]) ) << 24 ) );
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
		return new sys.net.Host(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
		return new sys.net.Host(haxe.lang.Runtime.toString(arr.__get(0)));
	}
	
	
	public int ip;
	
	public java.net.InetAddress wrapped;
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
		{
			//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
			boolean __temp_executeDef1 = true;
			//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
			switch (field.hashCode())
			{
				case 3367:
				{
					//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
					if (field.equals("ip")) 
					{
						//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
						__temp_executeDef1 = false;
						//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
						this.ip = ((int) (value) );
						//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
						return value;
					}
					
					//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
					break;
				}
				
				
			}
			
			//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
			if (__temp_executeDef1) 
			{
				//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
		{
			//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
			boolean __temp_executeDef1 = true;
			//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
			switch (field.hashCode())
			{
				case 1595507845:
				{
					//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
					if (field.equals("wrapped")) 
					{
						//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
						__temp_executeDef1 = false;
						//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
						this.wrapped = ((java.net.InetAddress) (value) );
						//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
						return value;
					}
					
					//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
					break;
				}
				
				
				case 3367:
				{
					//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
					if (field.equals("ip")) 
					{
						//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
						__temp_executeDef1 = false;
						//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
						this.ip = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
						return value;
					}
					
					//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
					break;
				}
				
				
			}
			
			//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
			if (__temp_executeDef1) 
			{
				//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
		{
			//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
			boolean __temp_executeDef1 = true;
			//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
			switch (field.hashCode())
			{
				case 1595507845:
				{
					//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
					if (field.equals("wrapped")) 
					{
						//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
						__temp_executeDef1 = false;
						//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
						return this.wrapped;
					}
					
					//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
					break;
				}
				
				
				case 3367:
				{
					//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
					if (field.equals("ip")) 
					{
						//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
						__temp_executeDef1 = false;
						//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
						return this.ip;
					}
					
					//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
					break;
				}
				
				
			}
			
			//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
			if (__temp_executeDef1) 
			{
				//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
		{
			//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
			boolean __temp_executeDef1 = true;
			//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
			switch (field.hashCode())
			{
				case 3367:
				{
					//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
					if (field.equals("ip")) 
					{
						//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
						__temp_executeDef1 = false;
						//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
						return ((double) (this.ip) );
					}
					
					//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
					break;
				}
				
				
			}
			
			//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
			if (__temp_executeDef1) 
			{
				//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
		baseArr.push("wrapped");
		//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
		baseArr.push("ip");
		//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
		{
			//line 25 "/usr/share/haxe/std/java/_std/sys/net/Host.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


