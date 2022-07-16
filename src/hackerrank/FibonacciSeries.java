/*
Problem Statement -
https://www.hackerrank.com/challenges/ctci-fibonacci-numbers/problem
*/

package hackerrank;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
	}
	
	public static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}

	//This is iterative approach to print fibonacci series and the Nth number
	private static int getNthNumberInFibonnaciSeries(int n) {
		int[] fibonacciSeries = getFibonacciSeries(n);
		System.out.println("Fibonacci sequence is -");
		for (int i : fibonacciSeries) {
			System.out.print(i + " ");
		}
		System.out.println();
		return fibonacciSeries[n];
	}

	private static int[] getFibonacciSeries(int n) {
		int[] fibonacciSeries = new int[n+1];
		for (int i = 0; i <= n; i++) {
			if (i == 0 || i == 1) {
				fibonacciSeries[i] = i;
			} else {
				fibonacciSeries[i] = fibonacciSeries[i-1] + fibonacciSeries[i-2];
			}
		}
		return fibonacciSeries;
	}

}
