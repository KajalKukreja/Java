/*
Problem Statement -
https://www.hackerrank.com/challenges/java-dequeue/problem
*/

package hackerrank;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaDequeue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		int n = scanner.nextInt();
		int m = scanner.nextInt();

		Map<Integer, Integer> map = new HashMap<>();
		int maxUnique = 0;
		for (int i = 0; i < n; i++) {
			int num = scanner.nextInt();
			deque.add(num);
			map.merge(num, 1, Integer::sum);
			
			//Check if queue already has m elements
			if (deque.size() == m) {

				//How many unique elements hashmap has?
				int mapSize = map.size();
				if (mapSize > maxUnique) {
					maxUnique = mapSize;
				}
				int head = deque.remove();
				int headValue = map.get(head);
				if (headValue == 1) {
					map.remove(head);
				}
				else {
					map.put(head, headValue-1);
				}
			}
		}
		System.out.println(maxUnique);
        scanner.close();
	}
}
