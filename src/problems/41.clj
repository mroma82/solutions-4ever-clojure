(ns problems.41)

;; Problem 41, Drop Every Nth Item
;; Difficulty: easy
;; Write a function which drops every Nth item from a sequence.

(def f0041
  (fn [lst n]
    ((fn f [lst n i]
       (if (empty? lst)
         []
         (if (= i n)
           (f (rest lst) n 1)
           (concat [(first lst)] (f (rest lst) n (+ i 1)))))) lst n 1)))

(f0041 [1 2 3 4 5 6 7 8] 3)
(= (f0041 [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])

(= (f0041 [:a :b :c :d :e :f] 2) [:a :c :e])

(= (f0041 [1 2 3 4 5 6] 4) [1 2 3 5 6])