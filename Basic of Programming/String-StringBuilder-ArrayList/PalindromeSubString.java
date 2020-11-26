/*
Question
1. You are given a string. 
2. You have to print all palindromic substrings of the given string.

Input Format
A String

Output Format
All palindromic substrings(one in a line).
First, all palindromic substrings starting from first character of string will be printed, then from second character and so on.

Constraints
1 <= length of string <= 500

Sample Input
abcc

Sample Output
a
b
c
cc
c
*/


import java.io.*;
import java.util.*;

public class PalindromeSubString{
    public static boolean isPalindrome(String ss){
        int i = 0;
        int j = ss.length() - 1;
        while(i <= j){
            char c1 = ss.charAt(i);
            char c2 = ss.charAt(j);
            if(c1 != c2){
                return false;
            }else{
                i++;
                j--;
            }
        }
        
        return true;
    }
	public static void solution(String str){
		for(int i = 0; i < str.length(); i++){
		    for(int j = i + 1; j <= str.length(); j++){
		        String ss = str.substring(i, j);
		        if(isPalindrome(ss)){
		            System.out.println(ss);
		        }
		    }
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}