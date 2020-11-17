/*
Question
1. You are given a base b.
2. You are given two numbers n1 and n2 of base b.
3. You are required to add the two numbes and print their value in base b.

Input Format
A base b
A number n1
A number n2

Output Format
A number representing the sum of n1 and n2 in base b.

Constraints
2 <= b <= 10
0 <= n1 <= 256
0 <= n2 <= 256

Sample Input
8
777
1

Sample Output
1000
*/
import java.util.*;
  
  public class anyBaseAddition{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int base = scn.nextInt(); //Taking input as base 
      int n1 = scn.nextInt();//Taking input as first number
      int n2 = scn.nextInt();//Taking input as second number
  
      int result = getSum(base, n1, n2);
      System.out.println(result);
   }
  
   public static int getSum(int base, int n1, int n2){
       int returnValue = 0;
       int multiplier = 1;
       int carry = 0;
       while(n1 > 0 || n2 > 0 || carry > 0){
           int digit1 = n1 % 10;// getting last digit of first number
           int digit2 = n2 % 10;//getting last digit of second number
           int digit = digit1 + digit2 + carry;
           carry = digit / base;
           digit = digit % base;//getting last digit of returnValue
           returnValue += digit * multiplier;
           multiplier *= 10;
           n1 = n1 / 10;//removing last digit of first number
           n2 = n2 / 10;//removing lasst digit of second number
           
           
       }
       return returnValue;
   }
  }