/*
Problem Statement -
https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem
*/

package hackerrank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {			
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			System.out.println(x/y);
		} catch(InputMismatchException e) {
			System.out.println(e.getClass().getName());
		} catch(ArithmeticException e) {
			System.out.println(e.getClass().getName() + ": " + e.getMessage());
		}
	}
}
