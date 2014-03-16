(defproject cljs-game "0.0.1"
  :description "FIXME: write this!"
  :url "http://exampl.com/FIXME"
  :dependencies [
                 [org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2173"]
;;                  [ibdknox/clojure "1.5.0-ibdknox5"]
                 [jayq "2.5.0"]
                 [crate "0.2.1"]]
  :plugins [
            [lein-cljsbuild "1.0.2"]]

  :cljsbuild
  {:builds
   [{:source-paths ["cljs/"],
     :compiler
     {:pretty-print true,
      :output-dir "resources/tmp/",
      :output-to "js/generated/bootstrap.js",
      :externs ["externs/jquery.js"],
      :optimizations :simple}}]}

  :source-paths ["cljs/"
                 "/Users/chris/repos/cljs/clojurescript/src/clj"
                 "/Users/chris/repos/cljs/clojurescript/src/cljs"])

