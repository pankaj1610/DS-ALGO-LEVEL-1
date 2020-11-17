import java.util.Scanner;

/*
Question
1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.

Input Format
A number n

Constraints
1 <= n <= 100

Sample Input
5

Sample Output
*	*	*	*	*	
	*	*	*	*	
		*	*	*	
			*	*	
*/
public class pattern_4{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int space = 0;
        int star = num;
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= space; j++){
                System.out.print("\t");
            }
            for(int j = 1; j <= star; j++){
                System.out.print("*\t");
            }
            System.out.println();
            space++;
            star--;
        }
    }
}