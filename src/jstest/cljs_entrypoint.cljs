(ns jstest.cljs-entrypoint
  ;what goes here to get the es6 file?
  (:require ["es6demo" :as foo])
  )

(def v (-> (.-Foo foo) (.bar)))

(js/console.log "hello " v )

