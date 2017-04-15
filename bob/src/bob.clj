(ns bob)
(require '[clojure.string :as str])

(defn has-letter?
  [text]
  (some? (re-matches #".*([A-Z]|[a-z])+.*$" text)))

(defn is-shout?
  [text]
  (and (= (str/upper-case text) text)
       (has-letter? text)))

(defn is-question? [text] (= (last text) \?))

(defn is-blank? [text] (some? (re-matches #"\s*$" text)))

(defn response-for [text]
  (cond
    (is-shout? text) "Whoa, chill out!"
    (is-question? text) "Sure."
    (is-blank? text) "Fine. Be that way!"
    :else "Whatever."))
