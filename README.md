# map->nsmap
Apply the string _n_ to the supplied structure _m_ as a namespace.
```clojure
(map->nsmap {:a 1 :b 2} "foo.bar")

=> #:foo.bar{:a 1, :b 2}
```
