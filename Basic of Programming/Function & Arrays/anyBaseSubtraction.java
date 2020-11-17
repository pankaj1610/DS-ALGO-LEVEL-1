/*
Question
1. You are given a base b.
2. You are given two numbers n1 and n2 of base b.
3. You are required to subtract n1 from n2 and print the value.

Input Format
A base b
A number n1
A number n2

Output Format
A number of base b equal in value to n2 - n1.

Constraints
2 <= b <= 10
0 <= n1 <= 256
n1 <= n2 <= 256

Sample Input
8
1
100

Sample Output
77
*/
import java.util.*;
  
  public class anyBaseSubtraction{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int base = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int result = getDifference(base, n1, n2);
      System.out.println(result);
   }
  
   public static int getDifference(int base, int n1, int n2){
       int returnValue = 0;
       int carry = 0;
       int multiplier = 1;
       while(n2 > 0){
           int digit1 = n1 % 10;//getting last digit of n1
           n1 = n1 / 10;//removing last digit of n1
           int digit2 = n2 % 10;//getting last digit of n2
           n2 = n2 / 10;//removing last digit of n2
           int digit = 0;
           digit2 += carry;
           if(digit2 >= digit1){
               carry = 0;
               digit = digit2 - digit1;
               
           }
           else{
               carry = -1;
               digit = digit2 + base - digit1;
           }
           returnValue += digit * multiplier;
           multiplier *= 10;
       }
       return returnValue; 
          
       
   }
  
  }
  