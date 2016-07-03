(function () {


var isNode	= false;
if (typeof module !== 'undefined' && module.exports) {
	isNode	= true;
	crypto	= require('crypto');
}


var Cyph	= (function () {
	var addressSpace	= [
		'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
		'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
		'k', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
		'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E',
		'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
		'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
	];

	var maxUint32		= 4294967296;

	var services		= {
		chat: 'cyph.im',
		voice: 'cyph.audio',
		video: 'cyph.video'
	};

	function generateGuid (length) {
		return Array.prototype.slice.call(
			isNode ?
				new Uint32Array(new Uint8Array(crypto.randomBytes(4 * length)).buffer) :
				crypto.getRandomValues(new Uint32Array(length))
		).map(function (n) {
			return addressSpace[Math.floor(n / maxUint32 * addressSpace.length)];
		}).
		join('');
	}

	return {
		options: {
			voice: 1,
			video: 2,
			modestBranding: 3,
			disableP2P: 4,
			nativeCrypto: 5
		},

		initiateSession: function (opts) {
			if (!opts) {
				opts	= [];
			}

			return 'https://' +
				(
					opts.indexOf(this.options.video) > -1 ?
						services.video :
						opts.indexOf(this.options.voice) > -1 ?
							services.voice :
							services.chat
				) +
				'/#' +
				(opts.indexOf(this.options.modestBranding) > -1 ? '&' : '') +
				(opts.indexOf(this.options.disableP2P) > -1 ? '$' : '') +
				(opts.indexOf(this.options.nativeCrypto) > -1 ? '%' : '') +
				generateGuid(26)
			;
		}
	};
}());


if (isNode) {
	module.exports	= Cyph;
}
else {
	self.Cyph		= Cyph;
}


}());
