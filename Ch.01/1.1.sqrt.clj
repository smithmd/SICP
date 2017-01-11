(defn abs [n] (max n (- n)))
(defn square [x] (* x x))
(defn average [x y] (/ (+ x y) 2))

(defn sqrt [x]
  (defn good-enough? [guess]
    (< (abs (- (square guess) x)) 0.001))
  (defn improve [guess]
    (average guess (/ x guess)))
  (defn sqrt-iter [guess]
    (if (good-enough? guess)
      guess
      (sqrt-iter (improve guess))))
  (sqrt-iter 1.0))

(sqrt 4.0)
(sqrt 16.0)
(sqrt 2.0)
(sqrt 2)
