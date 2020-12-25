/*
Problem Statement -
https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem
*/

package hackerrank;

import java.util.Scanner;

public class JavaStdInAndStdOutI {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int no1 = scanner.nextInt();
		int no2 = scanner.nextInt();
		int no3 = scanner.nextInt();

		System.out.println(no1);
		System.out.println(no2);
		System.out.println(no3);
		
		scanner.close();
	}
}
