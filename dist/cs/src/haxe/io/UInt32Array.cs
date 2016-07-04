
#pragma warning disable 109, 114, 219, 429, 168, 162
namespace haxe.io._UInt32Array {
	public sealed class UInt32Array_Impl_ {
		
		
		
		
		
		public static global::haxe.io.ArrayBufferViewImpl fromData(global::haxe.io.ArrayBufferViewImpl d) {
			return ((global::haxe.io.ArrayBufferViewImpl) (d) );
		}
		
		
		public static global::haxe.io.ArrayBufferViewImpl fromBytes(global::haxe.io.Bytes bytes, global::haxe.lang.Null<int> bytePos, global::haxe.lang.Null<int> length) {
			unchecked {
				int __temp_bytePos22 = ( ( ! (bytePos.hasValue) ) ? (0) : ((bytePos).@value) );
				global::haxe.io.ArrayBufferViewImpl __temp_stmt1 = null;
				{
					global::haxe.io.ArrayBufferViewImpl this1 = global::haxe.io._ArrayBufferView.ArrayBufferView_Impl_.fromBytes(bytes, new global::haxe.lang.Null<int>(__temp_bytePos22, true), new global::haxe.lang.Null<int>(( ((( ( ! (length.hasValue) ) ? (new global::haxe.lang.Null<int>(( ( bytes.length - __temp_bytePos22 ) >> 2 ), true)) : (length) ))).@value << 2 ), true));
					__temp_stmt1 = ((global::haxe.io.ArrayBufferViewImpl) (this1) );
				}
				
				return global::haxe.io._UInt32Array.UInt32Array_Impl_.fromData(__temp_stmt1);
			}
		}
		
		
	}
}


