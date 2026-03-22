(ns problems.38)

(def f038
  (fn [& lst]
    ((fn [lst max]
       (if (empty? lst) max
           (let [x (first lst)]
             (recur (rest lst) (if (> x max) x max))))) lst 0)))

;; (f038 1 8 3 4) ;=> 8

