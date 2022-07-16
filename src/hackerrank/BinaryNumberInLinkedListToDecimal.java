/*
Problem Statement-
https://www.hackerrank.com/contests/code-cpp-may-2015/challenges/linked-list-to-binary
*/

package hackerrank;

public class BinaryNumberInLinkedListToDecimal {

	static class Node {
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	static class LinkedList {
		private Node head;
		
		Node addNumber(int data) {
			final Node newNode = new Node(data);				
			if (head == null) {
				head = newNode;
			} else {
				Node currHead = head;
				while (currHead.next != null) {
					currHead = currHead.next;
				}
				currHead.next = newNode;
			}
			return head;
		}
		
		long getDecimalNumber() {
			int number = 0;
			final String binaryString = getBinaryStringInLinkedList();
			System.out.println("Original binary string: " + binaryString);			
			final String reverseBinaryString = String.valueOf(new StringBuilder(binaryString).reverse());
			System.out.println("Reversed binary string: " + reverseBinaryString);
			for (int i = 0; i < reverseBinaryString.length(); i++) {
				if (reverseBinaryString.charAt(i) == '1') {
					int value = (int) Math.pow(2, i);
					number += value;
					System.out.println("2 ^ " + i + " = " + value);
				}
			}
			return number;
		}
		
		long getNumber() {
			int number = 0;
			int length = -1;
			Node currHead = head;
			while (currHead != null) {
				length++;
				currHead = currHead.next;
			}
			
			currHead = head;
			while (currHead != null) {
				if (currHead.data == 1) {
					int value = (int) Math.pow(2, length);
					number += value;
					System.out.println("2 ^ " + length + " = " + value);
				}
				currHead = currHead.next;
				length--;
			}
			return number;
		}
		
		long getNumberWithOneLoop() {
			int number = 0;
			Node currHead = head;
			while (currHead != null) {
				// Multiply result by 2 and add head's data
				number = (number * 2) + currHead.data;
				currHead = currHead.next;
			}
			return number;
		}
		
		String getBinaryStringInLinkedList() {
			final StringBuilder strBuilder = new StringBuilder();
			Node currHead = head;
			while (currHead != null) {
				strBuilder.append(currHead.data);
				currHead = currHead.next;
			}
			return String.valueOf(strBuilder);
		}
	}	

	private static LinkedList createLinkedList(String binaryString) {
		final LinkedList linkedList = new LinkedList();
		for (char c : binaryString.toCharArray()) {
			linkedList.addNumber(Integer.parseInt(c + ""));
		}
		return linkedList;
	}
	
	public static void main(String[] args) {
		LinkedList linkedList = createLinkedList("111000110");
		System.out.println("============================================");
		System.out.println("Decimal number is " + linkedList.getDecimalNumber());
		System.out.println("============================================");
		System.out.println("Decimal number is " + linkedList.getNumber());
		System.out.println("============================================");
		System.out.println("Decimal number is " + linkedList.getNumberWithOneLoop());
		
		linkedList = createLinkedList("000010101");
		System.out.println("============================================");
		System.out.println("Decimal number is " + linkedList.getDecimalNumber());
		System.out.println("============================================");
		System.out.println("Decimal number is " + linkedList.getNumber());
		System.out.println("============================================");
		System.out.println("Decimal number is " + linkedList.getNumberWithOneLoop());
	}
}
