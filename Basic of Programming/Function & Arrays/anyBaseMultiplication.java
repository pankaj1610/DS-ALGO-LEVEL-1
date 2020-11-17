/*
Question
1. You are given a base b.
2. You are given two numbers n1 and n2 of base b.
3. You are required to multiply n1 and n2 and print the value.

Input Format
A base b
A number n1
A number n2

Output Format
A number of base b equal in value to n2 * n1.

Constraints
2 <= b <= 10
0 <= n1 <= 10000
0 <= n2 <= 10000

Sample Input
5
1220
31

Sample Output
43320
*/

import java.util.*;

public class anyBaseMultiplication{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int base = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int result = getProduct(base, n1, n2);
    System.out.println(result);
 }

 public static int getProduct(int base, int n1, int n2){
     int returnValue = 0;
     int multiplier = 1;
     while(n2 > 0){
         int digit2 = n2 % 10;
         n2 = n2 / 10;
         int sprd = getProductWithASingleDigit(base, n1, digit2);
         //Shifting sprd by one place and getting final sum
         returnValue = getSum(base, returnValue, sprd * multiplier);
         multiplier *= 10;
         
     }
     return returnValue;
 }
 
 public static int getProductWithASingleDigit(int base, int n1, int digit2){
     int returnValue = 0;
     int multiplier = 1;
     int carry = 0;
     while(n1 > 0 || carry > 0){
         int digit1 = n1 % 10;
         n1 = n1 / 10;
         int digit = digit1 * digit2 + carry;
         carry = digit / base;
         digit = digit % base;
         returnValue += digit * multiplier;
         multiplier *= 10;
     }
     return returnValue;
 }
 
  public static int getSum(int base, int n1, int n2){
       int returnValue = 0;
       int multiplier = 1;
       int carry = 0;
       while(n1 > 0 || n2 > 0 || carry > 0){
           int digit1 = n1 % 10;
           int digit2 = n2 % 10;
           int digit = digit1 + digit2 + carry;
           carry = digit / base;
           digit = digit % base;
           returnValue += digit * multiplier;
           multiplier *= 10;
           n1 = n1 / 10;
           n2 = n2 / 10;
           
           
       }
       return returnValue;
   }

}