<?php

class Cyph {
	public function __construct(){}
	static $addressSpace;
	static $services;
	static $options;
	static function generateGuid($length) {
		$randomBytes = SecureRandom::getSecureRandomBytes($length);
		{
			$_g = 0;
			while($_g < $length) {
				$i = $_g++;
				{
					$v = Cyph::$addressSpace[Math::floor(ord($randomBytes->b[$i]) / 256 * Cyph::$addressSpace->length)];
					$randomBytes->b[$i] = chr($v);
					unset($v);
				}
				unset($i);
			}
		}
		$guid = $randomBytes->toString();
		$randomBytes->fill(0, $length, 0);
		return $guid;
	}
	static function initiateSession($options = null) {
		if($options === null) {
			$options = (new _hx_array(array()));
		}
		return "https://" . _hx_string_or_null((Cyph_0($options))) . "/#" . _hx_string_or_null(((($options->indexOf(Cyph::$options->modestBranding, null) > -1) ? "&" : ""))) . _hx_string_or_null(((($options->indexOf(Cyph::$options->disableP2P, null) > -1) ? "\$" : ""))) . _hx_string_or_null(((($options->indexOf(Cyph::$options->nativeCrypto, null) > -1) ? "%" : ""))) . _hx_string_or_null(Cyph::generateGuid(26));
	}
	function __toString() { return 'Cyph'; }
}
Cyph::$addressSpace = _hx_deref((new _hx_array(array("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"))))->map(array(new _hx_lambda(array(), "Cyph_1"), 'execute'));
Cyph::$services = _hx_anonymous(array("chat" => "cyph.im", "voice" => "cyph.audio", "video" => "cyph.video"));
Cyph::$options = _hx_anonymous(array("voice" => 1, "video" => 2, "modestBranding" => 3, "disableP2P" => 4, "nativeCrypto" => 5));
function Cyph_0(&$options) {
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
function Cyph_1($s) {
	{
		return _hx_char_code_at($s, 0);
	}
}
