/*
Question
1. You've to print first n fibonacci numbers.
2. Take as input "n", the count of fibonacci numbers to print.
3. Print first n fibonacci numbers.

Input Format
n

Output Format
0
1
1
2
3
5
8
.. first n fibonaccis

Constraints
1 <= n < 40

Sample Input
10

Sample Output
0
1
1
2
3
5
8
13
21
34
*/
import java.util.*;

public class PrintFibonacci {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int firstFib = 0;
        int secondFib = 1;
        for(int i = 0; i < num; i++){
            System.out.println(firstFib);
            int nextFib = firstFib + secondFib; 
            firstFib = secondFib;
            secondFib = nextFib;
        }

    }
    
}
