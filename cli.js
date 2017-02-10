#!/usr/bin/env node


var Cyph	= require('./module');

var apiKey	= process.argv[2];

if (!apiKey) {
	console.error('An API key is required.');
	return;
}

Cyph.initiateSession(
	apiKey,
	process.argv.slice(3).map(function (arg) { return Cyph.options[arg]; }),
	function (cyphUrl) { console.log(cyphUrl); },
	function (err) { console.error(err); }
);
