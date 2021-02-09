/*
Problem Statement -
https://www.hackerrank.com/challenges/phone-book/problem
*/

package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

	public static void main(String[] argh) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String name = scanner.nextLine();
			int phone = Integer.parseInt(scanner.nextLine());
			map.put(name, phone);
		}
		while (scanner.hasNext()) {
			String query = scanner.nextLine();
			Object obj = map.get(query);
			if (obj == null) {
				System.out.println("Not found");
			}
			else {
				System.out.println(query + "=" + obj);
			}
		}
		scanner.close();
	}
}
