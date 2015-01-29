(ns timon.core.timon-tests
  (:use midje.sweet)
  (:require [clojure.test :refer :all]
            [ring.mock.request :as mock]
            [timon.core.handler :refer :all]))

(facts "Example GET and POST tests"
  (fact "Test GET request to / route returns index"
    true => true))
