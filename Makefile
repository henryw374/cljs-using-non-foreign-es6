cljs:
	clj -m cljs.main -O advanced -o cadv.js -c jstest.cljs-entrypoint 
es6:
	java -jar closure-compiler-v20200517.jar \
	 --warning_level=QUIET \
	  --module_resolution=NODE \
	  --dependency_mode=PRUNE \
	  -O ADVANCED \
	  --js "./src/jstest/**.js" \
	  --js "./closure-library-20200614/closure/**.js" \
	  --entry_point="./src/jstest/js-entrypoint.js" \
	  --js_output_file adv.js