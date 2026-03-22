(ns problems.44)

;; Problem 44, Rotate Sequence
;; Difficulty: medium
;; Write a function which can rotate a sequence in either direction

;; Brainstorm
;; 

(split-at 2 [1 2 3 4 5])
(first (split-at 2 [1 2 3 4 5]))
(last (split-at 2 [1 2 3 4 5]))

;; solution
(defn p0044
  [n coll]
  (if (> n (count coll))
    (p0044 (- n (count coll)) coll)
    (if (< n 0)
      (p0044 (+ (count coll) n) coll)
      (let [s (split-at n coll)
            part1 (first s)
            part2 (last s)]
        (concat part2 part1)))))



;; Tests
[(= (p0044 2 [1 2 3 4 5]) '(3 4 5 1 2))
 (= (p0044 -2 [1 2 3 4 5]) '(4 5 1 2 3))
 (= (p0044 6 [1 2 3 4 5]) '(2 3 4 5 1))
 (= (p0044 1 '(:a :b :c)) '(:b :c :a))
 (= (p0044 -4 '(:a :b :c)) '(:c :a :b))]