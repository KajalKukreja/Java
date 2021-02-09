/*
Problem Statement -
https://www.hackerrank.com/challenges/java-bitset/problem
*/

package hackerrank;

import java.util.BitSet;
import java.util.Scanner;

class BitSetOperations {
    
    public static void AND(BitSet B1, BitSet B2) {
        B1.and(B2);
    }
    public static void OR(BitSet B1, BitSet B2) {
        B1.or(B2);
    }
    public static void XOR(BitSet B1, BitSet B2) {
        B1.xor(B2);
    }
    public static void FLIP(BitSet B, int index) {
        B.flip(index);
    }
    public static void SET(BitSet B, int index) {
        B.set(index);
    }
}

public class JavaBitSet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);
        
        while (M-- > 0) {
            String operation = scanner.next();
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            
            switch (operation) {
                case "AND"     :    BitSetOperations.AND(num1 == 1 ? B1 : B2, num2 == 1 ? B1 : B2);
                                	System.out.println(B1.cardinality() + " " + B2.cardinality());
                                	break;
                                
                case "OR"     :    BitSetOperations.OR(num1 == 1 ? B1 : B2, num2 == 1 ? B1 : B2);
                                	System.out.println(B1.cardinality() + " " + B2.cardinality());
                                	break;
                                
                case "XOR"     :    BitSetOperations.XOR(num1 == 1 ? B1 : B2, num2 == 1 ? B1 : B2);
                                	System.out.println(B1.cardinality() + " " + B2.cardinality());
                                	break;
                                
                case "FLIP" :		BitSetOperations.FLIP(num1 == 1 ? B1 : B2, num2);
                                	System.out.println(B1.cardinality() + " " + B2.cardinality());
                                	break;
                                
                case "SET"     :    BitSetOperations.SET(num1 == 1 ? B1 : B2, num2);
                                	System.out.println(B1.cardinality() + " " + B2.cardinality());
                                	break;
        
                default        :    break;
            }
        }
        scanner.close();
    }
}
