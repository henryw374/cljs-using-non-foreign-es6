(ns jstest.cljs-entrypoint
  (:require [jstest.es6demoexport])
  )

(def v (-> (.-Foo jstest.es6demoexport) (.bar)))

(js/console.log "hello " v )

