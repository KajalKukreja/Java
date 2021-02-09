/*
Problem Statement -
https://www.hackerrank.com/challenges/java-singleton/problem
*/

package hackerrank;

class Singleton {

	private static Singleton instance;
	public String str;
	
	private Singleton() {}

	public static Singleton getSingleInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}

public class JavaSingletonPattern {
	//In this question, main class was hidden from us, we just need to write singleton class and 
	//it will be invoked by author's code
}
