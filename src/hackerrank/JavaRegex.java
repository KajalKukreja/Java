/*
Problem Statement -
https://www.hackerrank.com/challenges/java-regex/problem
*/

package hackerrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class JavaRegex {

	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        
    }
}

class MyRegex {
	
	/*
		Explanation of regex -
	 	( => Create a group
	 	25[0-5] => Match numbers like 255, 253, 250, etc.
	 	| => Works as OR condition
	 	2[0-4][0-9] => Match numbers like 249, 232, 226, 218, etc.
	 	[0-1] => Match numbers in the range 0 to 1
	 	? => It specifies that preceding token can occur 0 or 1 time
	 	[0-9] => Match numbers in the range 0 to 9
	 	[.] => Match a dot character
	*/
	
	public final String pattern = "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)[.](25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)[.](25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)[.](25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)";
}