(ns problems.43)

;; Problem 43, Reverse Interleave
;; Difficulty: medium
;; Write a function which reverses the interleave process into x number of subsequences.

(defn spread
  [lst n]
  )

(defn p0043
  [lst n] 
  (let [rtn (map (# []) (range n))])
  (for [i (range n)]
    
    ))


;; tests
[(= (p0043 [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6)))
 (= (p0043 (range 9) 3) '((0 3 6) (1 4 7) (2 5 8)))
 (= (p0043 (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9)))]

(map seq (range 3) (range 3) (range 3) (range 3))