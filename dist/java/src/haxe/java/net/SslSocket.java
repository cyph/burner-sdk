// Generated by Haxe 3.4.7
package haxe.java.net;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class SslSocket extends sys.net.Socket
{
	public SslSocket(haxe.lang.EmptyObject empty)
	{
		//line 24 "/usr/share/haxe/std/java/net/SslSocket.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public SslSocket()
	{
		//line 37 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 37 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
		haxe.java.net.SslSocket.__hx_ctor_haxe_java_net_SslSocket(this);
	}
	
	
	public static void __hx_ctor_haxe_java_net_SslSocket(haxe.java.net.SslSocket __hx_this)
	{
		//line 37 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
		sys.net.Socket.__hx_ctor_sys_net_Socket(__hx_this);
	}
	
	
	@Override public void create()
	{
		//line 29 "/usr/share/haxe/std/java/net/SslSocket.hx"
		try 
		{
			//line 30 "/usr/share/haxe/std/java/net/SslSocket.hx"
			this.sock = javax.net.ssl.SSLSocketFactory.getDefault().createSocket();
			//line 31 "/usr/share/haxe/std/java/net/SslSocket.hx"
			this.server = javax.net.ssl.SSLServerSocketFactory.getDefault().createServerSocket();
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 29 "/usr/share/haxe/std/java/net/SslSocket.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 32 "/usr/share/haxe/std/java/net/SslSocket.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 32 "/usr/share/haxe/std/java/net/SslSocket.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 32 "/usr/share/haxe/std/java/net/SslSocket.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 32 "/usr/share/haxe/std/java/net/SslSocket.hx"
			{
				//line 32 "/usr/share/haxe/std/java/net/SslSocket.hx"
				java.lang.Object e = __temp_catchall2;
				//line 32 "/usr/share/haxe/std/java/net/SslSocket.hx"
				throw haxe.lang.HaxeException.wrap(e);
			}
			
		}
		
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 24 "/usr/share/haxe/std/java/net/SslSocket.hx"
		{
			//line 24 "/usr/share/haxe/std/java/net/SslSocket.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "/usr/share/haxe/std/java/net/SslSocket.hx"
			switch (field.hashCode())
			{
				case -1352294148:
				{
					//line 24 "/usr/share/haxe/std/java/net/SslSocket.hx"
					if (field.equals("create")) 
					{
						//line 24 "/usr/share/haxe/std/java/net/SslSocket.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/share/haxe/std/java/net/SslSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "create")) );
					}
					
					//line 24 "/usr/share/haxe/std/java/net/SslSocket.hx"
					break;
				}
				
				
			}
			
			//line 24 "/usr/share/haxe/std/java/net/SslSocket.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "/usr/share/haxe/std/java/net/SslSocket.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 24 "/usr/share/haxe/std/java/net/SslSocket.hx"
				throw null;
			}
			
		}
		
	}
	
	
}


