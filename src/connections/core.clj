(ns connections.core
  (:gen-class))

(defn greet
  [name]
  (str "Hello, " name "!"))

(defn -main
  [& args]
  (println (greet (or (first args) "world"))))
