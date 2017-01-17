(defn pascal [end-depth cur-depth prev-row]
  (defn get-row []
    (concat [1] (map + prev-row (rest prev-row)) [1]))

  (cond (= end-depth 0) (list 1)
        (= end-depth 1) (list 1 1)
        (= cur-depth end-depth) (get-row)
        :else (pascal end-depth (+ cur-depth 1) (get-row))))

(pascal 0 1 [1]) ; (1)
(pascal 1 1 [1]) ; (1 1)
(pascal 2 1 [1]) ; (1 2 1)
(pascal 3 1 [1]) ; (1 3 3 1)
(pascal 4 1 [1]) ; (1 4 6 4 1)
(pascal 5 1 [1]) ; (1 5 10 10 5 1)
(pascal 6 1 [1]) ; (1 6 15 20 15 6 1)
(pascal 7 1 [1]) ; (1 7 21 35 35 21 7 1)
(pascal 8 1 [1]) ; (1 8 28 56 70 56 28 8 1)
