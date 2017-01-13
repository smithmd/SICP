; fibonacci
(defn fib [n]
  (cond (= n 0) 0
        (= n 1) 1
        :else (+ (fib (- n 1))
                 (fib (- n 2)))))

(fib 1) ; 1
(fib 2) ; 1
(fib 3) ; 2
(fib 4) ; 3
(fib 5) ; 5
(fib 6) ; 8
(fib 7) ; 13
(fib 8) ; 21


;; fibonacci iterative
(defn fibi [n]
  (defn fib-iter [a b count]
    (if (= count 0)
      b
      (fib-iter (+ a b) a (- count 1))))
  (fib-iter 1 0 n))

(fibi 1) ; 1
(fibi 6) ; 8
(fibi 8) ; 21
(fibi 9) ; 34
