(ns calebmacdonaldblack.map-to-nsmap-test
  (:require
    [clojure.test :refer :all]
    [calebmacdonaldblack.map-to-nsmap :refer [map->nsmap]]))

(deftest map->nsmap-test
  (is (= {:foo/a 1 :foo/b 2}
         (map->nsmap {:a 1 :b 2} "foo")))

  (is (= {:foo.bar/a 1 :foo.bar/b 2}
         (map->nsmap {:a 1 :b 2} "foo.bar"))))
