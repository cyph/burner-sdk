# @cyph/sdk

## Overview

The Cyph SDK allows third-party services to initiate new Cyph sessions.

The core functionality is to create an ephemeral encrypted text chat link that can be
shared with two parties. Additionally, the following optional features are supported:

* `Cyph.options.disableP2P`: Disables P2P networking for voice/video calls, with traffic instead
routed through Twilio's low-latency network traversal infrastructure

* `Cyph.options.modestBranding`: Uses modest branding (greyscale UI with toned down Cyph branding)

* `Cyph.options.nativeCrypto`: Switches from our default cross-browser cryptographic primitives to a
set of FIPS-approved primitives natively implemented by Google Chrome and Mozilla Firefox

* `Cyph.options.telehealth`: Uses telehealth UI

* `Cyph.options.video`: Goes directly into a video call

* `Cyph.options.voice`: Goes directly into a voice call

## Language support

This library is built using [Haxe](https://en.wikipedia.org/wiki/Haxe),
which enables using one code base to target many different platforms.

The following languages are actively supported:

* Command line shell (via npm package)

* JavaScript / TypeScript (Node.js + browser)

* PHP

The following languages have experimental support:

* C++

* Java

## Example uses

JavaScript (ES2017) / TypeScript:

	import {Cyph} from '@cyph/sdk';

	(async () => {


	console.log(await Cyph.initiateSession(apiKey));
	// "https://cyph.im/#2D2gzbqggQxTaanHZYbDXb8fVr"


	console.log(await Cyph.initiateSession(apiKey, [Cyph.options.voice]));
	// "https://cyph.audio/#1nckgXAumVXWjmwrYdSjXaZGW"


	console.log(
		await Cyph.initiateSession(
			apiKey,
			[
				Cyph.options.disableP2P,
				Cyph.options.modestBranding,
				Cyph.options.nativeCrypto,
				Cyph.options.video
			],
			{
				backend: 'https://api.cyph.com',
				chat: 'https://starfleet.cyph.ws/#',
				video: 'https://starfleet.cyph.ws/#video/',
				voice: 'https://starfleet.cyph.ws/#audio/'
			}
		)
	);
	// "https://starfleet.cyph.ws/#video/#&$%1ro2HQ4q7wBbC7hHCF2oWggVGe"


	})();

JavaScript (ES5):

	var Cyph = require('@cyph/sdk');


	Cyph.initiateSession(
		apiKey,
		undefined,
		undefined,
		function (cyphLink) { console.log(cyphLink); },
		function (err) { console.error(err); }
	);


	Cyph.initiateSession(
		apiKey,
		[Cyph.options.voice],
		undefined,
		function (cyphLink) { console.log(cyphLink); },
		function (err) { console.error(err); }
	);


	Cyph.initiateSession(
		apiKey,
		[
			Cyph.options.disableP2P,
			Cyph.options.modestBranding,
			Cyph.options.nativeCrypto,
			Cyph.options.video
		],
		{
			backend: 'https://api.cyph.com',
			chat: 'https://starfleet.cyph.ws/#',
			video: 'https://starfleet.cyph.ws/#video/',
			voice: 'https://starfleet.cyph.ws/#audio/'
		},
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
			Cyph::$options->nativeCrypto,
			Cyph::$options->video
		],
		array(
			'backend' => 'https://api.cyph.com',
			'chat' => 'https://starfleet.cyph.ws/#',
			'video' => 'https://starfleet.cyph.ws/#video/',
			'voice' => 'https://starfleet.cyph.ws/#audio/'
		),
		function ($cyphLink) { echo $cyphLink; },
		function ($err) { echo $err; }
	);

Command line shell:

	cyph-sdk $apiKey


	cyph-sdk $apiKey voice


	cyph-sdk $apiKey disableP2P modestBranding nativeCrypto video '{
		"backend": "https://api.cyph.com",
		"chat": "https://starfleet.cyph.ws/#",
		"video": "https://starfleet.cyph.ws/#video/",
		"voice": "https://starfleet.cyph.ws/#audio/"
	}'

# Coming soon

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
			Cyph.options.nativeCrypto,
			Cyph.options.video
		],
		{
			'backend': 'https://api.cyph.com',
			'chat': 'https://starfleet.cyph.ws/#',
			'video': 'https://starfleet.cyph.ws/#video/',
			'voice': 'https://starfleet.cyph.ws/#audio/'
		},
		lambda cyphLink: print(cyphLink),
		lambda err: print(err)
	)
