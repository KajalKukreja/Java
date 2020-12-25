/*
Problem Statement -
https://www.hackerrank.com/challenges/java-static-initializer-block/problem
*/

package hackerrank;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

	private static int B = 0;
	private static int H = 0;
	private static boolean flag = true;
	
	static {
		try (Scanner scanner = new Scanner(System.in);) {
			B = scanner.nextInt();
			H = scanner.nextInt();
			if (B <= 0 || H <= 0) {
				flag = false;
				throw new Exception("java.lang.Exception: Breadth and height must be positive");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		if(flag) {
			int area = B * H;
			System.out.print(area);
		}
	}
}
