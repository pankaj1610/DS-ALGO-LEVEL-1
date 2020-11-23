/*
Question
1. You are given a number n, representing the number of rows and columns of a square matrix.
2. You are given n * n numbers, representing elements of 2d array a.
3. You are required to diagonally traverse the upper half of the matrix and print the contents.
For details check image.

diagonal-traversal
Input Format
A number n
e11
e12..
e21
e22..
.. n * n number of elements of array a
Output Format
Diagonal traversal as in image below
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
11
22
33
44
12
23
34
13
24
14

Approach 
1.Look at the diagonals, there is gap(row - column) between each diagonal.
2.Every diagonal ends with a index number(arr.length).
*/

import java.io.*;
import java.util.*;

public class diagonalTraversal {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int [][] arr = new int [n][n];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        
        for(int g = 0; g < arr.length; g++){
            for(int i = 0, j = g; j < arr.length; i++, j++){
                System.out.println(arr[i][j]);
            }
        }
}
}