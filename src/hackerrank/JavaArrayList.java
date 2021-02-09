/*
Problem Statement -
https://www.hackerrank.com/challenges/java-arraylist/problem
*/

package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArrayList {

	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			int d = scanner.nextInt();
			List<Integer> subList = new ArrayList<>();
			for (int j = 0; j < d; j++) {
				subList.add(scanner.nextInt());
			}
			list.add(subList);
		}
		int q = scanner.nextInt();
		while (q-- > 0) {
			int x = scanner.nextInt() - 1;
			int y = scanner.nextInt() - 1;
			List<Integer> xList = list.get(x);
			Object element = y < xList.size() ? xList.get(y) : "ERROR!";
			System.out.println(element);
		}
		scanner.close();
	}
}
