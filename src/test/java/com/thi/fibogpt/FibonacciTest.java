package com.thi.fibogpt;

import static org.junit.Assert.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class FibonacciTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/fibonacci_test_data.csv", numLinesToSkip = 1)
    public void testFibonacciRecursif(int input, int expected) {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(expected, fibonacci.fibonacciRecursif(input));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/fibonacci_test_data.csv", numLinesToSkip = 1)
    public void testFibonacciIteratif(int input, int expected) {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(expected, fibonacci.fibonacciIteratif(input));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/fibonacci_test_data.csv", numLinesToSkip = 1)
    public void testFibonacciRecursifVsIteratif(int input) {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(fibonacci.fibonacciRecursif(input), fibonacci.fibonacciIteratif(input));
    }
}