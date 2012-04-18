(ns leiningen.pegdown
  (:import [org.pegdown PegDownProcessor]))


(defn pegdown [source-file] 
  (.markdownToHtml 
    (PegDownProcessor.) 
    (slurp source-file)))
