/*
Question
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to print all subsets of arr. Each subset should be
on separate line. For more clarity check out sample input and output.

Input Format
A number n
n1
n2
.. n number of elements

Output Format
[Tab separated elements of subset]
..
All subsets

Constraints
1 <= n <= 10
0 <= n1, n2, .. n elements <= 10^3

Sample Input
3
10
20
30

Sample Output
-	-	-	
-	-	30	
-	20	-	
-	20	30	
10	-	-	
10	-	30	
10	20	-	
10	20	30	

Approach
1.The number of subset is equal to 2 ** n where n is number of element in set.
2.Run a loop from 0 to limit.
3.Convert i to its corresponding binary digit as 0 or 1 to print the value.
4.If its 0 print "-".
5.Else print the value

*/

import java.io.*;
import java.util.*;

public class subsetOfArray{

public static void main(String[] args) throws Exception {
    Scanner scn  = new Scanner(System.in);
    
    int num = scn.nextInt();
    int [] arr = new int [num];
    for(int i = 0; i < arr.length; i++){
        arr[i] = scn.nextInt();
    }
    //Getting the number of subsets
    int limit = (int)Math.pow(2, arr.length);
    
    for(int i = 0; i < limit; i++){
        String set = "";
        int temp = i;
        for(int j = arr.length - 1; j >= 0; j--){
            //Converting i to its corresponding binary digit 
            int rem = temp % 2;
            temp = temp / 2;
            
            if(rem == 0){
                set = "-	" + set;
            }else{
                set = arr[j] + "	" + set;
            }
        }
        System.out.println(set);
    }
    
 }

}