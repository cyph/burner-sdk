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
		//line 4 "/cyph/SecureRandom.hx"
		haxe.root.SecureRandom.__hx_ctor__SecureRandom(this);
	}
	
	
	public static void __hx_ctor__SecureRandom(haxe.root.SecureRandom __temp_me9)
	{
	}
	
	
	public static haxe.io.Bytes getSecureRandomBytes(int length)
	{
		//line 14 "/cyph/SecureRandom.hx"
		java.lang.String reason = "";
		//line 30 "/cyph/SecureRandom.hx"
		try 
		{
			//line 30 "/cyph/SecureRandom.hx"
			return haxe.io.Bytes.ofData(java.security.SecureRandom.getSeed(((int) (length) )));
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 30 "/cyph/SecureRandom.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 49 "/cyph/SecureRandom.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 49 "/cyph/SecureRandom.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 49 "/cyph/SecureRandom.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 49 "/cyph/SecureRandom.hx"
			{
				//line 49 "/cyph/SecureRandom.hx"
				java.lang.Object e = __temp_catchall2;
				//line 49 "/cyph/SecureRandom.hx"
				reason = ( "" + haxe.root.Std.string(e) );
			}
			
		}
		
		
		//line 51 "/cyph/SecureRandom.hx"
		throw haxe.lang.HaxeException.wrap(( "Can\'t find a secure source of random bytes. Reason: " + reason ));
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 4 "/cyph/SecureRandom.hx"
		return new haxe.root.SecureRandom(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 4 "/cyph/SecureRandom.hx"
		return new haxe.root.SecureRandom();
	}
	
	
}


