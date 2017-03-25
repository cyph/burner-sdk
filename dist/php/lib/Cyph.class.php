<?php

// Generated by Haxe 3.4.2
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
			$_g1 = 0;
			$_g = $length;
			while($_g1 < $_g) {
				$_g1 = $_g1 + 1;
				$i = $_g1 - 1;
				{
					$v = Cyph::$addressSpace;
					$_this = $randomNumbers->bytes;
					$pos = ($i << 2) + $randomNumbers->byteOffset;
					$this1 = $_this->b;
					$v1 = ord($this1->s[$pos]);
					$this2 = $_this->b;
					$v2 = $v1 | ord($this2->s[$pos + 1]) << 8;
					$this3 = $_this->b;
					$v3 = $v2 | ord($this3->s[$pos + 2]) << 16;
					$this4 = $_this->b;
					$v4 = $v3 | ord($this4->s[$pos + 3]) << 24;
					$a = null;
					if(($v4 & -2147483648) !== 0) {
						$a = $v4 | -2147483648;
					} else {
						$a = $v4;
					}
					$int = $a;
					$v5 = null;
					if($int < 0) {
						$v5 = 4294967296.0 + $int;
					} else {
						$v5 = $int + 0.0;
					}
					$v6 = $v[Std::int(Math::floor($v5 / 4294967296.0 * Cyph::$addressSpace->length))];
					{
						$this5 = $randomBytes->b;
						$this5->s[$i] = chr($v6);
						unset($this5);
					}
					unset($v6,$v5,$v4,$v3,$v2,$v1,$v,$this4,$this3,$this2,$this1,$pos,$int,$a,$_this);
				}
				unset($i);
			}
		}
		$guid = _hx_deref(new haxe_io_BytesInput($randomBytes, 0, $length))->readString($length);
		$randomBytes->fill(0, $byteLength, 0);
		return $guid;
	}
	static function request($url, $post, $headers, $parameters, $onData, $onError) {
		$http = new haxe_Http($url);
		$http->onData = $onData;
		$http->onError = $onError;
		{
			$_g = 0;
			while($_g < $headers->length) {
				$o = $headers[$_g];
				$_g = $_g + 1;
				$http->setHeader($o->k, $o->v);
				unset($o);
			}
		}
		{
			$_g1 = 0;
			while($_g1 < $parameters->length) {
				$o1 = $parameters[$_g1];
				$_g1 = $_g1 + 1;
				$http->setParameter($o1->k, $o1->v);
				unset($o1);
			}
		}
		$http->request($post);
	}
	static function generateLink($options = null, $services = null) {
		if($options === null) {
			$options = (new _hx_array(array()));
		}
		if($services === null) {
			$services = Cyph::$services;
		}
		$id = Cyph::generateGuid(7);
		$tmp = null;
		if($options->indexOf(Cyph::$options->video, null) > -1) {
			$tmp = $services->video;
		} else {
			if($options->indexOf(Cyph::$options->voice, null) > -1) {
				$tmp = $services->voice;
			} else {
				$tmp = $services->chat;
			}
		}
		$tmp1 = null;
		if($options->indexOf(Cyph::$options->modestBranding, null) > -1) {
			$tmp1 = "&";
		} else {
			$tmp1 = "";
		}
		$tmp2 = null;
		if($options->indexOf(Cyph::$options->disableP2P, null) > -1) {
			$tmp2 = "\$";
		} else {
			$tmp2 = "";
		}
		$tmp3 = null;
		if($options->indexOf(Cyph::$options->nativeCrypto, null) > -1) {
			$tmp3 = "%";
		} else {
			$tmp3 = "";
		}
		return _hx_anonymous(array("id" => $id, "link" => _hx_string_or_null($tmp) . _hx_string_or_null($tmp1) . _hx_string_or_null($tmp2) . _hx_string_or_null($tmp3) . _hx_string_or_null($id) . _hx_string_or_null(Cyph::generateGuid(19))));
	}
	static function initiateSession($apiKey, $options = null, $services = null, $onData, $onError) {
		if($services === null) {
			$services = Cyph::$services;
		}
		$linkData = Cyph::generateLink($options, $services);
		Cyph::request(_hx_string_or_null($services->backend) . "/preauth/" . _hx_string_or_null($linkData->id), true, (new _hx_array(array(_hx_anonymous(array("k" => "Authorization", "v" => $apiKey))))), (new _hx_array(array())), array(new _hx_lambda(array(&$linkData, &$onData), "Cyph_0"), 'execute'), $onError);
	}
	function __toString() { return 'Cyph'; }
}
Cyph::$addressSpace = _hx_deref((new _hx_array(array("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"))))->map(array(new _hx_lambda(array(), "Cyph_1"), 'execute'));
Cyph::$services = _hx_anonymous(array("backend" => "https://api.cyph.com", "chat" => "https://cyph.im/#", "video" => "https://cyph.video/#", "voice" => "https://cyph.audio/#"));
Cyph::$options = _hx_anonymous(array("disableP2P" => 1, "modestBranding" => 2, "nativeCrypto" => 3, "telehealth" => 4, "video" => 5, "voice" => 6));
function Cyph_0(&$linkData, &$onData, $data) {
	{
		call_user_func_array($onData, array($linkData->link));
	}
}
function Cyph_1($s) {
	{
		return _hx_char_code_at($s, 0);
	}
}
