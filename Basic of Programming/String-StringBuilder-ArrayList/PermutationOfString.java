/*
Question
1. You are given a string. 
2. You have to print all permutations of the given string iteratively.

Input Format
A String

Output Format
All permutations of the given string(one in a line). 

Constraints
1 <= length of string <= 15

Sample Input
abc

Sample Output
abc
bac
cab
acb
bca
cba
*/


import java.io.*;
import java.util.*;

public class PermutationOfString{

	public static void solution(String str){
		int n = str.length();
		int f = factorial(n);
		for(int i = 0; i < f; i++){
		    int temp = i;
		    StringBuilder sb = new StringBuilder(str);
		    for(int div = n; div >= 1; div--){
		        int q = temp / div;
		        int rem = temp % div;
		        
		        System.out.print(sb.charAt(rem));
		        sb.deleteCharAt(rem);
		        temp = q;
		        
		    }
		    System.out.println();
		}
		
	}
	
	public static int factorial(int n){
	    int value = 1;
	    for(int i = 2; i <= n; i++){
	        value *= i;
	    }
	    return value;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}