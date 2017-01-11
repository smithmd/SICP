; recursive
(defn factorial-recur [n]
  (if (= n 1)
    1
    (* n (factorial-recur (- n 1)))))

(factorial-recur 3) ;   6
(factorial-recur 4) ;  24
(factorial-recur 5) ; 120


; iterative
(defn factorial-iterate [n]
  (defn fact-iter [product counter max-count]
    (if (> counter max-count)
      product
      (fact-iter (* product counter)
                 (+ counter 1)
                 max-count)))
  (fact-iter 1 1 n))

(factorial-iterate 5) ; 120
