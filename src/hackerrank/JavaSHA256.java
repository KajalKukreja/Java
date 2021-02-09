/*
Problem Statement -
https://www.hackerrank.com/challenges/sha-256/problem
*/

package hackerrank;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaSHA256 {
	
	public static void main(String[] args) throws NoSuchAlgorithmException {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		byte[] encryptedString = digest.digest(s.getBytes());
		for (byte b : encryptedString) {

			/*
				Explanation of "%02x"
				0 - used for padding
				2 - width (print at least 2 digits)
				x - print integer in hexadecimal format
				%02x means if your provided value is less than two digits then 0 will be prepended
				Why width is 2 ?
				Because 1 byte = 8 bits = 2 hex digits
			*/
			
			System.out.printf("%02x", b);
		}
		scanner.close();
	}
}
