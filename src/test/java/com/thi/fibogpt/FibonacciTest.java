package com.thi.fibogpt;
import static org.junit.Assert.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FibonacciTest {

    @ParameterizedTest
    @CsvSource({
        "0, 0",
        "1, 1",
        "2, 1",
        "3, 2",
        "4, 3",
        "5, 5",
        "6, 8",
        "10, 55"
    })
    public void testFibonacciRecursif(int input, int expected) {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(expected, fibonacci.fibonacciRecursif(input));
    }

    @ParameterizedTest
    @CsvSource({
        "0, 0",
        "1, 1",
        "2, 1",
        "3, 2",
        "4, 3",
        "5, 5",
        "6, 8",
        "10, 55"
    })
    public void testFibonacciIteratif(int input, int expected) {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(expected, fibonacci.fibonacciIteratif(input));
    }

    @ParameterizedTest
    @CsvSource({
        "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"
    })
    public void testFibonacciRecursifVsIteratif(int input) {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(fibonacci.fibonacciRecursif(input), fibonacci.fibonacciIteratif(input));
    }
}
