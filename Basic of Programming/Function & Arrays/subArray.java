/*
Question
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to print all sub arrays of arr. Each sub array should be
on separate line. For more clarity check out sample input and output.

Input Format
A number n
n1
n2
.. n number of elements

Output Format
[Tab separated elements of subarray]
..
All subarrays

Constraints
1 <= n <= 10
0 <= n1, n2
 .. n elements <= 10 ^9

Sample Input

Sample Output
10	
10	20	
10	20	30	
20	
20	30	
30	

*/

import java.io.*;
import java.util.*;

public class subArray{
    
public static void printSubArray(int [] arr){
    for(int i = 0; i < arr.length; i++){
        for(int j = i; j < arr.length; j++){
            for(int k = i; k < j + 1; k++){
                System.out.print(arr[k] + "\t");
            }
            System.out.println();
        }
    }
}
public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    
    int num = scn.nextInt();
    int [] arr = new int [num];
    for(int i = 0; i < arr.length; i++){
        arr[i] = scn.nextInt();
    }
    printSubArray(arr);
 }

}
