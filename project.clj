(defproject problems "0.1.0-SNAPSHOT"
  :description "Solutions for 4ever-clojure"
  :url "https://www.romacode.com"
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :main ^:skip-aot problems.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
