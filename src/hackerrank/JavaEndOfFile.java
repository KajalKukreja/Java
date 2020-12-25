/*
Problem Statement -
https://www.hackerrank.com/challenges/java-end-of-file/problem
*/

package hackerrank;

import java.util.Scanner;

public class JavaEndOfFile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		while (scanner.hasNextLine()) {
			System.out.println(++n + " " + scanner.nextLine());
		}
		scanner.close();
	}
}
