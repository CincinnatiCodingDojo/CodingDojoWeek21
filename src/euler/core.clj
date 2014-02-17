(ns euler.core
  (:gen-class))

(defn divides? [product factor]
  (zero? (mod product factor)))
;
;(defn prime? [x]
;    (contains? (buildPrimes (sqrt x), []) x)
;)

(defn buildPrimes  [max, knownPrimes, current]
  (cond
    (= current max)
      knownPrimes
    (isNextPrime knownPrimes current)
      (recur max (conj knownPrimes current) (+ current 1))
    :else
      (recur max knownPrimes (+ current 1))))

(defn isNextPrime [primes candidate]
  (not (some (partial divides? candidate) primes)))


(defn get-factors [testNumber primes]
  (filter (partial divides? testNumber) primes)
  )

( defn get-largest-prime-factor [testNumber]
  (last (get-factors testNumber (buildPrimes testNumber #{} 2)))
  )
