<?php

// Generated by Haxe 3.4.7
class haxe_io_Output {
	public function __construct(){}
	public function writeByte($c) {
		throw new HException("Not implemented");
	}
	public function writeBytes($s, $pos, $len) {
		$tmp = null;
		$tmp1 = null;
		if($pos >= 0) {
			$tmp1 = $len < 0;
		} else {
			$tmp1 = true;
		}
		if(!$tmp1) {
			$tmp = $pos + $len > $s->length;
		} else {
			$tmp = true;
		}
		if($tmp) {
			throw new HException(haxe_io_Error::$OutsideBounds);
		}
		$b = $s->b;
		$k = $len;
		while($k > 0) {
			$this->writeByte(ord($b->s[$pos]));
			$pos = $pos + 1;
			$k = $k - 1;
		}
		return $len;
	}
	public function close() {}
	public function writeFullBytes($s, $pos, $len) {
		while($len > 0) {
			$k = $this->writeBytes($s, $pos, $len);
			$pos = $pos + $k;
			$len = $len - $k;
			unset($k);
		}
	}
	public function prepare($nbytes) {}
	function __toString() { return 'haxe.io.Output'; }
}
