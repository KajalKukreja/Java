/*
Problem Statement -
https://www.hackerrank.com/challenges/java-stack/problem
*/

package hackerrank;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

	private static Stack<Character> stack = new Stack<>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String input = scanner.next();
			stack.clear();
			for (int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);
				if (c == '(' || c == '{' || c == '[') {
					stack.push(c);
				}
				else if (!stack.isEmpty()) {
					if (c == ')' && stack.peek().equals('(')) {
						stack.pop();
					}
					if (c == '}' && stack.peek().equals('{')) {
						stack.pop();
					}
					if (c == ']' && stack.peek().equals('[')) {
						stack.pop();
					}
				}
				else {
					stack.push(c);
				}
			}
			System.out.println(stack.isEmpty());
		}
		scanner.close();
	}
}
