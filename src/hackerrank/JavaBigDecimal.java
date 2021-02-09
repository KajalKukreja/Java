/*
Problem Statement -
https://www.hackerrank.com/challenges/java-bigdecimal/problem
*/

package hackerrank;

import java.math.BigDecimal;
import java.util.Scanner;

public class JavaBigDecimal {

	public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        
		// Not sure why s has 2 extra indexes at end, so skipping those indexes
		for (int i = 0; i < s.length - 1 - 2; i++) {
			for (int j = 0; j < s.length - 1 - 2 - i; j++) {
				BigDecimal a = new BigDecimal(s[j]);
				BigDecimal b = new BigDecimal(s[j + 1]);

				// sort in descending order
				if (a.compareTo(b) < 0) {
					// swap
					String temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
		}
      		
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
