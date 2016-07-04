<?php

class haxe_io_ArrayBufferViewImpl {
	public function __construct($bytes, $pos, $length) {
		if(!php_Boot::$skip_constructor) {
		$this->bytes = $bytes;
		$this->byteOffset = $pos;
		$this->byteLength = $length;
	}}
	public $bytes;
	public $byteOffset;
	public $byteLength;
	public function __call($m, $a) {
		if(isset($this->$m) && is_callable($this->$m))
			return call_user_func_array($this->$m, $a);
		else if(isset($this->__dynamics[$m]) && is_callable($this->__dynamics[$m]))
			return call_user_func_array($this->__dynamics[$m], $a);
		else if('toString' == $m)
			return $this->__toString();
		else
			throw new HException('Unable to call <'.$m.'>');
	}
	function __toString() { return 'haxe.io.ArrayBufferViewImpl'; }
}
