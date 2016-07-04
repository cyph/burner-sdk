<?php

class Cyph {
	public function __construct(){}
	static $addressSpace;
	static $services;
	static $options;
	static function generateGuid($length) {
		$byteLength = $length * 4;
		$randomBytes = SecureRandom::getSecureRandomBytes($byteLength);
		$randomNumbers = haxe_io__UInt32Array_UInt32Array_Impl_::fromBytes($randomBytes, null, null);
		{
			$_g = 0;
			while($_g < $length) {
				$i = $_g++;
				{
					$v = Cyph::$addressSpace[Std::int(Math::floor(Cyph_0($_g, $byteLength, $i, $length, $randomBytes, $randomNumbers) * Cyph::$addressSpace->length))];
					$randomBytes->b[$i] = chr($v);
					unset($v);
				}
				unset($i);
			}
		}
		$guid = _hx_deref(new haxe_io_BytesInput($randomBytes, 0, $length))->readString($length);
		$randomBytes->fill(0, $byteLength, 0);
		return $guid;
	}
	static function initiateSession($options = null) {
		if($options === null) {
			$options = (new _hx_array(array()));
		}
		return "https://" . _hx_string_or_null((Cyph_1($options))) . "/#" . _hx_string_or_null(((($options->indexOf(Cyph::$options->modestBranding, null) > -1) ? "&" : ""))) . _hx_string_or_null(((($options->indexOf(Cyph::$options->disableP2P, null) > -1) ? "\$" : ""))) . _hx_string_or_null(((($options->indexOf(Cyph::$options->nativeCrypto, null) > -1) ? "%" : ""))) . _hx_string_or_null(Cyph::generateGuid(26));
	}
	function __toString() { return 'Cyph'; }
}
Cyph::$addressSpace = _hx_deref((new _hx_array(array("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"))))->map(array(new _hx_lambda(array(), "Cyph_2"), 'execute'));
Cyph::$services = _hx_anonymous(array("chat" => "cyph.im", "voice" => "cyph.audio", "video" => "cyph.video"));
Cyph::$options = _hx_anonymous(array("voice" => 1, "video" => 2, "modestBranding" => 3, "disableP2P" => 4, "nativeCrypto" => 5));
function Cyph_0(&$_g, &$byteLength, &$i, &$length, &$randomBytes, &$randomNumbers) {
	{
		$a = null;
		$a = Cyph_3($_g, $a, $byteLength, $i, $length, $randomBytes, $randomNumbers);
		return Cyph_4($_g, $a, $byteLength, $i, $length, $randomBytes, $randomNumbers) / 4294967296.0;
	}
}
function Cyph_1(&$options) {
	if($options->indexOf(Cyph::$options->video, null) > -1) {
		return Cyph::$services->video;
	} else {
		if($options->indexOf(Cyph::$options->voice, null) > -1) {
			return Cyph::$services->voice;
		} else {
			return Cyph::$services->chat;
		}
	}
}
function Cyph_2($s) {
	{
		return _hx_char_code_at($s, 0);
	}
}
function Cyph_3(&$_g, &$a, &$byteLength, &$i, &$length, &$randomBytes, &$randomNumbers) {
	{
		$_this = $randomNumbers->bytes;
		$pos = ($i << 2) + $randomNumbers->byteOffset;
		$v1 = ord($_this->b[$pos]) | ord($_this->b[$pos + 1]) << 8 | ord($_this->b[$pos + 2]) << 16 | ord($_this->b[$pos + 3]) << 24;
		if(($v1 & -2147483648) !== 0) {
			return $v1 | -2147483648;
		} else {
			return $v1;
		}
		unset($v1,$pos,$_this);
	}
}
function Cyph_4(&$_g, &$a, &$byteLength, &$i, &$length, &$randomBytes, &$randomNumbers) {
	{
		$int = $a;
		if($int < 0) {
			return 4294967296.0 + $int;
		} else {
			return $int + 0.0;
		}
		unset($int);
	}
}
