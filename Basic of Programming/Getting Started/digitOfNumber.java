/*
Question
1. You've to display the digits of a number.
2. Take as input "n", the number for which digits have to be displayed.
3. Print the digits of the number line-wise.

Input Format
"n" where n is any integer.

Output Format
d1
d2
d3
... digits of the number

Constraints
1 <= n < 10^9

Sample Input
65784383

Sample Output
6
5
7
8
4
3
8
3
*/

import java.util.*;

public class digitOfNumber {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int nod = 0;
        int tempNum = num;
        while(tempNum > 0){
            tempNum = tempNum / 10;
            nod++;
        }

        int div = (int)Math.pow(10, nod - 1);

        while(div != 0){
            int ans = num / div;
            System.out.println(ans);
            num = num % div;
            div = div / 10;

        }

        }
    
}
