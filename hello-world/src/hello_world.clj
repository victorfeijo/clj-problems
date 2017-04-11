(ns hello-world)

(defn hello
  ([]
  (str "Hello, World!")
  ([name]
  (str "Hello, " name "!")))
