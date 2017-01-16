; recursive (works)
(defn f [n]
  (cond (< n 3) n
        :else (+ (f (- n 1))
                 (* 2 (f (- n 2)))
                 (* 3 (f (- n 3))))))

(f 1)
(f 2)
(f 3)
(f 4)
(f 5)
(f 6)
(f 7)
(f 8)
(f 9)
(f 10)

; iterative
(defn fi [n]
  (defn new-n [n1 n2 n3]
    (+ n1 (* 2 n2) (* 3 n3)))

  (defn f-iter [n1 n2 n3 count]
    (cond (= count 1) 1
          (= count 2) 2
          (= count 3) (new-n n1 n2 n3)
          :else (f-iter
                  (new-n n1 n2 n3)
                  n1
                  n2
                  (- count 1))))
  (f-iter 2 1 0 n))

(fi 1)
(fi 2)
(fi 3)
(fi 4)
(fi 5)
(fi 6)
(fi 7)
(fi 8)
(fi 9)
(fi 10)
