/*
Question
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.

Asssumption - Array is sorted. Array may have duplicate values.

Input Format
A number n
n1
n2
.. n number of elements
A number d

Output Format
A number representing first index
A number representing last index

Constraints
1 <= n <= 1000
1 <= n1, n2, .. n elements <= 100
1 <= d <= 100

Sample Input
315
1
5
10
15
22
33
33
33
33
33
40
42
55
66
77
33

Sample Output
5
9

Approach
1.Use binary search
2.For first index
  2.1 When u get the data, assign mid in first index and change high to (mid - 1) to get accurate value of first index.
3.For last index
  3.1 When u get the data, assign mid in last index and change low to (mid + 1) to get accurate value of last index.
*/

import java.io.*;
import java.util.*;

public class firstAndlastIndex{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    
    int num = scn.nextInt();
    int [] arr = new int [num];
    for(int i = 0; i < arr.length; i++){
        arr[i] = scn.nextInt();
    }
    
    int data = scn.nextInt();
    
    int low = 0;
    int high = arr.length - 1;
    int firstIndex = -1;
    while(low <= high){
        int mid = (low + high) / 2;
        if(data < arr[mid]){
            high = mid - 1;
        }else if(data > arr[mid]){
            low = mid + 1;
        }else{
            firstIndex = mid;
            high = mid - 1;
        }
    }
    System.out.println(firstIndex);
    
    low = 0;
    high = arr.length - 1;
    int lastIndex = -1;
    while(low <= high){
        int mid = (low + high) / 2;
        if(data < arr[mid]){
            high = mid - 1;
        }else if(data > arr[mid]){
            low = mid + 1;
        }else{
            lastIndex = mid;
            low = mid + 1;
        }
    }
    System.out.println(lastIndex);
    
    
 }

}