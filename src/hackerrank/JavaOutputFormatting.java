/*
Problem Statement -
https://www.hackerrank.com/challenges/java-output-formatting/problem 
*/

package hackerrank;

import java.util.Scanner;

public class JavaOutputFormatting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("================================");
		for(int i = 0; i < 3; i++) {
			String s1 = scanner.next();
			int x = scanner.nextInt();
			System.out.format("%-15s" + "%03d\n", s1, x);
		}
		System.out.println("================================");
		scanner.close();
	}
}
