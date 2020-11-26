/*
Question
1. You are given a number n, representing the number of rows and columns of a square matrix.
2. You are given n * n numbers, representing elements of 2d array a.
3. You are required to find the saddle point of the matrix which is defined as the value which is smallest in it's row but largest in it's column.

Note - There can be only 1 saddle point or none. Think why?

Input Format
A number n
e11
e12..
e21
e22..
.. n * n number of elements of array a

Output Format
Saddle point of the matrix if available or "Invalid input" if no saddle point is there.

Constraints
1 <= n <= 10^2
-10^9 <= e11, e12, .. n * m elements <= 10^9

Sample Input
4
11
12
13
14
21
22
23
24
31
32
33
34
41
42
43
44

Sample Output
41
*/

import java.io.*;
import java.util.*;

public class SaddlePoint{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        
        int num = scn.nextInt();
        int [][] arr = new int [num][num];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            int svj = 0;
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] < arr[i][svj]){
                    svj = j;
                }
            }
        
        
        boolean flag = true;
        for(int k = 0; k < arr.length; k++){
            if(arr[k][svj] > arr[i][svj]){
                flag = false;
                break;
            }
        }
        
        if(flag == true){
            System.out.println(arr[i][svj]);
            return;
        }
        
    }    
        
        System.out.println("Invalid input");
    }

}