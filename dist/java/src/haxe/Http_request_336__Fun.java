package haxe;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Http_request_336__Fun extends haxe.lang.Function
{
	public Http_request_336__Fun(haxe.io.BytesOutput output, haxe.lang.Function old, haxe.Http me1, boolean[] err, haxe.Http _g)
	{
		//line 336 "/usr/share/haxe/std/haxe/Http.hx"
		super(1, 0);
		//line 336 "/usr/share/haxe/std/haxe/Http.hx"
		this.output = output;
		//line 336 "/usr/share/haxe/std/haxe/Http.hx"
		this.old = old;
		//line 336 "/usr/share/haxe/std/haxe/Http.hx"
		this.me1 = me1;
		//line 336 "/usr/share/haxe/std/haxe/Http.hx"
		this.err = err;
		//line 336 "/usr/share/haxe/std/haxe/Http.hx"
		this._g = _g;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 336 "/usr/share/haxe/std/haxe/Http.hx"
		java.lang.String e = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toString(__fn_float1)) : (haxe.lang.Runtime.toString(__fn_dyn1)) );
		//line 340 "/usr/share/haxe/std/haxe/Http.hx"
		this.me1.responseData = this.output.getBytes().toString();
		//line 342 "/usr/share/haxe/std/haxe/Http.hx"
		this.err[0] = true;
		//line 344 "/usr/share/haxe/std/haxe/Http.hx"
		this._g.onError = this.old;
		//line 345 "/usr/share/haxe/std/haxe/Http.hx"
		this._g.onError.__hx_invoke1_o(0.0, e);
		//line 336 "/usr/share/haxe/std/haxe/Http.hx"
		return null;
	}
	
	
	public haxe.io.BytesOutput output;
	
	public haxe.lang.Function old;
	
	public haxe.Http me1;
	
	public boolean[] err;
	
	public haxe.Http _g;
	
}


