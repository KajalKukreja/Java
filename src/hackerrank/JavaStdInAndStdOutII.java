/*
Problem Statement -
https://www.hackerrank.com/challenges/java-stdin-stdout/problem
*/

package hackerrank;

import java.util.Scanner;

public class JavaStdInAndStdOutII {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.nextLine();
        double d = scanner.nextDouble();
        scanner.nextLine();
        String s = scanner.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        scanner.close();
    }
}
