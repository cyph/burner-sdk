<?php

class SecureRandom {
	public function __construct(){}
	static function getSecureRandomBytes($length) {
		$reason = "";
		try {
			$out = haxe_io_Bytes::alloc($length);
			$input = sys_io_File::read("/dev/urandom", null);
			$input->readBytes($out, 0, $length);
			$input->close();
			return $out;
		}catch(Exception $__hx__e) {
			$_ex_ = ($__hx__e instanceof HException) ? $__hx__e->e : $__hx__e;
			$e = $_ex_;
			{
				$reason = "" . Std::string($e);
			}
		}
		throw new HException("Can't find a secure source of random bytes. Reason: " . _hx_string_or_null($reason));
	}
	function __toString() { return 'SecureRandom'; }
}
