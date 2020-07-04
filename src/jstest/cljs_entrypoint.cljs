(ns jstest.cljs-entrypoint
  ;what goes here to get the es6 file?
  (:require [jstest.es6demoexport :as foo])
  )

(def v (-> (.-Foo foo) (.bar)))

(js/console.log "hello " v )

