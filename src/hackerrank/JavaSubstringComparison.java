/*
Problem Statement -
https://www.hackerrank.com/challenges/java-string-compare/problem
*/

package hackerrank;

import java.util.Scanner;

public class JavaSubstringComparison {

	public static String getSmallestAndLargest(String s, int k) {
		java.util.TreeSet<String> subStrings = new java.util.TreeSet<>();
		for (int i = 0; i <= s.length()-k; i++) {
			String substr = s.substring(i, i+k);
			subStrings.add(substr);
		}
		return subStrings.first() + "\n" + subStrings.last();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int k = scanner.nextInt();
		scanner.close();
		System.out.println(getSmallestAndLargest(s, k));
	}
}
