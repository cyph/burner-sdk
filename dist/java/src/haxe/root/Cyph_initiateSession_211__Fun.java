package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Cyph_initiateSession_211__Fun extends haxe.lang.Function
{
	public Cyph_initiateSession_211__Fun(haxe.lang.Function onData, java.lang.Object linkData)
	{
		//line 211 "/cyph/Cyph.hx"
		super(1, 0);
		//line 211 "/cyph/Cyph.hx"
		this.onData = onData;
		//line 211 "/cyph/Cyph.hx"
		this.linkData = linkData;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 211 "/cyph/Cyph.hx"
		java.lang.String data = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toString(__fn_float1)) : (haxe.lang.Runtime.toString(__fn_dyn1)) );
		//line 211 "/cyph/Cyph.hx"
		this.onData.__hx_invoke1_o(0.0, haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(this.linkData, "link", true)));
		//line 211 "/cyph/Cyph.hx"
		return null;
	}
	
	
	public haxe.lang.Function onData;
	
	public java.lang.Object linkData;
	
}


