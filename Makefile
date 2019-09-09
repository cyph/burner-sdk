all:
	rm -rf dist 2> /dev/null
	mkdir dist

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

clean:
	rm -rf dist SecureRandom.hx
