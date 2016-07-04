<?php

class haxe_io__UInt32Array_UInt32Array_Impl_ {
	public function __construct(){}
	static function fromData($d) {
		return $d;
	}
	static function fromBytes($bytes, $bytePos = null, $length = null) {
		if($bytePos === null) {
			$bytePos = 0;
		}
		return haxe_io__UInt32Array_UInt32Array_Impl_::fromData(haxe_io__UInt32Array_UInt32Array_Impl__0($bytePos, $bytes, $length));
	}
	function __toString() { return 'haxe.io._UInt32Array.UInt32Array_Impl_'; }
}
function haxe_io__UInt32Array_UInt32Array_Impl__0(&$bytePos, &$bytes, &$length) {
	{
		$this1 = haxe_io__ArrayBufferView_ArrayBufferView_Impl_::fromBytes($bytes, $bytePos, (haxe_io__UInt32Array_UInt32Array_Impl__1($bytePos, $bytes, $length)) << 2);
		return $this1;
	}
}
function haxe_io__UInt32Array_UInt32Array_Impl__1(&$bytePos, &$bytes, &$length) {
	if($length === null) {
		return $bytes->length - $bytePos >> 2;
	} else {
		return $length;
	}
}
