/*
Problem Statement -
https://www.hackerrank.com/challenges/java-if-else/problem 
*/

package hackerrank;

import java.util.Scanner;

public class JavaIfElse {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if (n % 2 == 0) {
        	//Even
        	if (n >= 2 && n <= 5) {
        		System.out.println("Not Weird");
        	}
        	else if (n >= 6 && n <= 20) {
        		System.out.println("Weird");
        	}
        	else {
        		System.out.println("Not Weird");
        	}
        }
        else {
        	//Odd
        	System.out.println("Weird");
        }
        
        scanner.close();
    }
}
