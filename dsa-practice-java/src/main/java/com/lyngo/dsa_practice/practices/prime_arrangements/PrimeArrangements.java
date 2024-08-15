package com.lyngo.dsa_practice.practices.prime_arrangements;

public class PrimeArrangements {

    public int numPrimeArrangements(int n) {
        int prime = 0, nonPrime = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                prime++;
            } else {
                nonPrime++;
            }
        }
        return calculatePermutations(prime, prime) * calculatePermutations(nonPrime, nonPrime);
    }

    public boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        int boundary = (int) Math.ceil(Math.sqrt(n));
        for (int i = 2; i < boundary; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int calculatePermutations(int n, int r) {
        return calculateFactorial(n) / calculateFactorial(n-r);
    }

    public int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}