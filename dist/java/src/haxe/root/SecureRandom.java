package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class SecureRandom extends haxe.lang.HxObject
{
	public SecureRandom(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public SecureRandom()
	{
		//line 10 "/home/ubuntu/sdk/SecureRandom.hx"
		haxe.root.SecureRandom.__hx_ctor__SecureRandom(this);
	}
	
	
	public static void __hx_ctor__SecureRandom(haxe.root.SecureRandom __temp_me5)
	{
	}
	
	
	public static haxe.io.Bytes getSecureRandomBytes(int length)
	{
		//line 12 "/home/ubuntu/sdk/SecureRandom.hx"
		java.lang.String reason = "";
		//line 28 "/home/ubuntu/sdk/SecureRandom.hx"
		try 
		{
			//line 28 "/home/ubuntu/sdk/SecureRandom.hx"
			return haxe.io.Bytes.ofData(java.security.SecureRandom.getSeed(((int) (length) )));
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 28 "/home/ubuntu/sdk/SecureRandom.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 46 "/home/ubuntu/sdk/SecureRandom.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 46 "/home/ubuntu/sdk/SecureRandom.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 46 "/home/ubuntu/sdk/SecureRandom.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 46 "/home/ubuntu/sdk/SecureRandom.hx"
			{
				//line 46 "/home/ubuntu/sdk/SecureRandom.hx"
				java.lang.Object e = __temp_catchall2;
				//line 46 "/home/ubuntu/sdk/SecureRandom.hx"
				reason = ( "" + haxe.root.Std.string(e) );
			}
			
		}
		
		
		//line 48 "/home/ubuntu/sdk/SecureRandom.hx"
		throw haxe.lang.HaxeException.wrap(( "Can\'t find a secure source of random bytes. Reason: " + reason ));
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 10 "/home/ubuntu/sdk/SecureRandom.hx"
		return new haxe.root.SecureRandom(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 10 "/home/ubuntu/sdk/SecureRandom.hx"
		return new haxe.root.SecureRandom();
	}
	
	
}


