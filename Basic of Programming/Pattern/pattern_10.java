/*
Question
1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.

Input Format
A number n

Constraints
1 <= n <= 100
 Also, n is odd.

Sample Input
5

Sample Output
		*	
	*		*	
*				*	
	*		*	
		*	
*/
import java.util.*;
public class pattern_10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int outerSpace = num / 2;
        int innerSpace = -1;

        for(int i = 1; i <= num; i++){

            for(int j = 1; j <= outerSpace; j++){
                System.out.print("\t");
            }

            System.out.print("*\t");

            for(int j = 1; j <= innerSpace; j++){
                System.out.print("\t");
            }

            if(i > 1 && i < num){
                System.out.print("*\t");
            }


            if(i <= num / 2){
                outerSpace--;
                innerSpace += 2;
            }
            else{
                outerSpace++;
                innerSpace -= 2;
            }
            System.out.println();
        }
        
    }
}
