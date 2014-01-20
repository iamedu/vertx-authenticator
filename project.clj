(defproject org.iamedu.vertx-authenticator "0.1.0-SNAPSHOT"
  :description "Vertx authenticator with memory"
  :url "https://github.com/iamedu/vertx-authenticator"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :plugins [[lein-vertx "0.2.0-SNAPSHOT"]]
  :vertx {:main iamedu.vertx-authenticator.core/init
          :author "Eduardo Díaz"
          :keywords ["MongoDB" "Vert.x" "authenticator"]
          :developers ["Eduardo Díaz"]})
