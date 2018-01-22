package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Std
{
	public Std()
	{
	}
	
	
	public static boolean is(java.lang.Object v, java.lang.Object t)
	{
		//line 30 "/usr/share/haxe/std/java/_std/Std.hx"
		if (( v == null )) 
		{
			//line 31 "/usr/share/haxe/std/java/_std/Std.hx"
			return haxe.lang.Runtime.eq(t, java.lang.Object.class);
		}
		
		//line 32 "/usr/share/haxe/std/java/_std/Std.hx"
		if (( t == null )) 
		{
			//line 33 "/usr/share/haxe/std/java/_std/Std.hx"
			return false;
		}
		
		//line 34 "/usr/share/haxe/std/java/_std/Std.hx"
		java.lang.Class clt = ((java.lang.Class) (t) );
		//line 35 "/usr/share/haxe/std/java/_std/Std.hx"
		if (( ((java.lang.Object) (clt) ) == ((java.lang.Object) (null) ) )) 
		{
			//line 36 "/usr/share/haxe/std/java/_std/Std.hx"
			return false;
		}
		
		//line 37 "/usr/share/haxe/std/java/_std/Std.hx"
		java.lang.String name = clt.getName();
		//line 39 "/usr/share/haxe/std/java/_std/Std.hx"
		{
			//line 39 "/usr/share/haxe/std/java/_std/Std.hx"
			java.lang.String __temp_svar1 = (name);
			//line 39 "/usr/share/haxe/std/java/_std/Std.hx"
			int __temp_hash3 = __temp_svar1.hashCode();
			//line 39 "/usr/share/haxe/std/java/_std/Std.hx"
			switch (__temp_hash3)
			{
				case 761287205:
				case -1325958191:
				{
					//line 42 "/usr/share/haxe/std/java/_std/Std.hx"
					if (( (( ( __temp_hash3 == 761287205 ) && __temp_svar1.equals("java.lang.Double") )) || __temp_svar1.equals("double") )) 
					{
						//line 42 "/usr/share/haxe/std/java/_std/Std.hx"
						return haxe.lang.Runtime.isDouble(v);
					}
					
					//line 42 "/usr/share/haxe/std/java/_std/Std.hx"
					break;
				}
				
				
				case 1063877011:
				{
					//line 48 "/usr/share/haxe/std/java/_std/Std.hx"
					if (__temp_svar1.equals("java.lang.Object")) 
					{
						//line 48 "/usr/share/haxe/std/java/_std/Std.hx"
						return true;
					}
					
					//line 48 "/usr/share/haxe/std/java/_std/Std.hx"
					break;
				}
				
				
				case -2056817302:
				case 104431:
				{
					//line 44 "/usr/share/haxe/std/java/_std/Std.hx"
					if (( (( ( __temp_hash3 == -2056817302 ) && __temp_svar1.equals("java.lang.Integer") )) || __temp_svar1.equals("int") )) 
					{
						//line 44 "/usr/share/haxe/std/java/_std/Std.hx"
						return haxe.lang.Runtime.isInt(v);
					}
					
					//line 44 "/usr/share/haxe/std/java/_std/Std.hx"
					break;
				}
				
				
				case 344809556:
				case 64711720:
				{
					//line 46 "/usr/share/haxe/std/java/_std/Std.hx"
					if (( (( ( __temp_hash3 == 344809556 ) && __temp_svar1.equals("java.lang.Boolean") )) || __temp_svar1.equals("boolean") )) 
					{
						//line 46 "/usr/share/haxe/std/java/_std/Std.hx"
						return v instanceof java.lang.Boolean;
					}
					
					//line 46 "/usr/share/haxe/std/java/_std/Std.hx"
					break;
				}
				
				
			}
			
		}
		
		//line 51 "/usr/share/haxe/std/java/_std/Std.hx"
		java.lang.Class clv = v.getClass();
		//line 53 "/usr/share/haxe/std/java/_std/Std.hx"
		return clt.isAssignableFrom(((java.lang.Class) (clv) ));
	}
	
	
	public static java.lang.String string(java.lang.Object s)
	{
		//line 57 "/usr/share/haxe/std/java/_std/Std.hx"
		return ( haxe.lang.Runtime.toString(s) + "" );
	}
	
	
	public static java.lang.Object parseInt(java.lang.String x)
	{
		
		if (x == null) return null;

		int ret = 0;
		int base = 10;
		int i = 0;
		int len = x.length();

		if (x.startsWith("0") && len > 2)
		{
			char c = x.charAt(1);
			if (c == 'x' || c == 'X')
			{
				i = 2;
				base = 16;
			}
		}

		boolean foundAny = i != 0;
		boolean isNeg = false;
		for (; i < len; i++)
		{
			char c = x.charAt(i);
			if (!foundAny)
			{
				switch(c)
				{
					case '-':
						isNeg = true;
						continue;
					case '+':
					case '\n':
					case '\t':
					case '\r':
					case ' ':
						if (isNeg) return null;
						continue;
				}
			}

			if (c >= '0' && c <= '9')
			{
				if (!foundAny && c == '0')
				{
					foundAny = true;
					continue;
				}
				ret *= base; foundAny = true;

				ret += ((int) (c - '0'));
			} else if (base == 16) {
				if (c >= 'a' && c <= 'f') {
					ret *= base; foundAny = true;
					ret += ((int) (c - 'a')) + 10;
				} else if (c >= 'A' && c <= 'F') {
					ret *= base; foundAny = true;
					ret += ((int) (c - 'A')) + 10;
				} else {
					break;
				}
			} else {
				break;
			}
		}

		if (foundAny)
			return isNeg ? -ret : ret;
		else
			return null;
	
	}
	
	
	public static int random(int x)
	{
		//line 191 "/usr/share/haxe/std/java/_std/Std.hx"
		if (( x <= 0 )) 
		{
			//line 191 "/usr/share/haxe/std/java/_std/Std.hx"
			return 0;
		}
		
		//line 192 "/usr/share/haxe/std/java/_std/Std.hx"
		{
			//line 192 "/usr/share/haxe/std/java/_std/Std.hx"
			double x1 = ( java.lang.Math.random() * x );
			//line 192 "/usr/share/haxe/std/java/_std/Std.hx"
			return ((int) (x1) );
		}
		
	}
	
	
}


