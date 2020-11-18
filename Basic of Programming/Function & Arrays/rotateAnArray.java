/*
Question
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are given a number k.
4. Rotate the array a, k times to the right (for positive values of k), and to
the left for negative values of k.

Input Format
Input is managed for you

Output Format
Output is managed for you

Constraints
0 <= n < 10^4
-10^9 <= a[i], k <= 10^9

Sample Input
5
1
2
3
4
5
3

Sample Output
3 4 5 1 2

Apporach
1.Divide the array into two halves from k(rotation).
2.Reverse the frst part of array.
3.Reverse the second part of array.
4.Then reverse the whole array. 

*/


import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
 
}  
 public static void reverse(int [] a, int i, int j){
      //Reverse the array
 
      int leftIndex = i;
      int rightIndex = j;
      
      while(leftIndex <= rightIndex){
          int temp = a[leftIndex];
          a[leftIndex] = a[rightIndex];
          a[rightIndex] = temp;
          
          leftIndex++;
          rightIndex--;
      }
      
  }

  public static void rotate(int[] a, int k){
    k = k % a.length;
    
    if(k < 0){
        k += a.length;
    }
    //Reverse the first part of array
    reverse(a, 0, a.length - k - 1);
    //Reverse the second part
    reverse(a, a.length - k, a.length - 1);
    //Reverse the array
    reverse(a, 0, a.length - 1);
    
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}
