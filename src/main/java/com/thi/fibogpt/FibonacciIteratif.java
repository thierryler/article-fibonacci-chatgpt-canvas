package com.thi.fibogpt;

import java.math.BigInteger;

public class FibonacciIteratif implements Fibonacci {

    // Méthode itérative pour calculer le n-ième élément de la suite de Fibonacci
    @Override
    public BigInteger calculate(int n) {
        if (n == 0) {
            return BigInteger.ZERO;
        } else if (n == 1) {
            return BigInteger.ONE;
        }

        BigInteger prev1 = BigInteger.ZERO;
        BigInteger prev2 = BigInteger.ONE;
        BigInteger result = BigInteger.ZERO;

        for (int i = 2; i <= n; i++) {
            result = prev1.add(prev2);
            prev1 = prev2;
            prev2 = result;
        }

        return result;
    }
}
