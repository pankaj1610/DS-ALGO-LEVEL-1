/*
Question
1. You are given a number n.
2. You've to write code to print the pattern given in output format below

Input Format
A number n

Constraints
1 <= n <= 10

 Also, n is odd.
Sample Input
7

Sample Output

*       *       *       *                       *       
                        *                       *       
                        *                       *
*       *       *       *       *       *       *
*                       *
*                       *
*                       *       *       *       *
*/


import java.util.*;

public class pattern_19 {

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int num = scn.nextInt();
    for(int i = 1; i <= num; i++){
        
        for(int j = 1; j <= num; j++){
            
            if(i == 1){
                if(j == num || j <= num / 2 + 1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
                
            }
            else if(i <= num / 2){
                if(j == num / 2 + 1 || j == num){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
                
            }
            else if(i == num / 2 + 1){
                System.out.print("*\t");
            }
            else if(i < num){
                if(j == 1 || j == num / 2 + 1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            else{
                if(j == 1 || j >= num / 2 + 1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
                
            }
        
        }
        
        System.out.println();
    }

 }
}