/*
Question
1. You are given a string that contains only lowercase and uppercase alphabets. 
2. You have to toggle the case of every character of the given string.

Input Format
A String

Output Format
A String

Constraints
1 <= length of string <= 1000

Sample Input
pepCODinG

Sample Output
PEPcodINg
*/

import java.io.*;
import java.util.*;

public class ToggleCase{

	public static StringBuilder toggleCase(String str){
		StringBuilder sb = new StringBuilder(str);
		
		for(int i = 0; i < sb.length(); i++){
		    char ch = sb.charAt(i);
		    if(ch >= 'a' && ch <= 'z'){
		        char upperCase = (char)('A' + ch - 'a');
		        sb.setCharAt(i, upperCase);
		    }else if(ch >= 'A' && ch <= 'Z'){
		        char lowerCase = (char)('a' + ch - 'A');
		        sb.setCharAt(i, lowerCase);
		    }
		}

		return sb;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}