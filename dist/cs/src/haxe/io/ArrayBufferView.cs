
#pragma warning disable 109, 114, 219, 429, 168, 162
namespace haxe.io {
	public class ArrayBufferViewImpl : global::haxe.lang.HxObject {
		
		public ArrayBufferViewImpl(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public ArrayBufferViewImpl(global::haxe.io.Bytes bytes, int pos, int length) {
			global::haxe.io.ArrayBufferViewImpl.__hx_ctor_haxe_io_ArrayBufferViewImpl(this, bytes, pos, length);
		}
		
		
		public static void __hx_ctor_haxe_io_ArrayBufferViewImpl(global::haxe.io.ArrayBufferViewImpl __temp_me16, global::haxe.io.Bytes bytes, int pos, int length) {
			__temp_me16.bytes = bytes;
			__temp_me16.byteOffset = pos;
			__temp_me16.byteLength = length;
		}
		
		
		public static new object __hx_createEmpty() {
			return new global::haxe.io.ArrayBufferViewImpl(global::haxe.lang.EmptyObject.EMPTY);
		}
		
		
		public static new object __hx_create(global::Array arr) {
			unchecked {
				return new global::haxe.io.ArrayBufferViewImpl(((global::haxe.io.Bytes) (arr[0]) ), ((int) (global::haxe.lang.Runtime.toInt(arr[1])) ), ((int) (global::haxe.lang.Runtime.toInt(arr[2])) ));
			}
		}
		
		
		public global::haxe.io.Bytes bytes;
		
		public int byteOffset;
		
		public int byteLength;
		
		public override double __hx_setField_f(string field, int hash, double @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 1997282830:
					{
						this.byteLength = ((int) (@value) );
						return @value;
					}
					
					
					case 943988923:
					{
						this.byteOffset = ((int) (@value) );
						return @value;
					}
					
					
					default:
					{
						return base.__hx_setField_f(field, hash, @value, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_setField(string field, int hash, object @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 1997282830:
					{
						this.byteLength = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
						return @value;
					}
					
					
					case 943988923:
					{
						this.byteOffset = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
						return @value;
					}
					
					
					case 1033373803:
					{
						this.bytes = ((global::haxe.io.Bytes) (@value) );
						return @value;
					}
					
					
					default:
					{
						return base.__hx_setField(field, hash, @value, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_getField(string field, int hash, bool throwErrors, bool isCheck, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 1997282830:
					{
						return this.byteLength;
					}
					
					
					case 943988923:
					{
						return this.byteOffset;
					}
					
					
					case 1033373803:
					{
						return this.bytes;
					}
					
					
					default:
					{
						return base.__hx_getField(field, hash, throwErrors, isCheck, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override double __hx_getField_f(string field, int hash, bool throwErrors, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 1997282830:
					{
						return ((double) (this.byteLength) );
					}
					
					
					case 943988923:
					{
						return ((double) (this.byteOffset) );
					}
					
					
					default:
					{
						return base.__hx_getField_f(field, hash, throwErrors, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override void __hx_getFields(global::Array<object> baseArr) {
			baseArr.push("byteLength");
			baseArr.push("byteOffset");
			baseArr.push("bytes");
			{
				base.__hx_getFields(baseArr);
			}
			
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace haxe.io._ArrayBufferView {
	public sealed class ArrayBufferView_Impl_ {
		
		
		
		
		
		
		
		
		
		public static global::haxe.io.ArrayBufferViewImpl fromBytes(global::haxe.io.Bytes bytes, global::haxe.lang.Null<int> pos, global::haxe.lang.Null<int> length) {
			int __temp_pos17 = ( ( ! (pos.hasValue) ) ? (0) : ((pos).@value) );
			if ( ! (length.hasValue) ) {
				length = new global::haxe.lang.Null<int>(( bytes.length - __temp_pos17 ), true);
			}
			
			if (( ( ( __temp_pos17 < 0 ) || ( (length).@value < 0 ) ) || ( ( __temp_pos17 + (length).@value ) > bytes.length ) )) {
				throw global::haxe.lang.HaxeException.wrap(global::haxe.io.Error.OutsideBounds);
			}
			
			{
				global::haxe.io.ArrayBufferViewImpl a = new global::haxe.io.ArrayBufferViewImpl(bytes, __temp_pos17, (length).@value);
				return ((global::haxe.io.ArrayBufferViewImpl) (a) );
			}
			
		}
		
		
	}
}


