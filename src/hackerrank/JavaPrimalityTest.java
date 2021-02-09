/*
Problem Statement -
https://www.hackerrank.com/challenges/java-primality-test/problem
*/

package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.nextLine();
		BigInteger number = new BigInteger(n);
		System.out.println(number.isProbablePrime(1) ? "prime" : "not prime");
		scanner.close();
	}
}
