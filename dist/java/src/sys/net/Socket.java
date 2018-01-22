package sys.net;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Socket extends haxe.lang.HxObject
{
	public Socket(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Socket()
	{
		//line 37 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
		sys.net.Socket.__hx_ctor_sys_net_Socket(this);
	}
	
	
	public static void __hx_ctor_sys_net_Socket(sys.net.Socket __temp_me33)
	{
		//line 39 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
		__temp_me33.create();
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
		return new sys.net.Socket(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
		return new sys.net.Socket();
	}
	
	
	public haxe.io.Input input;
	
	public haxe.io.Output output;
	
	public java.net.Socket sock;
	
	public java.net.ServerSocket server;
	
	public void create()
	{
		//line 44 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
		this.sock = new java.net.Socket();
		//line 47 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
		try 
		{
			//line 47 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			this.server = new java.net.ServerSocket();
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 47 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 48 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 48 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 48 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 48 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			{
				//line 48 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
				java.lang.Object e = __temp_catchall2;
				//line 48 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
				throw haxe.lang.HaxeException.wrap(e);
			}
			
		}
		
		
	}
	
	
	public void close()
	{
		//line 54 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
		try 
		{
			//line 55 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			if (( this.sock != null )) 
			{
				//line 56 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
				this.sock.close();
			}
			
			//line 57 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			if (( this.server != null )) 
			{
				//line 58 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
				this.server.close();
			}
			
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 54 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 60 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 60 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 60 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 60 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			{
				//line 60 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
				java.lang.Object e = __temp_catchall2;
				//line 60 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
				throw haxe.lang.HaxeException.wrap(e);
			}
			
		}
		
		
	}
	
	
	public void write(java.lang.String content)
	{
		//line 70 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
		this.output.writeString(content);
	}
	
	
	public void connect(sys.net.Host host, int port)
	{
		//line 76 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
		try 
		{
			//line 77 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			this.sock.connect(((java.net.SocketAddress) (new java.net.InetSocketAddress(((java.net.InetAddress) (host.wrapped) ), ((int) (port) ))) ));
			//line 78 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			this.output = new haxe.java.io.NativeOutput(((java.io.OutputStream) (this.sock.getOutputStream()) ));
			//line 79 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			this.input = new haxe.java.io.NativeInput(((java.io.InputStream) (this.sock.getInputStream()) ));
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 76 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 81 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 81 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 81 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 81 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			{
				//line 81 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
				java.lang.Object e = __temp_catchall2;
				//line 81 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
				throw haxe.lang.HaxeException.wrap(e);
			}
			
		}
		
		
	}
	
	
	public void shutdown(boolean read, boolean write)
	{
		//line 95 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
		try 
		{
			//line 96 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			if (read) 
			{
				//line 97 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
				this.sock.shutdownInput();
			}
			
			//line 98 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			if (write) 
			{
				//line 99 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
				this.sock.shutdownOutput();
			}
			
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 95 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 101 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 101 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 101 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 101 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			{
				//line 101 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
				java.lang.Object e = __temp_catchall2;
				//line 101 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
				throw haxe.lang.HaxeException.wrap(e);
			}
			
		}
		
		
	}
	
	
	public void setTimeout(double timeout)
	{
		//line 147 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
		try 
		{
			//line 147 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			this.sock.setSoTimeout(((int) (( timeout * 1000 )) ));
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 147 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 148 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 148 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 148 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 148 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			{
				//line 148 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
				java.lang.Object e = __temp_catchall2;
				//line 148 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
				throw haxe.lang.HaxeException.wrap(e);
			}
			
		}
		
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
		{
			//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			boolean __temp_executeDef1 = true;
			//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			switch (field.hashCode())
			{
				case -905826493:
				{
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					if (field.equals("server")) 
					{
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						this.server = ((java.net.ServerSocket) (value) );
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						return value;
					}
					
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					break;
				}
				
				
				case 100358090:
				{
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					if (field.equals("input")) 
					{
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						this.input = ((haxe.io.Input) (value) );
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						return value;
					}
					
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					break;
				}
				
				
				case 3535812:
				{
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					if (field.equals("sock")) 
					{
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						this.sock = ((java.net.Socket) (value) );
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						return value;
					}
					
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					break;
				}
				
				
				case -1005512447:
				{
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					if (field.equals("output")) 
					{
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						this.output = ((haxe.io.Output) (value) );
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						return value;
					}
					
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					break;
				}
				
				
			}
			
			//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			if (__temp_executeDef1) 
			{
				//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
		{
			//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			boolean __temp_executeDef1 = true;
			//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			switch (field.hashCode())
			{
				case 1659754143:
				{
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					if (field.equals("setTimeout")) 
					{
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setTimeout")) );
					}
					
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					break;
				}
				
				
				case 100358090:
				{
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					if (field.equals("input")) 
					{
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						return this.input;
					}
					
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					break;
				}
				
				
				case -169343402:
				{
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					if (field.equals("shutdown")) 
					{
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "shutdown")) );
					}
					
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					break;
				}
				
				
				case -1005512447:
				{
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					if (field.equals("output")) 
					{
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						return this.output;
					}
					
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					break;
				}
				
				
				case 951351530:
				{
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					if (field.equals("connect")) 
					{
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "connect")) );
					}
					
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					break;
				}
				
				
				case 3535812:
				{
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					if (field.equals("sock")) 
					{
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						return this.sock;
					}
					
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					break;
				}
				
				
				case 113399775:
				{
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					if (field.equals("write")) 
					{
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "write")) );
					}
					
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					break;
				}
				
				
				case -905826493:
				{
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					if (field.equals("server")) 
					{
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						return this.server;
					}
					
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					break;
				}
				
				
				case 94756344:
				{
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					if (field.equals("close")) 
					{
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "close")) );
					}
					
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					break;
				}
				
				
				case -1352294148:
				{
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					if (field.equals("create")) 
					{
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "create")) );
					}
					
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					break;
				}
				
				
			}
			
			//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			if (__temp_executeDef1) 
			{
				//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
		{
			//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			boolean __temp_executeDef1 = true;
			//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			switch (field.hashCode())
			{
				case 1659754143:
				{
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					if (field.equals("setTimeout")) 
					{
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						this.setTimeout(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					break;
				}
				
				
				case -1352294148:
				{
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					if (field.equals("create")) 
					{
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						this.create();
					}
					
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					break;
				}
				
				
				case -169343402:
				{
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					if (field.equals("shutdown")) 
					{
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						this.shutdown(haxe.lang.Runtime.toBool(dynargs.__get(0)), haxe.lang.Runtime.toBool(dynargs.__get(1)));
					}
					
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					break;
				}
				
				
				case 94756344:
				{
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					if (field.equals("close")) 
					{
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						this.close();
					}
					
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					break;
				}
				
				
				case 951351530:
				{
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					if (field.equals("connect")) 
					{
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						this.connect(((sys.net.Host) (dynargs.__get(0)) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ));
					}
					
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					break;
				}
				
				
				case 113399775:
				{
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					if (field.equals("write")) 
					{
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
						this.write(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
					break;
				}
				
				
			}
			
			//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			if (__temp_executeDef1) 
			{
				//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
		baseArr.push("server");
		//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
		baseArr.push("sock");
		//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
		baseArr.push("output");
		//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
		baseArr.push("input");
		//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
		{
			//line 26 "/usr/share/haxe/std/java/_std/sys/net/Socket.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


