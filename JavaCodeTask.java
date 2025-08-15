package main.java;

import java.util.List;
import java.util.Scanner;

public class JavaCodeTask {
	Scanner sc=new Scanner(System.in);
	
	//Reverse Table
	public String reverseTable(int num) {
		String result="";
		for(int i=10;i>0;i--) {
			result +=(num*i)+" ";
		}
		return result.trim();
	}
	
	//Alphabets from ato z
	public String alphabets() {
		String result="";
		for(int i=97;i<=122;i++) {
			result += (char) i + " " ;
		}
		return result.trim();
	}
	
	//ascii values
	public String asciiValues() {
		String result= "";
		for(char ch='a';ch<= 'z';ch++) {
			result +=(int)ch +" ";
		}
		return result.trim();
	}
	
	//factorial
	public int factorial(int num) {
		int fact=1;
		for(int i=num;i>=1;i--) {
			fact*=i;
		}
		return fact;
	}
	//Counting positive ,negativeand zeros;
	    public String countNumbers(int[]arr) {
	        int pos = 0, neg = 0, zero = 0;

	        for (int n : arr) {
	            if (n > 0) {
	                pos++;
	            } else if (n < 0) {
	                neg++;
	            } else {
	                zero++;
	            }
	        }

	        return  + pos + " " + neg + " " +  zero;
	    }
	    
	    public class OnesComplement {
	        public static String onesComplement(String binary) {
	            StringBuilder complement = new StringBuilder();
	            for (char bit : binary.toCharArray()) {
	                complement.append(bit == '0' ? '1' : '0');
	            }
	            return complement.toString();
	        }

	    }

}
