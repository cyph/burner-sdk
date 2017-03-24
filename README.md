The Cyph SDK allows third-party services to initiate new cyph sessions.

The following optional features are supported:

* `Cyph.options.disableP2P`: Disables P2P networking for voice/video calls, with traffic instead
routed through Twilio's low-latency network traversal infrastructure

* `Cyph.options.modestBranding`: Uses modest branding (greyscale UI with toned down Cyph branding)

* `Cyph.options.nativeCrypto`: Switches from our default cross-browser cryptographic primitives to a
set of FIPS-approved primitives natively implemented by Google Chrome and Mozilla Firefox

* `Cyph.options.telehealth`: Uses telehealth UI

* `Cyph.options.video`: Goes directly into a video call

* `Cyph.options.voice`: Goes directly into a voice call

The following languages are supported:

* Bash/shell (via npm package)

* C++

* C#

* Java

* JavaScript (Node.js + browser)

* PHP

* Python

Example uses:

	const Cyph = require('@cyph/sdk');

	Cyph.initiateSession(
		apiKey,
		undefined,
		undefined,
		cyphLink => console.log(cyphLink),
		err => console.error(err)
	); // "https://cyph.im/#2D2gzbqggQxTaanHZYbDXb8fVr"

	Cyph.initiateSession(
		apiKey,
		[Cyph.options.voice],
		undefined,
		cyphLink => console.log(cyphLink),
		err => console.error(err)
	); // "https://cyph.audio/#1nckgXAumVXWjmwrYdSjXaZGW"

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
		cyphLink => console.log(cyphLink),
		err => console.error(err)
	); // "https://starfleet.cyph.ws/#video/#&$%1ro2HQ4q7wBbC7hHCF2oWggVGe"
