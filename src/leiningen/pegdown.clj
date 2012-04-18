(ns leiningen.pegdown
  (:import [org.pegdown PegDownProcessor]))


(defn render-from-file [source-file]
  (.markdownToHtml 
    (PegDownProcessor.) 
    (slurp source-file)))

(defn pegdown [project source-file] 
  (println (render-from-file source-file)))
