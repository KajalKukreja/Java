/*
Problem Statement -
https://www.hackerrank.com/challenges/java-interface/problem 
*/

package hackerrank;

import java.util.*;
interface AdvancedArithmetic{
  int divisor_sum(int n);
}

//Renaming class MyCalculator to MyCalculator1 since I already have that class in my package
//Change it to MyCalculator for hackerrank question
class MyCalculator1 implements AdvancedArithmetic {
	@Override
	public int divisor_sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n%i == 0) {
				sum += i;
			}
		}
		return sum;
	}
}

public class JavaInterface {

	public static void main(String []args){
		MyCalculator1 my_calculator = new MyCalculator1();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
