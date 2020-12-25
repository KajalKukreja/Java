/*
Problem Statement -
https://www.hackerrank.com/challenges/java-date-and-time/problem
*/

package hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Scanner;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
    public static String findDay(int month, int day, int year) {
    	Calendar calendar = Calendar.getInstance();
    	calendar.set(Calendar.MONTH, month - 1);
    	calendar.set(Calendar.DATE, day);
    	calendar.set(Calendar.YEAR, year);
    	
    	int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
    	switch (dayOfWeek) {
			case 1	:	return "SUNDAY";
			case 2	:	return "MONDAY";
			case 3	:	return "TUESDAY";
			case 4	:	return "WEDNESDAY";
			case 5	:	return "THURSDAY";
			case 6	:	return "FRIDAY";
			case 7	:	return "SATURDAY";
			default	:	throw new IllegalArgumentException("Unexpected value: " + dayOfWeek);
		}
    }
}

public class JavaDateAndTime {

	public static void mainForLocalRun(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		int year = scanner.nextInt();
		System.out.println(Result.findDay(month, day, year));
		scanner.close();
	}
	
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);
        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
