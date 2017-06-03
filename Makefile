all:
	rm -rf dist SecureRandom.hx 2> /dev/null
	mkdir dist

	curl -s https://raw.githubusercontent.com/soywiz/haxe-crypto/6fd0f8110f1e432b5b9dbd64d8229d8c151a53bb/src/com/hurlant/crypto/prng/SecureRandom.hx | \
		tail -n+3 > SecureRandom.hx

	haxe Cyph -cpp dist/cpp
	rm -rf dist/cpp/obj

	# haxe Cyph -cs dist/cs

	haxe Cyph -java dist/java

	mkdir dist/js
	haxe Cyph -js dist/js/Cyph.full.js
	uglifyjs dist/js/Cyph.full.js -m -o dist/js/Cyph.js
	rm dist/js/Cyph.full.js

	haxe Cyph --php-lib cyph -php dist/php

	# mkdir dist/python
	# haxe Cyph -python dist/python/Cyph.py

	rm SecureRandom.hx

clean:
	rm -rf dist SecureRandom.hx
