package haxe.io._UInt32Array;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class UInt32Array_Impl_
{
	
	
	
	
	public static haxe.io.ArrayBufferViewImpl fromData(haxe.io.ArrayBufferViewImpl d)
	{
		//line 69 "/usr/share/haxe/std/haxe/io/UInt32Array.hx"
		return ((haxe.io.ArrayBufferViewImpl) (d) );
	}
	
	
	public static haxe.io.ArrayBufferViewImpl fromBytes(haxe.io.Bytes bytes, java.lang.Object bytePos, java.lang.Object length)
	{
		//line 82 "/usr/share/haxe/std/haxe/io/UInt32Array.hx"
		int __temp_bytePos24 = ( (haxe.lang.Runtime.eq(bytePos, null)) ? (0) : (((int) (haxe.lang.Runtime.toInt(bytePos)) )) );
		//line 82 "/usr/share/haxe/std/haxe/io/UInt32Array.hx"
		haxe.io.ArrayBufferViewImpl __temp_stmt1 = null;
		//line 82 "/usr/share/haxe/std/haxe/io/UInt32Array.hx"
		{
			//line 82 "/usr/share/haxe/std/haxe/io/UInt32Array.hx"
			haxe.io.ArrayBufferViewImpl this1 = haxe.io._ArrayBufferView.ArrayBufferView_Impl_.fromBytes(bytes, __temp_bytePos24, ( ((int) (haxe.lang.Runtime.toInt((( (haxe.lang.Runtime.eq(length, null)) ? (( ( bytes.length - __temp_bytePos24 ) >> 2 )) : (length) )))) ) << ((int) (2) ) ));
			//line 82 "/usr/share/haxe/std/haxe/io/UInt32Array.hx"
			__temp_stmt1 = ((haxe.io.ArrayBufferViewImpl) (this1) );
		}
		
		//line 82 "/usr/share/haxe/std/haxe/io/UInt32Array.hx"
		return haxe.io._UInt32Array.UInt32Array_Impl_.fromData(__temp_stmt1);
	}
	
	
}


