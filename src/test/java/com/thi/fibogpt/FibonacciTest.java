package com.thi.fibogpt;

import static org.junit.Assert.*;
import org.junit.Test;

public class FibonacciTest {

	@Test
	public void testFibonacciRecursif() {
		Fibonacci fibonacci = new Fibonacci();

		// Test des premiers termes
		assertEquals(0, fibonacci.fibonacciRecursif(0));
		assertEquals(1, fibonacci.fibonacciRecursif(1));
		assertEquals(1, fibonacci.fibonacciRecursif(2));
		assertEquals(2, fibonacci.fibonacciRecursif(3));
		assertEquals(3, fibonacci.fibonacciRecursif(4));
		assertEquals(5, fibonacci.fibonacciRecursif(5));
		assertEquals(8, fibonacci.fibonacciRecursif(6));
		assertEquals(55, fibonacci.fibonacciRecursif(10));
	}

	@Test
	public void testFibonacciIteratif() {
		Fibonacci fibonacci = new Fibonacci();

		// Test des premiers termes
		assertEquals(0, fibonacci.fibonacciIteratif(0));
		assertEquals(1, fibonacci.fibonacciIteratif(1));
		assertEquals(1, fibonacci.fibonacciIteratif(2));
		assertEquals(2, fibonacci.fibonacciIteratif(3));
		assertEquals(3, fibonacci.fibonacciIteratif(4));
		assertEquals(5, fibonacci.fibonacciIteratif(5));
		assertEquals(8, fibonacci.fibonacciIteratif(6));
		assertEquals(55, fibonacci.fibonacciIteratif(10));
	}

	@Test
	public void testFibonacciRecursifVsIteratif() {
		Fibonacci fibonacci = new Fibonacci();

		// Comparer les résultats des deux méthodes pour quelques valeurs
		for (int i = 0; i <= 15; i++) {
			assertEquals(fibonacci.fibonacciRecursif(i), fibonacci.fibonacciIteratif(i));
		}
	}

}
