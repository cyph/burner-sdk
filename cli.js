#!/usr/bin/env node


var cyph	= require('./module');

var apiKey	= process.argv[2];

if (!apiKey) {
	console.error('An API key is required.');
	return;
}

cyph.initiateSession(
	apiKey,
	process.argv.slice(3).
		map(function (arg) {
			return cyph.options[arg];
		}).filter(function (option) {
			return !isNaN(option);
		})
	,
	process.argv.slice(3).reduce(
		function (services, arg) {
			if (services) {
				return services;
			}

			try {
				services	= JSON.parse(arg);
			}
			catch (_) {
				return;
			}

			var keys	= ['chat'];
			for (var i = 0 ; i < keys.length ; ++i) {
				var k	= keys[i];
				if (typeof cyph.services[k] !== typeof services[k]) {
					return;
				}
			}

			return services;
		},
		undefined
	)
).then(function (cyphUrl) {
	console.log(cyphUrl);
}).catch(function (err) {
	console.error(err);
});
