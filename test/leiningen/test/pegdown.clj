(ns leiningen.test.pegdown
    (:use leiningen.pegdown
          midje.sweet))

(fact 
  (pegdown 
    "test-resources/test.markdown") => "<h1>test</h1><h2>test</h2>")


