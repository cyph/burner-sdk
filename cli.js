#!/usr/bin/env node

const Cyph	= require('./module');

console.log(Cyph.initiateSession(
	process.argv.slice(2).map(arg => Cyph.options[arg])
));
