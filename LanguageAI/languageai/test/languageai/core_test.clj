(ns languageai.core-test
  (:require [clojure.test :refer :all]
            [languageai.core :refer :all]))

(deftest a-test
  (testing (ConversationAi)
    (is (=(or ( = aigender "Male")(= aigender "Female")) true)))
    )
