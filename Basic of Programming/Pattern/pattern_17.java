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
		*	
		*	*	
*	*	*	*	*	
		*	*	
		*	
*/


import java.util.*;

public class pattern_17 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int num = scn.nextInt();
        int space = num / 2;
        int star = 1;
        
        for(int i = 1; i <= num; i++){
            
            for(int j = 1; j <= space; j++){
                
                if(i == num / 2 + 1){
                    System.out.print("*\t");
                }
                else{
                
                System.out.print("\t");
                }
                
            }
            
             for(int j = 1; j <= star; j++){
                System.out.print("*\t");
                 }
            if(i <= num / 2){
                star++;
                }
            else{
                star--;
            }
            System.out.println();
            
        }
        
      

    }
}