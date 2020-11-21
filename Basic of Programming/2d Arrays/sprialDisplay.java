/*
Question
1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a.
4. You are required to traverse and print the contents of the 2d array in form of a spiral.
Note - Please check the sample output for details.

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
e21
..
en1
en2
en3
..
enm
e(n-1)m
..
e1m
e1(m-1)
..
e12
e22
e32
..

Constraints
1 <= n <= 10^2
1 <= m <= 10^2
-10^9 <= e1, e2, .. n * m elements <= 10^9

Sample Input
3
5
11
12
13
14
15
21
22
23
24
25
31
32
33
34
35

Sample Output
11
21
31
32
33
34
35
25
15
14
13
12
22
23
24
*/


import java.io.*;
import java.util.*;

public class sprialDisplay {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        
        int row = scn.nextInt();
        int column = scn.nextInt    ();    
        int [][] arr = new int [row][column];
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        int min_row = 0;
        int max_row = arr.length - 1;
        int min_column = 0;
        int max_column = arr[0].length - 1;
        int totalNum = row * column;
        int count = 0;
        
        while(count < totalNum){
            //Print the left wall
            for(int i = min_row, j = min_column; i <= max_row && count < totalNum; i++){
             System.out.println(arr[i][j]);
             count++;
            }
            min_column++;
            //Print the bottom wall
            for(int j = min_column, i = max_row; j <= max_column && count < totalNum; j++){
                System.out.println(arr[i][j]);
                count++;
            }
            max_row--;
            //Print the right wall
            for(int j = max_column, i = max_row; i >= min_row && count < totalNum; i--){
                System.out.println(arr[i][j]);
                count++;
            }
            max_column--;
            //Print the top wall
            for(int i = min_row, j = max_column; j >= min_column && count < totalNum; j--){
                System.out.println(arr[i][j]);
                count++;
            }
            min_row++;
        }
        
        
  }    

}