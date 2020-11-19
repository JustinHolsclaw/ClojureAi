;Justin Holsclaw
;11/18/2020
;The purpose of this project is to create an AI and randomly assign it a gender. Then based off of this gender,
;select a response that is modified for that gender. (This is because gender is very important in the Spanish Language).
;The user can also answer with responses that have been changed to reflect their gender.

;My Three implemented things are vectors, maps, and lieningen

(ns languageai.core
  (:gen-class))

(defn User []
(def username "asdf")
(def gender "asdf")
)

(defn determineGender[]
(if (= (rand-nth [1 2]) 1) ;Vector database containing 1 and 2
  (def aigender "Female")
  (def aigender "Male")
)
)

(defn Random [] (rand-nth [:a :b :c :d :e]))

 (defn SetName []
 (def MaleNames  {:a "Roberto" :b "Julian" :c "Joaquin" :d "Randell" :e "Angel"}) ;Maps
(def FemaleNames  {:e "Juliet" :d "Sondra" :c "Sofia" :b "Lucia" :a "Luna"})
 (if (= aigender "Female")
 (do (def ainame (get FemaleNames (Random))))
 (do (def ainame (get MaleNames (Random)))))
 )

(defn ConversationAi []
(def ainame "Person")
(def aigender "Neutral")
(determineGender)
(SetName)
(println aigender)
(println ainame)
)


(defn -main
  [& args]
  (User)
  (ConversationAi)
  )

  