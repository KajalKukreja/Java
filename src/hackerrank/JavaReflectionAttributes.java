/*
Problem Statement -
https://www.hackerrank.com/challenges/java-reflection-attributes/problem
*/

package hackerrank;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

class Student2 {
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

public class JavaReflectionAttributes {

	public static void main(String[] args) throws ClassNotFoundException {

		// Incomplete code is provided by author. For testing purpose, I am using Student2 class
		// We just need to edit few lines to solve the hackerrank question. 

		Class student = Class.forName("hackerrank.Student2");
		Method[] methods = student.getDeclaredMethods();

		ArrayList<String> methodList = new ArrayList<>();
		for (Method m : methods) {
			methodList.add(m.getName());
		}
		Collections.sort(methodList);
		for (String name : methodList) {
			System.out.println(name);
		}
	}
}
