# @cyph/sdk

## Overview

The Cyph SDK allows third-party services to initiate new Cyph sessions.

The core functionality is to create an ephemeral encrypted text chat link that can be
shared with two parties.

Additionally, the following optional features are supported:

* `disableP2P`: Disables P2P networking for voice/video calls, with traffic instead
routed through Twilio's low-latency network traversal infrastructure

* `modestBranding`: Uses modest branding (greyscale UI with toned down Cyph branding)

* `telehealth`: Goes directly into a video call in telehealth application

* `video`: Goes directly into a video call

* `voice`: Goes directly into a voice call

## Language Support

This library is built using [Haxe](https://en.wikipedia.org/wiki/Haxe),
which enables using one code base to target many different platforms.

Supported languages:

* Command line shell

* JavaScript / TypeScript (Node.js + browser)

* PHP

The following languages have experimental support:

* C++

* Java

## Example Uses

Command line shell:

	cyph-sdk $apiKey
	# https://cyph.im/#2D2gzbqggQxTaanHZYbDXb8fVr


	cyph-sdk $apiKey voice
	# https://cyph.audio/#1nckgXAumVXWjmwrYdSjXaZGW


	cyph-sdk \
		$apiKey \
		disableP2P \
		modestBranding \
		video \
		'{"chat": "https://starfleet.cyph.ws/#"}'
	# https://starfleet.cyph.ws/#video/#!$1ro2HQ4q7wBbC7hHCF2oWggVGe

JavaScript (ES2017) / TypeScript:

	import {cyph} from '@cyph/sdk';

	(async () => {


	console.log(await cyph.initiateSession(apiKey));


	console.log(await cyph.initiateSession(apiKey, [cyph.options.voice]));


	console.log(
		await cyph.initiateSession(
			apiKey,
			[
				cyph.options.disableP2P,
				cyph.options.modestBranding,
				cyph.options.video
			],
			{chat: 'https://starfleet.cyph.ws/#'}
		)
	);


	})();

JavaScript (ES5):

	var cyph = require('@cyph/sdk');


	cyph.initiateSession(
		apiKey,
		undefined,
		undefined,
		function (cyphLink) { console.log(cyphLink); },
		function (err) { console.error(err); }
	);


	cyph.initiateSession(
		apiKey,
		[cyph.options.voice],
		undefined,
		function (cyphLink) { console.log(cyphLink); },
		function (err) { console.error(err); }
	);


	cyph.initiateSession(
		apiKey,
		[
			cyph.options.disableP2P,
			cyph.options.modestBranding,
			cyph.options.video
		],
		{chat: 'https://starfleet.cyph.ws/#'},
		function (cyphLink) { console.log(cyphLink); },
		function (err) { console.error(err); }
	);

PHP:

	foreach (glob('cyph/*/*.php') as $f) include $f;
	foreach (glob('cyph/*.php') as $f) include $f;


	Cyph::initiateSession(
		$apiKey,
		null,
		null,
		function ($cyphLink) { echo $cyphLink; },
		function ($err) { echo $err; }
	);


	Cyph::initiateSession(
		$apiKey,
		[Cyph::$options->voice],
		null,
		function ($cyphLink) { echo $cyphLink; },
		function ($err) { echo $err; }
	);


	Cyph::initiateSession(
		$apiKey,
		[
			Cyph::$options->disableP2P,
			Cyph::$options->modestBranding,
			Cyph::$options->video
		],
		array('chat' => 'https://starfleet.cyph.ws/#'),
		function ($cyphLink) { echo $cyphLink; },
		function ($err) { echo $err; }
	);

# Coming Soon

Python 3 will be supported after an upcoming release of Haxe, as in the following example:

	from Cyph import Cyph


	Cyph.initiateSession(
		apiKey,
		onData = lambda cyphLink: print(cyphLink),
		onError = lambda err: print(err)
	)


	Cyph.initiateSession(
		apiKey,
		[Cyph.options.voice],
		onData = lambda cyphLink: print(cyphLink),
		onError = lambda err: print(err)
	)


	Cyph.initiateSession(
		apiKey,
		[
			Cyph.options.disableP2P,
			Cyph.options.modestBranding,
			Cyph.options.video
		],
		{'chat': 'https://starfleet.cyph.ws/#'},
		lambda cyphLink: print(cyphLink),
		lambda err: print(err)
	)
