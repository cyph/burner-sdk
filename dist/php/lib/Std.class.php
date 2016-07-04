<?php

class Std {
	public function __construct(){}
	static function string($s) {
		return _hx_string_rec($s, "");
	}
	static function int($x) {
		$i = fmod($x, -2147483648) & -1;
		if($i & -2147483648) {
			$i = -((~$i & -1) + 1);
		}
		return $i;
	}
	function __toString() { return 'Std'; }
}
