package haxe;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Http_setHeader_111__Fun extends haxe.lang.Function
{
	public Http_setHeader_111__Fun(java.lang.String header)
	{
		//line 111 "/usr/share/haxe/std/haxe/Http.hx"
		super(1, 0);
		//line 111 "/usr/share/haxe/std/haxe/Http.hx"
		this.header = header;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 111 "/usr/share/haxe/std/haxe/Http.hx"
		java.lang.Object h = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((java.lang.Object) (__fn_float1) )) : (((java.lang.Object) (__fn_dyn1) )) );
		//line 111 "/usr/share/haxe/std/haxe/Http.hx"
		return  ! (haxe.lang.Runtime.valEq(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(h, "header", true)), this.header)) ;
	}
	
	
	public java.lang.String header;
	
}


