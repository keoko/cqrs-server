(defproject cqrs-server "0.1.1"
  :description "Implementation of a simple CQRS server using Onyx"
  :url "https://github.com/Yuppiechef/cqrs-server"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies
  [[org.clojure/clojure "1.6.0"]
   [prismatic/schema "0.4.2"]
   [danlentz/clj-uuid "0.1.2-SNAPSHOT"]

   [org.apache.httpcomponents/httpcore "4.3"]
   [org.apache.httpcomponents/httpclient "4.3"]
   [com.taoensso/nippy "2.8.0"]

   [zookeeper-clj "0.9.3"]
   [org.slf4j/slf4j-api "1.7.7"]
   [org.clojure/data.json "0.2.3"]
   [org.apache.zookeeper/zookeeper "3.4.6"]
   [com.mdrogalis/onyx "0.5.3"]
   [com.mdrogalis/onyx-core-async "0.5.3"]
   [commons-codec "1.7"]
   [datomic-schema "1.2.2"]
   [org.clojure/core.async "0.1.346.0-17112a-alpha"]
   [criterium "0.4.3"]
   [yuppiechef/onyx-dynamodb "0.5.0"]
   [com.taoensso/faraday "1.5.0" :exclusions [org.clojure/clojure]]
   [com.mdrogalis/onyx-datomic "0.5.2"]
   [com.mdrogalis/onyx-kafka "0.5.3" :exclusions [org.slf4j/slf4j-simple]]
   [org.hornetq/hornetq-commons "2.4.0.Final"]
   [org.hornetq/hornetq-core-client "2.4.0.Final"]
   [org.hornetq/hornetq-server "2.4.0.Final"]]
  :profiles
  {:dev
   {:dependencies
    [[com.datomic/datomic-free "0.9.5130" :exclusions [org.slf4j/slf4j-nop org.slf4j/log4j-over-slf4j joda-time]]]}
   :prod
   {:dependencies
    [[com.datomic/datomic-pro "0.9.5130" :exclusions [org.slf4j/slf4j-nop org.slf4j/log4j-over-slf4j joda-time]]]}}
  :repl-options { :init-ns cqrs-server.core :timeout 120000}
  :main cqrs-server.core)
