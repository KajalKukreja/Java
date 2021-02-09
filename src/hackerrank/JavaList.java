/*
Problem Statement -
https://www.hackerrank.com/challenges/java-list/problem
*/

package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String[] numbers = scanner.nextLine().split(" ");
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(numbers[i]));
		}
		
		int q = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < q; i++) {
			String query = scanner.nextLine();
			String[] indexes = scanner.nextLine().split(" ");
			
			if (query.equalsIgnoreCase("Insert") && indexes.length == 2) {
				int x = Integer.parseInt(indexes[0]);
				int y = Integer.parseInt(indexes[1]);
				list.add(x, y);
			}
			else if (query.equalsIgnoreCase("Delete") && indexes.length == 1) {
				int x = Integer.parseInt(indexes[0]);
				list.remove(x);
			}
		}
		for (int i : list) {
			System.out.print(i + " ");
		}
		scanner.close();
	}
}
