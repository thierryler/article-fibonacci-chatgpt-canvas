package com.thi.fibogpt;

public class Fibonacci {

	// Méthode principale pour tester la classe
	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();

		// Calcul d'un terme de la suite de Fibonacci avec méthode itérative
		int n = 10; // On souhaite calculer le 10ème terme de la suite
		System.out.println("Fibonacci itératif de " + n + " : " + fibonacci.fibonacciIteratif(n));

		// Calcul d'un terme de la suite de Fibonacci avec méthode récursive
		System.out.println("Fibonacci récursif de " + n + " : " + fibonacci.fibonacciRecursif(n));
	}

	// Méthode récursive pour calculer le n-ième élément de la suite de Fibonacci
	public int fibonacciRecursif(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibonacciRecursif(n - 1) + fibonacciRecursif(n - 2);
	}

	// Méthode itérative pour calculer le n-ième élément de la suite de Fibonacci
	public int fibonacciIteratif(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}

		int prev1 = 0;
		int prev2 = 1;
		int result = 0;

		for (int i = 2; i <= n; i++) {
			result = prev1 + prev2;
			prev1 = prev2;
			prev2 = result;
		}

		return result;
	}

}
