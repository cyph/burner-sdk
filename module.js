var cyph				= require('./dist/js/Cyph').Cyph;
var initiateSession		= cyph.initiateSession;

cyph.initiateSession	= function (apiKey, options, services, onData, onError) {
	if (onData || onError) {
		return initiateSession.call(
			cyph,
			apiKey,
			options,
			services,
			onData,
			onError
		);
	}
	else {
		return new Promise(function (resolve, reject) {
			initiateSession.call(
				cyph,
				apiKey,
				options,
				services,
				resolve,
				reject
			);
		});
	}
};

cyph.cyph		= cyph;
module.exports	= cyph;
