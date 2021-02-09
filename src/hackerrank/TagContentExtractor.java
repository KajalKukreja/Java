/*
Problem Statement -
https://www.hackerrank.com/challenges/tag-content-extractor/problem
*/

package hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = Integer.parseInt(scanner.nextLine());
		
		/*
			Explanation of regex -
			
			<(.+)> matches HTML start tags. The parentheses save the contents inside the brackets into Group #1.
			
			([^<]+) matches all the text in between the HTML start and end tags. 
			We place a special restriction on the text in that it can't have the "<" symbol. 
			The characters inside the parenthesis are saved into Group #2.
			
			(</\\1>) matches the HTML end brace that corresponds to our previous start brace. 
			The \1 is here to match all text from Group #1.
		
		*/
		Pattern pattern = Pattern.compile("<(.+)>([^<]+)(</\\1>)");
		
		while (testCases > 0) {
			String line = scanner.nextLine();
			boolean matchFound = false;
			Matcher matcher = pattern.matcher(line);
			while (matcher.find()) {
				matchFound = true;
				System.out.println(matcher.group(2));
			}
			if (!matchFound) {
				System.out.println("None");
			}
			testCases--;
		}
		scanner.close();
	}
}
