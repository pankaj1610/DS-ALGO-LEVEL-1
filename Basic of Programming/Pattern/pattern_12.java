/*
Question
1. You are given a number n.
2. You've to create a pattern as shown in output format.

Input Format
A number n

Constraints
1 <= n <= 5

Sample Input
5

Sample Output
0	
1	1	
2	3	5	
8	13	21	34	
55	89	144	233	377	
*/

import java.util.*;

public class pattern_12{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int num = scn.nextInt();
        
        int firstFib = 0;
        int secondFib = 1;
        
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(firstFib + "\t");
                int nextFib = firstFib + secondFib;
                firstFib = secondFib;
                secondFib = nextFib;
            }
            System.out.println();
        }

    }
}
