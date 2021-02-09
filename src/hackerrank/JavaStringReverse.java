/*
Problem Statement -
https://www.hackerrank.com/challenges/java-string-reverse/problem
*/

package hackerrank;

import java.util.Scanner;

public class JavaStringReverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		String reverse = String.valueOf(new StringBuilder(string).reverse());
		System.out.println(string.equals(reverse) ? "Yes" : "No");
		scanner.close();
	}
}
