(ns bob)
(require '[clojure.string :as str])

(defn is-shout?
  [text]
  (and (= (str/upper-case text) text)
       (nil? (re-matches #"[0-9]*$" text))))

(defn is-letter? )

(defn is-question? [text] (= (last text) \?))

(defn is-blank? [text] (some? (re-matches #"\s*$" text)))

(defn response-for [text]
  (cond
    (is-question? text) "Sure."
    (is-shout? text) "Whoa, chill out!"
    (is-blank? text) "Fine. Be that way!"
    :else "Whatever."))
