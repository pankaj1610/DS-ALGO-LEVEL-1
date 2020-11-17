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
7

Sample Output
*	*	*	*	*	*	*	
	*				*	
		*		*	
			*	
		*	*	*	
	*	*	*	*	*	
*	*	*	*	*	*	*	
*/

import java.util.*;

public class pattern_18 {

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int num = scn.nextInt();
    
    int star = num;
    int space = 0;
    
    for(int i = 1; i <= num; i++){
     
        for(int j = 1; j <= space; j++){
            System.out.print("\t");
        }
           
        for(int j = 1; j <= star; j++){
            if(i > 1 && i <= num /2 && j > 1 && j < star){
                System.out.print("\t");   
            }
            else{
                System.out.print("*\t");
            }
        }
        System.out.println();
        
        if(i <= num / 2){
            star -= 2;
            space++;
            
        }
        else{
            star += 2;
            space--;
        }
        
    }

 }
}