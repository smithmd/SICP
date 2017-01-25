(defn square [x]
  (* x x))

(defn expt-iter [b n a]
  (cond
    (= n 0)
    a

    (even? n)
    (expt-iter (square b) (/ n 2) a)

    :else
    (expt-iter b (dec n) (* a b))))


(defn fast-expt [b n]
  (expt-iter b n 1))

(fast-expt 2 2) ; 4
(fast-expt 2 3) ; 8
(fast-expt 5 5) ; 3125
