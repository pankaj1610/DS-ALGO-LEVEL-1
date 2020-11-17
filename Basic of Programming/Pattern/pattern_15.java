/*
Question
1. You are given a number n.
2. You've to write code to print the pattern given in output format below.

Input Format
A number n

Constraints
1 <= n <= 10
 Also, n is odd.
 
Sample Input
5

Sample Output
		1	
	2	3	2	
3	4	5	4	3	
	2	3	2	
		1	
*/


import java.util.*;

public class pattern_15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        
        int space = num / 2;
        int star = 1;
        int val = 1;
        
        for(int i = 1; i <= num; i++){
            
            for(int j = 1; j <= space; j++){
                System.out.print("\t");
            }
            int cval = val;
            for(int j = 1; j <= star; j++){
                System.out.print(cval + "\t");
                if(j <= star / 2){
                cval++;
                }
                else{
                    cval--;
                }
            }
            
            if(i <= num / 2){
                space--;
                star += 2;
                val++;
            }
            else{
                space++;
                star -= 2;
                val--;
            }
            
            System.out.println();
            
            
        }

    }
}