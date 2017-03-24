var Cyph				= require('./dist/js/Cyph').Cyph;
var initiateSession		= Cyph.initiateSession;

Cyph.initiateSession	= function (apiKey, options, services, onData, onError) {
	if (onData || onError) {
		return initiateSession.call(
			Cyph,
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
				Cyph,
				apiKey,
				options,
				services,
				resolve,
				reject
			);
		});
	}
};

module.exports	= Cyph;
