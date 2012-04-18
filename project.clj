(defproject lein-pegdown "0.1-SNAPSHOT"
  :description "Leiningen plugin for using pegdown in leiningen projects"
  :eval-in-leiningen true
  :dependencies [[org.pegdown/pegdown "1.1.0"]]
  :profiles {:dev {:dependencies [[midje "1.3.1"]]}}
  :plugins [[lein-midje "2.0.0-SNAPSHOT"]])
