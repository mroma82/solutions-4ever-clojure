(ns problems.39)

;;(concat ]
(def f0039
  (fn [lst1 lst2]
    ((fn [lst1 lst2 rtn]
       (print rtn)
       (if (or (empty? lst1) (empty? lst2))
         rtn
         (recur (rest lst1) (rest lst2) (concat rtn [(first lst1) (first lst2)])))) lst1 lst2 [])))

;; scratch pad
(f0039 [1 2 3] [:a :b :c])
(def lst1 [1 2 3])
(def lst2 [:a :b :c])
(empty? lst2)
(concat [] [(first lst1) (first lst2)])
(concat [1 2 3] [])

(= (f0039 [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))

(= (f0039 [1 2] [3 4 5 6]) '(1 3 2 4))

(= (f0039 [1 2 3 4] [5]) [1 5])

(= (f0039 [30 20] [25 15]) [30 25 20 15])