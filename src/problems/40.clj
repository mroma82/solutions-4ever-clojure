(ns problems.40)

;;Problem 40, Interpose a Seq
;;Difficulty: easy
;;Write a function which separates the items of a sequence by an arbitrary value.

(defn f0040
  [char lst]
  ((fn [char lst rtn]
     (if (empty? lst)
       rtn
       (if (= 1 (count lst))
         (concat rtn [(first lst)])
         (recur char (rest lst) (concat rtn [(first lst) char]))))) char lst []))


(= (f0040 0 [1 2 3]) [1 0 2 0 3])

(= (apply str (f0040 ", " ["one" "two" "three"])) "one, two, three")

(= (f0040 :z [:a :b :c :d]) [:a :z :b :z :c :z :d])