; recursive exponents
(defn expt [b n]
  (if (= n 0)
    1
    (* b (expt b (- n 1)))))

(expt 2 4) ; 16
(expt 3 3) ; 27
(expt 2 5) ; 32
(expt 6 3) ; 216


; linear recursive
(defn expt-lr [b n]
  (defn expt-iter [counter product]
    (if (= counter 0)
      product
      (expt-iter (dec counter)
                 (* b product))))
  (expt-iter n 1))

(expt-lr 2 4) ; 16
(expt-lr 3 3) ; 27
(expt-lr 2 5) ; 32
(expt-lr 6 3) ; 216


; successive squares
(defn square [n]
  (* n n))

(defn fast-expt [b n]
  (cond (= n 0)
          1

        (even? n)
          (square (fast-expt b (/ n 2)))

        :else
          (* b (fast-expt b (dec n)))))

(fast-expt 2 4) ; 16
(fast-expt 3 3) ; 27
(fast-expt 6 3) ; 216
(fast-expt 2 5) ; 32
(fast-expt 100 2) ; 10000

