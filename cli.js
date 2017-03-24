#!/usr/bin/env node


var Cyph	= require('./module');

var apiKey	= process.argv[2];

if (!apiKey) {
	console.error('An API key is required.');
	return;
}

Cyph.initiateSession(
	apiKey,
	process.argv.slice(3).
		map(function (arg) {
			return Cyph.options[arg];
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

			var keys	= Object.keys(Cyph.services);
			for (var i = 0 ; i < keys.length ; ++i) {
				var k	= keys[i];
				if (typeof Cyph.services[k] !== typeof services[k]) {
					return;
				}
			}

			return services;
		},
		undefined
	),
	function (cyphUrl) { console.log(cyphUrl); },
	function (err) { console.error(err); }
);
