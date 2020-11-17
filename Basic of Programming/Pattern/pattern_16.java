/*
Question
1. You are given a number n.
2. You've to write code to print the pattern given in output format below.

Input Format
A number n

Constraints
1 <= n <= 10

Sample Input
7

Sample Output
1												1	
1	2										2	1	
1	2	3								3	2	1	
1	2	3	4						4	3	2	1	
1	2	3	4	5				5	4	3	2	1	
1	2	3	4	5	6		6	5	4	3	2	1	
1	2	3	4	5	6	7	6	5	4	3	2	1	
*/


import java.util.*;

public class pattern_16 {

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     int num = scn.nextInt();
     int space = 2 * num - 3;
     int star = 1;
     
     for(int i = 1; i <= num; i++){
         int val = 1;
         
         for(int j = 1; j <= star; j++){
        
             System.out.print(val + "\t");
             val++;
         }
         
         for(int j = 1; j <= space; j++){
             System.out.print("\t");
         }
         
         
         if(i == num){
             star--;
             val--;
         }   
         for(int j = 1; j <= star; j++){
            val--;
            System.out.print(val + "\t");
             
         }
         
        System.out.println();
        space = space - 2;
        star += 1;
         
     }

 }
}