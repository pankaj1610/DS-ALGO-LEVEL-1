/*
Question
1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a.
4. You are required to traverse and print the contents of the 2d array in form of a wave - down the first column then up the second column and so on.
Note - Please check the output format for details.

Input Format
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements

Output Format
e11
e12
e13
..
e1n
e2n
e2n-1
..
e21
e31
e32
..
e3n
e4n ..

Constraints
1 <= n <= 10^2
1 <= m <= 10^2
-10^9 <= e1, e2, .. n * m elements <= 10^9

Sample Input
3
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

Sample Output
11
21
31
32
22
12
13
23
33
34
24
14

Approach
1.Look column is increasing.
2. For every column, row is increasing if column is odd.
3.And row is decreasing if column is even.
*/


import java.io.*;
import java.util.*;

public class waveTraversal{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    
    int row = scn.nextInt();
    int column = scn.nextInt();
    int [][] arr = new int [row][column];
    for(int i  = 0; i < arr.length; i++){
        for(int j = 0; j < arr[0].length; j++){
            arr[i][j] = scn.nextInt();
        }
    }
    
    for(int j = 0; j < arr[0].length; j++){
        if(j % 2 == 0){
            for(int i = 0; i < arr.length; i++){
                System.out.println(arr[i][j]);
            }
        }else{
            for(int i = arr.length - 1; i >= 0; i--){
                System.out.println(arr[i][j]);
            }
        }
    }
 }
}
