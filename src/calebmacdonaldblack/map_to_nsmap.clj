(ns calebmacdonaldblack.map-to-nsmap)

(defn map->nsmap
  "Apply the string n to the supplied structure m as a namespace."
  [m n]
  (clojure.walk/postwalk
    (fn [x]
      (if (keyword? x)
        (keyword n (name x))
        x))
    m))
