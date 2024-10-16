package com.thi.fibogpt;

import java.math.BigInteger;

/**
 * Interface pour calculer le n-ième élément de la suite de Fibonacci.
 * 
 * <p>
 * Cette interface définit une méthode pour calculer un terme de la suite de
 * Fibonacci. Par exemple :
 * <ul>
 * <li>calculate(0) renvoie 0</li>
 * <li>calculate(1) renvoie 1</li>
 * <li>calculate(10) renvoie 55</li>
 * </ul>
 */
public interface Fibonacci {
	/**
	 * Calcule le n-ième terme de la suite de Fibonacci.
	 * 
	 * @param n L'indice du terme à calculer (n >= 0).
	 * @return Le n-ième terme de la suite de Fibonacci sous forme de BigInteger.
	 * @throws IllegalArgumentException si n est négatif.
	 */
	BigInteger calculate(int n);
}
