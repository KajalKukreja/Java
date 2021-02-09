/*
Problem Statement -
https://www.hackerrank.com/challenges/pattern-syntax-checker/problem
*/

package hackerrank;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int testCases = Integer.parseInt(scanner.nextLine());

		//Make sure testCases variable is decremented
		while (testCases-- > 0) {
			String pattern = scanner.nextLine();
			try {
				Pattern.compile(pattern);
				System.out.println("Valid");
			} catch (PatternSyntaxException e) {
				System.out.println("Invalid");
			}
		}
		scanner.close();
	}
}
