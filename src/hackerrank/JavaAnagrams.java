/*
Problem Statement -
https://www.hackerrank.com/challenges/java-anagrams/problem
*/

package hackerrank;

import java.util.Scanner;

public class JavaAnagrams {

	static boolean isAnagram(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}
		for (int i = 0; i < a.length(); i++) {
			String c = String.valueOf(a.charAt(i));
			b = b.replaceFirst("(?i)" + c, "");
		}
		//Works for java 11+
		//return b.isBlank();
		return b.trim().length() == 0;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
