package haxe;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Http_setParameter_129__Fun extends haxe.lang.Function
{
	public Http_setParameter_129__Fun(java.lang.String param)
	{
		//line 129 "/usr/share/haxe/std/haxe/Http.hx"
		super(1, 0);
		//line 129 "/usr/share/haxe/std/haxe/Http.hx"
		this.param = param;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 129 "/usr/share/haxe/std/haxe/Http.hx"
		java.lang.Object p = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((java.lang.Object) (__fn_float1) )) : (((java.lang.Object) (__fn_dyn1) )) );
		//line 129 "/usr/share/haxe/std/haxe/Http.hx"
		return  ! (haxe.lang.Runtime.valEq(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(p, "param", true)), this.param)) ;
	}
	
	
	public java.lang.String param;
	
}


