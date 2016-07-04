package haxe.io._ArrayBufferView;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class ArrayBufferView_Impl_
{
	
	
	
	
	
	
	
	
	public static haxe.io.ArrayBufferViewImpl fromBytes(haxe.io.Bytes bytes, java.lang.Object pos, java.lang.Object length)
	{
		//line 67 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
		int __temp_pos9 = ( (haxe.lang.Runtime.eq(pos, null)) ? (0) : (((int) (haxe.lang.Runtime.toInt(pos)) )) );
		//line 68 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
		if (haxe.lang.Runtime.eq(length, null)) 
		{
			//line 68 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
			length = ( bytes.length - __temp_pos9 );
		}
		
		//line 69 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
		if (( ( ( __temp_pos9 < 0 ) || ( haxe.lang.Runtime.compare(length, 0) < 0 ) ) || ( ((int) (haxe.lang.Runtime.toInt(haxe.lang.Runtime.plus(__temp_pos9, length))) ) > bytes.length ) )) 
		{
			//line 69 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.OutsideBounds);
		}
		
		//line 70 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
		{
			//line 70 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
			haxe.io.ArrayBufferViewImpl a = new haxe.io.ArrayBufferViewImpl(bytes, __temp_pos9, ((int) (haxe.lang.Runtime.toInt(length)) ));
			//line 70 "/usr/share/haxe/std/haxe/io/ArrayBufferView.hx"
			return ((haxe.io.ArrayBufferViewImpl) (a) );
		}
		
	}
	
	
}


