/*
Problem Statement -
https://www.hackerrank.com/challenges/java-2d-array/problem
*/

package hackerrank;

import java.util.Scanner;

public class Java2DArray {
	
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[6][6];
        
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int maxSum = 0;
        for (int i = 0; i < arr.length - 2; i++) {
        	for (int j = 0; j < arr.length - 2; j++) {
        		int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + 
                        arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
        		
        		/*
        		System.out.println(arr[i][j] + " " + arr[i][j+1] + " " + arr[i][j+2] + "\n  " + arr[i+1][j+1] + "  \n" + 
                          arr[i+2][j] + " " + arr[i+2][j+1] + " " + arr[i+2][j+2]);
        		System.out.println("Sum of hourglass = " + maxSum + "\n");
        		*/
        		
        		if ((i == 0 && j == 0) || sum > maxSum) {
                    maxSum = sum;
                }
        	}
        }
        System.out.println(maxSum);
        scanner.close();
    }
}
