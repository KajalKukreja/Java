/*
Problem Statement -
https://www.hackerrank.com/challenges/duplicate-word/problem
*/

package hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex2DuplicateWords {

	public static void main(String[] args) {

		/*
			Don't add following comments in the code editor otherwise your code will fail due to author's custom checker
			Explanation of regex -
		
			When using this regular expression in Java, we have to "escape" the backslash characters 
			with additional backslashes
			\b ----> Create a word boundary
			() ----> Create a group
			[a-z] ----> Match small alphabet letters
			| ----> Specify or condition
			[A-Z] ----> Match capital alphabet letters
			+ ----> Match whatever it's placed after 1 or more times
			\s ----> Match space character
			\1 ----> Match whatever was matched in the 1st group of parentheses, which in this case is the ([a-z]|[A-Z]+)
			
		*/
		
        String regex = "\\b([a-z]|[A-Z]+)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}