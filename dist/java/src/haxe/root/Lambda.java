package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Lambda extends haxe.lang.HxObject
{
	public Lambda(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Lambda()
	{
		//line 35 "/usr/share/haxe/std/Lambda.hx"
		haxe.root.Lambda.__hx_ctor__Lambda(this);
	}
	
	
	public static void __hx_ctor__Lambda(haxe.root.Lambda __temp_me5)
	{
	}
	
	
	public static <A> boolean exists(java.lang.Object it, haxe.lang.Function f)
	{
		//line 116 "/usr/share/haxe/std/Lambda.hx"
		{
			//line 116 "/usr/share/haxe/std/Lambda.hx"
			java.lang.Object __temp_iterator1 = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
			//line 116 "/usr/share/haxe/std/Lambda.hx"
			while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(__temp_iterator1, "hasNext", null)))
			{
				//line 116 "/usr/share/haxe/std/Lambda.hx"
				A x = ((A) (haxe.lang.Runtime.callField(__temp_iterator1, "next", null)) );
				//line 117 "/usr/share/haxe/std/Lambda.hx"
				if (haxe.lang.Runtime.toBool(f.__hx_invoke1_o(0.0, x))) 
				{
					//line 118 "/usr/share/haxe/std/Lambda.hx"
					return true;
				}
				
			}
			
		}
		
		//line 119 "/usr/share/haxe/std/Lambda.hx"
		return false;
	}
	
	
	public static <A> haxe.root.List<A> filter(java.lang.Object it, haxe.lang.Function f)
	{
		//line 160 "/usr/share/haxe/std/Lambda.hx"
		haxe.root.List<A> l = new haxe.root.List<A>();
		//line 161 "/usr/share/haxe/std/Lambda.hx"
		{
			//line 161 "/usr/share/haxe/std/Lambda.hx"
			java.lang.Object __temp_iterator1 = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
			//line 161 "/usr/share/haxe/std/Lambda.hx"
			while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(__temp_iterator1, "hasNext", null)))
			{
				//line 161 "/usr/share/haxe/std/Lambda.hx"
				A x = ((A) (haxe.lang.Runtime.callField(__temp_iterator1, "next", null)) );
				//line 162 "/usr/share/haxe/std/Lambda.hx"
				if (haxe.lang.Runtime.toBool(f.__hx_invoke1_o(0.0, x))) 
				{
					//line 163 "/usr/share/haxe/std/Lambda.hx"
					l.add(x);
				}
				
			}
			
		}
		
		//line 164 "/usr/share/haxe/std/Lambda.hx"
		return l;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 35 "/usr/share/haxe/std/Lambda.hx"
		return new haxe.root.Lambda(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 35 "/usr/share/haxe/std/Lambda.hx"
		return new haxe.root.Lambda();
	}
	
	
}


