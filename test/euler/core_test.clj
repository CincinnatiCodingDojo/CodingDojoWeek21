(ns euler.core-test
  (:require [midje.sweet :refer :all]
            [euler.core :refer :all]))

;(fact "a composite number should not be considered prime"
;  (prime? 2) => true
;  (prime? 4) => false)

(fact "a factor divides its multiples"
  (divides? 6 3) => true
  (divides? 7 3) => false)

(fact "buildPrimes returns a set of prime numbers"
  (buildPrimes 10 #{} 2) => #{2 3 5 7})

(fact "isNextPrime return the true if next number is prime"
  (isNextPrime #{2 3 5 7} 11 ) => true
  )

(fact "isNextPrime returns false if next number is not prime"
  (isNextPrime #{2 3 5 7} 10 ) => false
  (isNextPrime #{2 3 5 7} 12 ) => false
  )

(fact "get prime factors"
  (get-factors 15 #{2 3 5 7 11 13}) => '(3 5))

(fact "get largest prime factor"
  (get-largest-prime-factor 13195)=> 29
  )

(fact "solve euler 3"
  (get-largest-prime-factor 600851475143) => 6857)
