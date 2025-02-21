// Generated by Haxe 3.4.7
package haxe.lang;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ParamEnum extends haxe.lang.Enum
{
	public ParamEnum(int index, java.lang.Object[] params)
	{
		//line 101 "/usr/share/haxe/std/java/internal/HxObject.hx"
		super(index);
		//line 102 "/usr/share/haxe/std/java/internal/HxObject.hx"
		this.params = params;
	}
	
	
	public final java.lang.Object[] params;
	
	@Override public haxe.root.Array<java.lang.Object> getParams()
	{
		//line 107 "/usr/share/haxe/std/java/internal/HxObject.hx"
		if (( this.params == null )) 
		{
			//line 107 "/usr/share/haxe/std/java/internal/HxObject.hx"
			return new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{});
		}
		else
		{
			//line 107 "/usr/share/haxe/std/java/internal/HxObject.hx"
			java.lang.Object[] this1 = this.params;
			//line 107 "/usr/share/haxe/std/java/internal/HxObject.hx"
			haxe.root.Array a = new haxe.root.Array();
			//line 107 "/usr/share/haxe/std/java/internal/HxObject.hx"
			int len = ((java.lang.Object[]) (this1) ).length;
			//line 107 "/usr/share/haxe/std/java/internal/HxObject.hx"
			{
				//line 107 "/usr/share/haxe/std/java/internal/HxObject.hx"
				int _g1 = 0;
				//line 107 "/usr/share/haxe/std/java/internal/HxObject.hx"
				int _g = len;
				//line 107 "/usr/share/haxe/std/java/internal/HxObject.hx"
				while (( _g1 < _g ))
				{
					//line 107 "/usr/share/haxe/std/java/internal/HxObject.hx"
					int i = _g1++;
					//line 107 "/usr/share/haxe/std/java/internal/HxObject.hx"
					a.__set(i, ((java.lang.Object) (((java.lang.Object[]) (this1) )[i]) ));
				}
				
			}
			
			//line 107 "/usr/share/haxe/std/java/internal/HxObject.hx"
			return ((haxe.root.Array<java.lang.Object>) (a) );
		}
		
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 112 "/usr/share/haxe/std/java/internal/HxObject.hx"
		if (( ( this.params == null ) || ( ((java.lang.Object[]) (this.params) ).length == 0 ) )) 
		{
			//line 112 "/usr/share/haxe/std/java/internal/HxObject.hx"
			return this.getTag();
		}
		
		//line 113 "/usr/share/haxe/std/java/internal/HxObject.hx"
		haxe.root.StringBuf ret = new haxe.root.StringBuf();
		//line 114 "/usr/share/haxe/std/java/internal/HxObject.hx"
		ret.add(haxe.lang.Runtime.toString(this.getTag()));
		//line 114 "/usr/share/haxe/std/java/internal/HxObject.hx"
		ret.add(haxe.lang.Runtime.toString("("));
		//line 115 "/usr/share/haxe/std/java/internal/HxObject.hx"
		boolean first = true;
		//line 116 "/usr/share/haxe/std/java/internal/HxObject.hx"
		{
			//line 116 "/usr/share/haxe/std/java/internal/HxObject.hx"
			int _g = 0;
			//line 116 "/usr/share/haxe/std/java/internal/HxObject.hx"
			java.lang.Object[] _g1 = this.params;
			//line 116 "/usr/share/haxe/std/java/internal/HxObject.hx"
			while (( _g < ((java.lang.Object[]) (_g1) ).length ))
			{
				//line 116 "/usr/share/haxe/std/java/internal/HxObject.hx"
				java.lang.Object p = ((java.lang.Object) (((java.lang.Object[]) (_g1) )[_g]) );
				//line 116 "/usr/share/haxe/std/java/internal/HxObject.hx"
				 ++ _g;
				//line 118 "/usr/share/haxe/std/java/internal/HxObject.hx"
				if (first) 
				{
					//line 119 "/usr/share/haxe/std/java/internal/HxObject.hx"
					first = false;
				}
				else
				{
					//line 121 "/usr/share/haxe/std/java/internal/HxObject.hx"
					ret.add(haxe.lang.Runtime.toString(","));
				}
				
				//line 122 "/usr/share/haxe/std/java/internal/HxObject.hx"
				ret.add(((java.lang.Object) (p) ));
			}
			
		}
		
		//line 124 "/usr/share/haxe/std/java/internal/HxObject.hx"
		ret.add(haxe.lang.Runtime.toString(")"));
		//line 125 "/usr/share/haxe/std/java/internal/HxObject.hx"
		return ret.toString();
	}
	
	
	@Override public boolean equals(java.lang.Object obj)
	{
		//line 130 "/usr/share/haxe/std/java/internal/HxObject.hx"
		if (haxe.lang.Runtime.eq(obj, this)) 
		{
			//line 131 "/usr/share/haxe/std/java/internal/HxObject.hx"
			return true;
		}
		
		//line 132 "/usr/share/haxe/std/java/internal/HxObject.hx"
		haxe.lang.ParamEnum obj1 = ( (( obj instanceof haxe.lang.ParamEnum )) ? (((haxe.lang.ParamEnum) (obj) )) : (null) );
		//line 133 "/usr/share/haxe/std/java/internal/HxObject.hx"
		boolean ret = ( ( ( obj1 != null ) && haxe.root.Std.is(obj1, haxe.root.Type.getEnum(((java.lang.Object) (this) ))) ) && ( obj1.index == this.index ) );
		//line 134 "/usr/share/haxe/std/java/internal/HxObject.hx"
		if ( ! (ret) ) 
		{
			//line 135 "/usr/share/haxe/std/java/internal/HxObject.hx"
			return false;
		}
		
		//line 136 "/usr/share/haxe/std/java/internal/HxObject.hx"
		if (( obj1.params == this.params )) 
		{
			//line 137 "/usr/share/haxe/std/java/internal/HxObject.hx"
			return true;
		}
		
		//line 138 "/usr/share/haxe/std/java/internal/HxObject.hx"
		int len = 0;
		//line 139 "/usr/share/haxe/std/java/internal/HxObject.hx"
		boolean tmp = false;
		//line 139 "/usr/share/haxe/std/java/internal/HxObject.hx"
		if ( ! ((( ( obj1.params == null ) || ( this.params == null ) ))) ) 
		{
			//line 139 "/usr/share/haxe/std/java/internal/HxObject.hx"
			len = ((java.lang.Object[]) (this.params) ).length;
			//line 139 "/usr/share/haxe/std/java/internal/HxObject.hx"
			tmp = ( len != ((java.lang.Object[]) (obj1.params) ).length );
		}
		else
		{
			//line 139 "/usr/share/haxe/std/java/internal/HxObject.hx"
			tmp = true;
		}
		
		//line 139 "/usr/share/haxe/std/java/internal/HxObject.hx"
		if (tmp) 
		{
			//line 140 "/usr/share/haxe/std/java/internal/HxObject.hx"
			return false;
		}
		
		//line 141 "/usr/share/haxe/std/java/internal/HxObject.hx"
		{
			//line 141 "/usr/share/haxe/std/java/internal/HxObject.hx"
			int _g1 = 0;
			//line 141 "/usr/share/haxe/std/java/internal/HxObject.hx"
			int _g = len;
			//line 141 "/usr/share/haxe/std/java/internal/HxObject.hx"
			while (( _g1 < _g ))
			{
				//line 141 "/usr/share/haxe/std/java/internal/HxObject.hx"
				int i = _g1++;
				//line 143 "/usr/share/haxe/std/java/internal/HxObject.hx"
				if ( ! (((boolean) (haxe.root.Type.enumEq(((java.lang.Object) (((java.lang.Object[]) (obj1.params) )[i]) ), ((java.lang.Object) (((java.lang.Object[]) (this.params) )[i]) ))) )) ) 
				{
					//line 144 "/usr/share/haxe/std/java/internal/HxObject.hx"
					return false;
				}
				
			}
			
		}
		
		//line 146 "/usr/share/haxe/std/java/internal/HxObject.hx"
		return true;
	}
	
	
	@Override public int hashCode()
	{
		//line 151 "/usr/share/haxe/std/java/internal/HxObject.hx"
		int h = 19;
		//line 152 "/usr/share/haxe/std/java/internal/HxObject.hx"
		if (( this.params != null )) 
		{
			//line 152 "/usr/share/haxe/std/java/internal/HxObject.hx"
			int _g = 0;
			//line 152 "/usr/share/haxe/std/java/internal/HxObject.hx"
			java.lang.Object[] _g1 = this.params;
			//line 152 "/usr/share/haxe/std/java/internal/HxObject.hx"
			while (( _g < ((java.lang.Object[]) (_g1) ).length ))
			{
				//line 152 "/usr/share/haxe/std/java/internal/HxObject.hx"
				java.lang.Object p = ((java.lang.Object) (((java.lang.Object[]) (_g1) )[_g]) );
				//line 152 "/usr/share/haxe/std/java/internal/HxObject.hx"
				 ++ _g;
				//line 154 "/usr/share/haxe/std/java/internal/HxObject.hx"
				h *= 31;
				//line 155 "/usr/share/haxe/std/java/internal/HxObject.hx"
				if (( ! (( p == null )) )) 
				{
					//line 156 "/usr/share/haxe/std/java/internal/HxObject.hx"
					h = ((int) (haxe.lang.Runtime.toInt(((java.lang.Object) (haxe.lang.Runtime.plus(h, p.hashCode())) ))) );
				}
				
			}
			
		}
		
		//line 158 "/usr/share/haxe/std/java/internal/HxObject.hx"
		h += this.index;
		//line 159 "/usr/share/haxe/std/java/internal/HxObject.hx"
		return h;
	}
	
	
}


