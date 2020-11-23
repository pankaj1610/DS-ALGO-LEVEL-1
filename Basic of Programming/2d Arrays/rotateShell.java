/*
Question
1. You are given a number n, representing the number of rows of a matrix.
2. You are given a number m, representing the number of columns of a matrix.
3. You are given n * m numbers, representing elements of 2d array a.

shell-rotate

4. You are given a shell number s. For details check image.
5. You are given a number r, representing number of anti-clockwise rotations (for +ve numbers) of the shell s.
6. You are required to rotate the sth shell of matrix by r rotations and display the matrix using display function.

Input Format
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements of array a
A number s
A number r

Output Format
output is handled by display function

Constraints
1 <= n <= 10^2
1 <= m <= 10^2
-10^9 <= e11, e12, .. n * m elements <= 10^9
0 < s <= min(n, m) / 2
-10^9 <= r <= 10^9

Sample Input
5
7
11
12
13
14
15
16
17
21
22
23
24
25
26
27
31
32
33
34
35
36
37
41
42
43
44
45
46
47
51
52
53
54
55
56
57
2
3

Sample Output
11 12 13 14 15 16 17
21 25 26 36 46 45 27
31 24 33 34 35 44 37
41 23 22 32 42 43 47
51 52 53 54 55 56 57

Approach
1.Fill 1d array from given shell.
2.Rotate 1d array.
3.Fill each wall of given shell from 1d array.
*/

import java.io.*;
import java.util.*;

public class rotateShell {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int m = scn.nextInt();
        //Creating 2d array.
        int [][] arr = new int [n][m];
        //Taking input for 2d array.
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
                
            }
        }
        
        int s = scn.nextInt();
        int r = scn.nextInt();
        //calling rotateShell.
        rotateShell(arr, s, r);
        //calling  display.
        display(arr);
        
        
    }
    
    public static void rotateShell(int[][] arr, int s, int r){
        int[] onedArr = fillOnedArrFromShell(arr, s);
        rotate(onedArr, r);
        fillShellFromOnedArr(arr, s, onedArr);
        
    }
    
    public static void rotate(int[] onedArr, int r){
        // This will rotate a one dimensional array by given number of rotation(r).
        
        r = r % onedArr.length;
        if(r < 0){
            r = r + onedArr.length;
        }
        
        reverse(onedArr, 0, onedArr.length - r - 1);
        reverse(onedArr, onedArr.length - r, onedArr.length - 1);
        reverse(onedArr, 0, onedArr.length - 1);
    }
    
    
    public static void reverse(int[] onedArr, int leftIndex, int rightIndex){
        //This will reverse the element of a one dimensional array.
        while(leftIndex < rightIndex){
            int temp = onedArr[leftIndex];
            onedArr[leftIndex] = onedArr[rightIndex];
            onedArr[rightIndex] = temp;
            
            leftIndex++;
            rightIndex--;
        }        
    }
    
    public static int[] fillOnedArrFromShell(int[][] arr, int s){
        //This will fill the one dimensional array(onedArr) from given shell(s).
            int minRow = s - 1;
            int minColumn = s - 1;
            int maxRow = arr.length - s;
            int maxColumn = arr[0].length - s;
            //Getting size of onedArr.
            int onedArrSize = 2 * (maxRow - minRow + maxColumn - minColumn);
            //creating 1d array.
            int[] onedArr = new int [onedArrSize];
            int index = 0;
            
            //Filling onedArr from left wall of given shell(s).
            for(int i = minRow, j = minColumn; i <= maxRow; i++){
                onedArr[index] = arr[i][j];
                index++;
            }

            //Filling onedArr from bottom wall of given shell(s).
            for(int j = minColumn + 1, i = maxRow; j <= maxColumn; j++){
                onedArr[index] = arr[i][j];             
                index++;
            }
           
            //Filling onedArr from right wall of given shell(s).
            for(int i = maxRow - 1, j = maxColumn; i >= minRow; i--){
                onedArr[index] = arr[i][j];
                index++;
            }

            //Filling onedArr from top wall of given shell(s).
            for(int j = maxColumn - 1, i = minRow; j >= minColumn + 1; j--){
                onedArr[index] = arr[i][j];
                index++;
            }
            //Returning the 1d array.
            return onedArr;
            
    }
    
    public static void fillShellFromOnedArr(int[][] arr, int s, int[] onedArr){
        //This will fill the given shell(s) from one dimensional array(onedArr).
           int minRow = s - 1;
            int minColumn = s - 1;
            int maxRow = arr.length - s;
            int maxColumn = arr[0].length - s;
            
            int index = 0;
            
            //Filling the left wall of given shell(s) from onedArr.
            for(int i = minRow, j = minColumn; i <= maxRow; i++){
                arr[i][j] = onedArr[index];
                index++;
            }

            //Filling the bottom wall of given shell(s) from onedArr.
            for(int j = minColumn + 1, i = maxRow; j <= maxColumn; j++){
                arr[i][j] = onedArr[index];             
                index++;
            }
           
            //Filling the right wall of given shell(s) from onedArr.
            for(int i = maxRow - 1, j = maxColumn; i >= minRow; i--){
                arr[i][j] = onedArr[index];
                index++;
            }
            
            //Filling the top wall of given shell(s) from onedArr.
            for(int j = maxColumn - 1, i = minRow; j >= minColumn + 1; j--){
                arr[i][j] = onedArr[index];
                index++;
            }
            
    }

    public static void display(int[][] arr){
        //This will display the value of 2d array in matrix form.
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}