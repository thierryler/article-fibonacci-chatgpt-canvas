package com.thi.fibogpt;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import java.math.BigInteger;

public class FibonacciTest {

	@ParameterizedTest
	@CsvFileSource(resources = "/fibonacci_test_data.csv", numLinesToSkip = 1)
	public void testFibonacciRecursif(int input, int expected) {
		Fibonacci fibonacciRecursif = new FibonacciRecursif();
		assertEquals(BigInteger.valueOf(expected), fibonacciRecursif.calculate(input));
	}

	@ParameterizedTest
	@CsvFileSource(resources = "/fibonacci_test_data.csv", numLinesToSkip = 1)
	public void testFibonacciIteratif(int input, int expected) {
		Fibonacci fibonacciIteratif = new FibonacciIteratif();
		assertEquals(BigInteger.valueOf(expected), fibonacciIteratif.calculate(input));
	}

	@ParameterizedTest
	@CsvFileSource(resources = "/fibonacci_test_data.csv", numLinesToSkip = 1)
	public void testFibonacciRecursifVsIteratif(int input) {
		Fibonacci fibonacciRecursif = new FibonacciRecursif();
		Fibonacci fibonacciIteratif = new FibonacciIteratif();
		assertEquals(fibonacciRecursif.calculate(input), fibonacciIteratif.calculate(input));
	}

	@Test
	public void testPerformanceGrandeValeur() {
		Fibonacci fibonacciRecursif = new FibonacciRecursif();
		int n = 1000; // Tester une grande valeur de n
		Executable executable = () -> fibonacciRecursif.calculate(n);
		assertTimeoutPreemptively(java.time.Duration.ofMillis(500), executable, "Le calcul a pris trop de temps");
	}
}
