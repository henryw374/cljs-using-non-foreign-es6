(ns jstest.cljs-entrypoint
  (:require [jstest.es6demoexport :as foo])
  )

(def v (-> (.-Foo foo) (.bar)))

(js/console.log "hello " v )

