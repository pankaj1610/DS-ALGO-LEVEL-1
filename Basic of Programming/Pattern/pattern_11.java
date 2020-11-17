import java.util.Scanner;

/*
Question
1. You are given a number n.
2. You've to create a pattern as shown in output format.

Input Format
A number n

Constraints
1 <= n <= 44

Sample Input
5

Sample Output
1	
2	3	
4	5	6	
7	8	9	10	
11	12	13	14	15
*/


public class pattern_11 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int k = 1;
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(k + "\t");
                k++;
             }
            System.out.println(); 
        }
    }
    
}
