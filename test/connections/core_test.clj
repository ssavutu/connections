(ns connections.core-test
  (:require [clojure.test :refer [deftest is testing]]
            [connections.core :as core]))

(deftest greet-test
  (testing "greeting includes the name"
    (is (= "Hello, world!" (core/greet "world")))))
