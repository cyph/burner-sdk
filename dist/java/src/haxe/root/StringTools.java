package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class StringTools extends haxe.lang.HxObject
{
	public StringTools(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public StringTools()
	{
		//line 32 "/usr/share/haxe/std/StringTools.hx"
		haxe.root.StringTools.__hx_ctor__StringTools(this);
	}
	
	
	public static void __hx_ctor__StringTools(haxe.root.StringTools __temp_me11)
	{
	}
	
	
	public static java.lang.String urlEncode(java.lang.String s)
	{
		//line 47 "/usr/share/haxe/std/StringTools.hx"
		try 
		{
			//line 47 "/usr/share/haxe/std/StringTools.hx"
			return java.net.URLEncoder.encode(s, "UTF-8");
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 47 "/usr/share/haxe/std/StringTools.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 48 "/usr/share/haxe/std/StringTools.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 48 "/usr/share/haxe/std/StringTools.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 48 "/usr/share/haxe/std/StringTools.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 48 "/usr/share/haxe/std/StringTools.hx"
			{
				//line 48 "/usr/share/haxe/std/StringTools.hx"
				java.lang.Object e = __temp_catchall2;
				//line 48 "/usr/share/haxe/std/StringTools.hx"
				throw haxe.lang.HaxeException.wrap(e);
			}
			
		}
		
		
	}
	
	
	public static boolean isSpace(java.lang.String s, int pos)
	{
		//line 187 "/usr/share/haxe/std/StringTools.hx"
		java.lang.Object c = haxe.lang.StringExt.charCodeAt(s, pos);
		//line 188 "/usr/share/haxe/std/StringTools.hx"
		return ( ( ( haxe.lang.Runtime.compare(c, 8) > 0 ) && ( haxe.lang.Runtime.compare(c, 14) < 0 ) ) || haxe.lang.Runtime.eq(c, 32) );
	}
	
	
	public static java.lang.String ltrim(java.lang.String s)
	{
		//line 204 "/usr/share/haxe/std/StringTools.hx"
		int l = s.length();
		//line 205 "/usr/share/haxe/std/StringTools.hx"
		int r = 0;
		//line 206 "/usr/share/haxe/std/StringTools.hx"
		while (( ( r < l ) && haxe.root.StringTools.isSpace(s, r) ))
		{
			//line 207 "/usr/share/haxe/std/StringTools.hx"
			r++;
		}
		
		//line 209 "/usr/share/haxe/std/StringTools.hx"
		if (( r > 0 )) 
		{
			//line 210 "/usr/share/haxe/std/StringTools.hx"
			return haxe.lang.StringExt.substr(s, r, ( l - r ));
		}
		else
		{
			//line 212 "/usr/share/haxe/std/StringTools.hx"
			return s;
		}
		
	}
	
	
	public static java.lang.String rtrim(java.lang.String s)
	{
		//line 229 "/usr/share/haxe/std/StringTools.hx"
		int l = s.length();
		//line 230 "/usr/share/haxe/std/StringTools.hx"
		int r = 0;
		//line 231 "/usr/share/haxe/std/StringTools.hx"
		while (( ( r < l ) && haxe.root.StringTools.isSpace(s, ( ( l - r ) - 1 )) ))
		{
			//line 232 "/usr/share/haxe/std/StringTools.hx"
			r++;
		}
		
		//line 234 "/usr/share/haxe/std/StringTools.hx"
		if (( r > 0 )) 
		{
			//line 235 "/usr/share/haxe/std/StringTools.hx"
			return haxe.lang.StringExt.substr(s, 0, ( l - r ));
		}
		else
		{
			//line 237 "/usr/share/haxe/std/StringTools.hx"
			return s;
		}
		
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 32 "/usr/share/haxe/std/StringTools.hx"
		return new haxe.root.StringTools(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 32 "/usr/share/haxe/std/StringTools.hx"
		return new haxe.root.StringTools();
	}
	
	
}


