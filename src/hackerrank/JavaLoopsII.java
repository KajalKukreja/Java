/*
Problem Statement -
https://www.hackerrank.com/challenges/java-loops/problem
*/

package hackerrank;

import java.util.Scanner;

public class JavaLoopsII {
	
	public static void main(String []argh){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            
            for(int j = 0; j < n; j++) {            	
            	int ans = a;
            	for(int k = 0; k <= j; k++) {
            		ans += (int) Math.pow(2, k) * b;
            	}
            	System.out.print(ans + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
