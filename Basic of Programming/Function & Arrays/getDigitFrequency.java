/*
Question
1. You are given a number n.
2. You are given a digit d.
3. You are required to calculate the frequency of digit d in number n.
Input Format
A number n
A digit d
Output Format
A number representing frequency of digit d in number n
Constraints
0 <= n <= 10^9
0 <= d <= 9
  
Sample Input
994543234
 4
Sample Output
3
*/

import java.util.*;

public class getDigitFrequency {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int digit = scn.nextInt();
        int frequency = getDigitFrequency(num, digit);
        System.out.println(frequency);
    }
    
    public static int getDigitFrequency(int num, int digit) {
        int count = 0;
        while(num != 0){
            int lastDigit = num % 10;
            if(lastDigit == digit){
                count++;
            }
            num = num / 10; 
        }
        return count;
    }
}
