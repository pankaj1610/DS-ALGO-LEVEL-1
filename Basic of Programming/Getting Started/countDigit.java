/*
Question
1. You've to count the number of digits in a number.
2. Take as input "n", the number for which the digits has to be counted.
3. Print the digits in that number.

Input Format
"n" where n is any integer.

Output Format
"d" where d is the number of digits in the number "n"

Constraints
1 <= n < 10^9

Sample Input
65784383

Sample Output
8
*/
import java.util.*;

public class countDigit {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int count = 0;
        while(num > 0){
            num = num / 10;
            count++;
        }
        System.out.println(count);

    }
    
}
