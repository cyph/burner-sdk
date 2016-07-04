<?php

class haxe_io__ArrayBufferView_ArrayBufferView_Impl_ {
	public function __construct(){}
	static function fromBytes($bytes, $pos = null, $length = null) {
		if($pos === null) {
			$pos = 0;
		}
		if($length === null) {
			$length = $bytes->length - $pos;
		}
		if($pos < 0 || $length < 0 || $pos + $length > $bytes->length) {
			throw new HException(haxe_io_Error::$OutsideBounds);
		}
		{
			$a = new haxe_io_ArrayBufferViewImpl($bytes, $pos, $length);
			return $a;
		}
	}
	function __toString() { return 'haxe.io._ArrayBufferView.ArrayBufferView_Impl_'; }
}
