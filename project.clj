(defproject misc "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
  				[mysql/mysql-connector-java "5.1.33"]]
  :main ^:skip-aot misc.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})






