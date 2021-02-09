/*
Problem Statement -
https://www.hackerrank.com/challenges/java-string-tokens/problem
*/

package hackerrank;

import java.util.Scanner;
//import java.util.StringTokenizer;

public class JavaStringTokens {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim();
        if (str.length() == 0) {
        	System.out.println("0");
        }
        else {
        	String[] tokens = str.split("[ !,?._'@]+");
            System.out.println(tokens.length);
            for (String s : tokens) {
            	System.out.println(s);
            }
        }
        
        /*
        Another way using StringTokenizer
        
        StringTokenizer tokenizer = new StringTokenizer(str, " !,?._'@");
        System.out.println(tokenizer.countTokens());
        while (tokenizer.hasMoreTokens()) {
        	System.out.println(tokenizer.nextToken());
        }
        */
        
        scanner.close();
    }
}
