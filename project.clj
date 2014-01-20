(defproject org.iamedu.vertx-authenticator "0.1.0-SNAPSHOT"
  :description "Vertx authenticator with memory"
  :url "https://github.com/iamedu/vertx-authenticator"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/core.async "0.1.267.0-0d7780-alpha"]
                 [com.lambdaworks/scrypt "1.4.0"]]
  :plugins [[lein-vertx "0.2.0-SNAPSHOT"]]
  :vertx {:main iamedu.vertx-authenticator.core/init
          :author "Eduardo Díaz"
          :keywords ["MongoDB" "Vert.x" "authenticator"]
          :developers ["Eduardo Díaz"]})
