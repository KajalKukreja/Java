/*
Problem Statement -
https://www.hackerrank.com/challenges/java-negative-subarray/problem
*/

package hackerrank;

import java.util.Scanner;

public class JavaSubarray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		int counter = 0;
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum += array[j];
				if (sum < 0) {
					counter++;
				}
			}
		}
		System.out.println(counter);
		scanner.close();
	}
}
