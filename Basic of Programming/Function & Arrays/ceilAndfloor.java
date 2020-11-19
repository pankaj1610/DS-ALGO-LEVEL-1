/*
Question
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are given another number d.
4. You are required find the ceil and floor of d in the array a.

Ceil is defined as value in array which is just greater than d. If an element equal to d exists that will be considered as ceil.
Floor is defined as value in array which is just lesser than d. If an element equal to d exists that will be considered as floor.
Asssumption - Array is sorted.

Input Format
A number n
n1
n2
.. n number of elements
A number d

Output Format
A number representing ceil
A number representing floor

Constraints
1 <= n <= 1000
-10^9 <= n1, n2, .. n elements <= 10^9
-10^9 <= d <= 10^9

Sample Input
10
1
5
10
15
22
33
40
42
55
66
34

Sample Output
40
33

Approach
1.Use binary search
2.When u change low, change floor to mid.
3.when u change high, changen ceil to mid. 
4.when u get the data, assign mid to ceil and floor and break.
*/


import java.io.*;
import java.util.*;

public class ceilAndfloor{

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
   int ceil = 0;
   int floor = 0;
   
   while(low <= high){
       int mid = (low + high) / 2;
       if(data > arr[mid]){
           low = mid + 1;
           floor = arr[mid];
       }else if(data < arr[mid]){
           high = mid - 1;
           ceil = arr[mid];
       }else{
           ceil = arr[mid];
           floor = arr[mid];
           break;
       }
   }
   System.out.println(ceil);
   System.out.println(floor);
 }

}