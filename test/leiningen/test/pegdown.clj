(ns leiningen.test.pegdown
    (:use leiningen.pegdown
          midje.sweet))

(fact 
  (render-from-file 
    "test-resources/test.markdown") => "<h1>test</h1><h2>test</h2>")


