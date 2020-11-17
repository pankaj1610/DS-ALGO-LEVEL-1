/*
Question
1. You are given a number n.
2. You are given a base b1. n is a number on base b.
3. You are given another base b2.
4. You are required to convert the number n of base b1 to a number in base b2.

Input Format
A number n
A base b1
A base b2

Output Format
A number of base b2 equal in value to n of base b1.

Constraints
0 <= n <= 512
2 <= b1 <= 10
2 <= b2 <= 10

Sample Input
111001
2
3

Sample Output
2010
*/
import java.util.*;
  
  public class getValueInAnyBase{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
      int  destBase= scn.nextInt();
      int resultIndecimal = getValueIndecimal(n, sourceBase, destBase);
      int resultInBase = getValueInBase(resultIndecimal, destBase);
      System.out.println(resultInBase);
   }
   
   public static int getValueIndecimal(int n, int sourceBase, int destBase){
       int multiplier = 1;
       int returnValue = 0;
       while(n != 0){
           int lastDigit = n % 10;
           returnValue += lastDigit * multiplier;
           multiplier *= sourceBase;
           n = n / 10;
       }
       return returnValue;
   }
   public static int getValueInBase(int n, int destBase){
       int multiplier = 1;
       int returnValue = 0;
       
       while(n != 0){
           int lastDigit = n % destBase;
           returnValue += lastDigit * multiplier;
           multiplier *= 10;
           n = n / destBase;
       }
       return returnValue;
   }
  }