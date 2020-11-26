/*
Question
1. You are given a number n, representing the number of rows and columns of a square matrix.
2. You are given n * n numbers, representing elements of 2d array a. 
Note - Each row and column is sorted in increasing order.
3. You are given a number x.
4. You are required to find x in the matrix and print it's location int (row, col) format as discussed in output format below.
5. In case element is not found, print "Not Found".

Input Format
A number n
e11
e12..
e21
e22..
.. n * n number of elements of array a
A number x

Output Format
row
col of the location where element is found or "Not Found" if element is not in the matrix

Constraints
1 <= n <= 10^2
-10^9 <= e11, e12, .. n * m elements <= 10^9
All rows and columns are sorted in increasing order

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
43

Sample Output
3
2
*/

import java.io.*;
import java.util.*;

public class SearchInSortedMatrix {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        
        int num = scn.nextInt();
        int [][] arr = new int [num][num];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        int data = scn.nextInt();
        //Using linear search approach
        /*for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == data){
                    System.out.println(i);
                    System.out.println(j);
                    return;
                }
            }
        }
        
        System.out.println("Not Found");*/
        //Using binary search approach
        int i = 0;
        int j = arr[0].length - 1;
        while(i < arr.length && j >= 0){
            if(data == arr[i][j]){
                System.out.println(i);
                System.out.println(j);
                return;
            }else if(data < arr[i][j]){
                j--;
            }else{
                i++;
            }
        }
        
        System.out.println("Not Found");
    }   

}