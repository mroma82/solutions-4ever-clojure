(ns problems.42)

;; Problem 42, Factorial Fun
;; Difficulty: easy
;; Write a function which calculates factorials.

(defn p0042
  [n]
  (if (= n 1)
    1
    (* n (p0042 (- n 1)))))

(= (p0042 1) 1)

(= (p0042 3) 6)

(= (p0042 5) 120)

(= (p0042 8) 40320)