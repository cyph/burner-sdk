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
	static function request($url, $post, $headers, $parameters, $onData, $onError) {
		$http = new haxe_Http($url);
		$http->onData = $onData;
		$http->onError = $onError;
		if($post) {
			$http->setPostData("");
		}
		{
			$_g = 0;
			while($_g < $headers->length) {
				$o = $headers[$_g];
				++$_g;
				$http->setHeader($o->k, $o->v);
				unset($o);
			}
		}
		{
			$_g1 = 0;
			while($_g1 < $parameters->length) {
				$o1 = $parameters[$_g1];
				++$_g1;
				$http->setParameter($o1->k, $o1->v);
				unset($o1);
			}
		}
		$http->request($post);
	}
	static function generateLink($options, $services) {
		$id = Cyph::generateGuid(7);
		return _hx_anonymous(array("id" => $id, "link" => _hx_string_or_null((Cyph_1($id, $options, $services))) . _hx_string_or_null(((($options->indexOf(Cyph::$options->modestBranding, null) > -1) ? "!" : ""))) . _hx_string_or_null(((($options->indexOf(Cyph::$options->disableP2P, null) > -1) ? "\$" : ""))) . _hx_string_or_null($id) . _hx_string_or_null(Cyph::generateGuid(19))));
	}
	static function initiateSession($apiKey, $options = null, $services = null, $onData, $onError) {
		if($options === null) {
			$options = (new _hx_array(array()));
		} else {
			$options = new _hx_array($options);
		}
		if($services === null) {
			$services = Cyph::$services;
		} else {
			$services = _hx_anonymous($services);
		}
		if($services->backend === null) {
			$services->backend = Cyph::$services->backend;
		}
		if($services->telehealth === null) {
			$services->telehealth = _hx_string_or_null($services->chat) . "video/";
		}
		if($services->video === null) {
			$services->video = _hx_string_or_null($services->chat) . "video/";
		}
		if($services->voice === null) {
			$services->voice = _hx_string_or_null($services->chat) . "audio/";
		}
		$linkData = Cyph::generateLink($options, $services);
		Cyph::request(_hx_string_or_null($services->backend) . "/preauth/" . _hx_string_or_null($linkData->id), true, (new _hx_array(array(_hx_anonymous(array("k" => "Authorization", "v" => $apiKey))))), (new _hx_array(array())), array(new _hx_lambda(array(&$apiKey, &$linkData, &$onData, &$onError, &$options, &$services), "Cyph_2"), 'execute'), $onError);
	}
	function __toString() { return 'Cyph'; }
}
Cyph::$addressSpace = _hx_deref((new _hx_array(array("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"))))->map(array(new _hx_lambda(array(), "Cyph_3"), 'execute'));
Cyph::$services = _hx_anonymous(array("backend" => "https://api.cyph.com", "chat" => "https://cyph.im/#", "telehealth" => "https://cyph.healthcare/#", "video" => "https://cyph.video/#", "voice" => "https://cyph.audio/#"));
Cyph::$options = _hx_anonymous(array("disableP2P" => 1, "modestBranding" => 2, "telehealth" => 3, "video" => 4, "voice" => 5));
function Cyph_0(&$_g, &$byteLength, &$i, &$length, &$randomBytes, &$randomNumbers) {
	{
		$a = null;
		$a = Cyph_4($_g, $a, $byteLength, $i, $length, $randomBytes, $randomNumbers);
		return Cyph_5($_g, $a, $byteLength, $i, $length, $randomBytes, $randomNumbers) / 4294967296.0;
	}
}
function Cyph_1(&$id, &$options, &$services) {
	if($options->indexOf(Cyph::$options->telehealth, null) > -1) {
		return $services->telehealth;
	} else {
		if($options->indexOf(Cyph::$options->video, null) > -1) {
			return $services->video;
		} else {
			if($options->indexOf(Cyph::$options->voice, null) > -1) {
				return $services->voice;
			} else {
				return $services->chat;
			}
		}
	}
}
function Cyph_2(&$apiKey, &$linkData, &$onData, &$onError, &$options, &$services, $data) {
	{
		call_user_func_array($onData, array($linkData->link));
	}
}
function Cyph_3($s) {
	{
		return _hx_char_code_at($s, 0);
	}
}
function Cyph_4(&$_g, &$a, &$byteLength, &$i, &$length, &$randomBytes, &$randomNumbers) {
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
function Cyph_5(&$_g, &$a, &$byteLength, &$i, &$length, &$randomBytes, &$randomNumbers) {
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
