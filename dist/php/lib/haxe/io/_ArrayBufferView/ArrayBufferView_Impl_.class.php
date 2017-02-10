<?php

// Generated by Haxe 3.4.0
class haxe_io__ArrayBufferView_ArrayBufferView_Impl_ {
	public function __construct(){}
	static function fromBytes($bytes, $pos = null, $length = null) {
		if($pos === null) {
			$pos = 0;
		}
		if($length === null) {
			$length = $bytes->length - $pos;
		}
		$tmp = null;
		$tmp1 = null;
		if($pos >= 0) {
			$tmp1 = $length < 0;
		} else {
			$tmp1 = true;
		}
		if(!$tmp1) {
			$tmp = $pos + $length > $bytes->length;
		} else {
			$tmp = true;
		}
		if($tmp) {
			throw new HException(haxe_io_Error::$OutsideBounds);
		}
		$a = new haxe_io_ArrayBufferViewImpl($bytes, $pos, $length);
		return $a;
	}
	function __toString() { return 'haxe.io._ArrayBufferView.ArrayBufferView_Impl_'; }
}
