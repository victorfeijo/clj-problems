(ns bob)
(require '[clojure.string :as str])

(defn response-for [text]
  (cond
    (= (str/upper-case text) text) "Whoa, chill out!"
    (= (last text) \?) "Sure."
    (= (last text) nil) "Fine. Be that way!"
    :else "Whatever."))
