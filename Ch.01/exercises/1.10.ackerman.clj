(defn A
  "Ackerman's Function"
  [x y]
  (cond (= y 0) 0
        (= x 0) (* 2 y)
        (= y 1) 2
        :else (A (- x 1)
                 (A x (- y 1)))))

(A 1 10) ; 1024
(A 2 4) ; 65536
(A 3 3) ; 65536
(A 1 1) ; 2
(A 0 0) ; 0


; Doubles the parameter passed in
(defn f [n]
  (A 0 n))
(f 1)
(f 3)
(f 6)
(f 12)


; returns 2^n
(defn g [n]
  (A 1 n))
(g 1)
(g 2)
(g 3)
(g 4)
(g 5)


; (h (- n 1)) ^ (h (- n 2))
(defn h [n]
  (A 2 n))
(h 1)
(h 2)
(h 3)
(h 4)


; 5n^2
(defn k [n]
  (* 5 n n))
(k 1)
(k 2)
(k 3)
(k 4)
(k 5)


