package com.thi.fibogpt;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FibonacciRecursif implements Fibonacci {

    private Map<Integer, BigInteger> memo = new HashMap<>();

    // Méthode récursive pour calculer le n-ième élément de la suite de Fibonacci avec mémoization
    @Override
    public BigInteger calculate(int n) {
        if (n == 0) {
            return BigInteger.ZERO;
        }
        if (n == 1) {
            return BigInteger.ONE;
        }
        
        // Vérifier si le résultat est déjà calculé
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // Calculer et stocker dans le cache
        BigInteger result = calculate(n - 1).add(calculate(n - 2));
        memo.put(n, result);
        return result;
    }
}
