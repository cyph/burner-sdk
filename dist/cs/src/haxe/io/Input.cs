// Generated by Haxe 3.4.2

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace haxe.io {
	public class Input : global::haxe.lang.HxObject {
		
		public Input(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public Input() {
			global::haxe.io.Input.__hx_ctor_haxe_io_Input(this);
		}
		
		
		public static void __hx_ctor_haxe_io_Input(global::haxe.io.Input __hx_this) {
		}
		
		
		public virtual int readByte() {
			throw global::haxe.lang.HaxeException.wrap("Not implemented");
		}
		
		
		public virtual int readBytes(global::haxe.io.Bytes s, int pos, int len) {
			int k = len;
			byte[] b = s.b;
			if (( ( ( pos < 0 ) || ( len < 0 ) ) || ( ( pos + len ) > s.length ) )) {
				throw global::haxe.lang.HaxeException.wrap(global::haxe.io.Error.OutsideBounds);
			}
			
			try {
				while (( k > 0 )) {
					b[pos] = ((byte) (this.readByte()) );
					 ++ pos;
					 -- k;
				}
				
			}
			catch (global::System.Exception __temp_catchallException1){
				global::haxe.lang.Exceptions.exception = __temp_catchallException1;
				object __temp_catchall2 = __temp_catchallException1;
				if (( __temp_catchall2 is global::haxe.lang.HaxeException )) {
					__temp_catchall2 = ((global::haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
				}
				
				if (( __temp_catchall2 is global::haxe.io.Eof )) {
					global::haxe.io.Eof eof = ((global::haxe.io.Eof) (__temp_catchall2) );
					{
					}
					
				}
				else {
					throw;
				}
				
			}
			
			
			return ( len - k );
		}
		
		
		public virtual void readFullBytes(global::haxe.io.Bytes s, int pos, int len) {
			while (( len > 0 )) {
				int k = this.readBytes(s, pos, len);
				if (( k == 0 )) {
					throw global::haxe.lang.HaxeException.wrap(global::haxe.io.Error.Blocked);
				}
				
				pos += k;
				len -= k;
			}
			
		}
		
		
		public virtual string readString(int len) {
			global::haxe.io.Bytes b = global::haxe.io.Bytes.alloc(len);
			this.readFullBytes(b, 0, len);
			return b.toString();
		}
		
		
		public override object __hx_getField(string field, int hash, bool throwErrors, bool isCheck, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 179047623:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "readString", 179047623)) );
					}
					
					
					case 1309344294:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "readFullBytes", 1309344294)) );
					}
					
					
					case 243225909:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "readBytes", 243225909)) );
					}
					
					
					case 1763375486:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "readByte", 1763375486)) );
					}
					
					
					default:
					{
						return base.__hx_getField(field, hash, throwErrors, isCheck, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_invokeField(string field, int hash, global::Array dynargs) {
			unchecked {
				switch (hash) {
					case 179047623:
					{
						return this.readString(((int) (global::haxe.lang.Runtime.toInt(dynargs[0])) ));
					}
					
					
					case 1309344294:
					{
						this.readFullBytes(((global::haxe.io.Bytes) (dynargs[0]) ), ((int) (global::haxe.lang.Runtime.toInt(dynargs[1])) ), ((int) (global::haxe.lang.Runtime.toInt(dynargs[2])) ));
						break;
					}
					
					
					case 243225909:
					{
						return this.readBytes(((global::haxe.io.Bytes) (dynargs[0]) ), ((int) (global::haxe.lang.Runtime.toInt(dynargs[1])) ), ((int) (global::haxe.lang.Runtime.toInt(dynargs[2])) ));
					}
					
					
					case 1763375486:
					{
						return this.readByte();
					}
					
					
					default:
					{
						return base.__hx_invokeField(field, hash, dynargs);
					}
					
				}
				
				return null;
			}
		}
		
		
	}
}


