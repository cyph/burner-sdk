The Cyph SDK allows third-party services to initiate new cyph sessions.

The following optional features are supported:

* `Cyph.options.voice`: Goes directly into a voice call

* `Cyph.options.video`: Goes directly into a video call

* `Cyph.options.modestBranding`: Uses modest branding (greyscale UI with toned down Cyph branding)

* `Cyph.options.disableP2P`: Disables P2P networking for voice/video calls, with traffic instead
routed through Twilio's low-latency network traversal infrastructure

* `Cyph.options.nativeCrypto`: Switches from our default cross-browser cryptographic primitives to a
set of FIPS-approved primitives natively implemented by Google Chrome and Mozilla Firefox

The following languages are supported:

* Bash/shell (via npm package)

* C++

* C#

* Java

* JavaScript (Node.js + browser)

* PHP

* Python

Example uses:

	Cyph.initiateSession() // "https://cyph.im/#2D2gzbqggQxTaanHZYbDXb8fVr"

	Cyph.initiateSession([Cyph.options.voice]) // "https://cyph.audio/#1nckgXAumVXWjmwrYdSjXaZGW"

	Cyph.initiateSession([
		Cyph.options.video,
		Cyph.options.modestBranding,
		Cyph.options.disableP2P,
		Cyph.options.nativeCrypto
	]) // "https://cyph.video/#&$%1ro2HQ4q7wBbC7hHCF2oWggVGe"
