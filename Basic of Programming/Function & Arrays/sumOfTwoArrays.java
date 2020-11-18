/*
Question
1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. The two arrays represent digits of two numbers.
6. You are required to add the numbers represented by two arrays and print the
arrays.

Input Format
A number n1
n1 number of elements line separated
A number n2
n2 number of elements line separated

Output Format
A number representing sum of two numbers, represented by two arrays.

Constraints
1 <= n1, n2 <= 100
0 <= a1[i], a2[i] < 10

Sample Input
5
3
1
0
7
5
6
1
1
1
1
1
1

Sample Output
1
4
2
1
8
6
*/
import java.util.*;

public class sumOfTwoArrays{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    
    int num1 = scn.nextInt();
    int [] arr1 = new int [num1];
    //Taking input of arr1
    for(int i = 0; i < arr1.length; i++){
        arr1[i] = scn.nextInt();
    }
    
    int num2 = scn.nextInt();
    int [] arr2 = new int [num2];
    //Taking input of arr2
    for(int i = 0; i < arr2.length; i++){
        arr2[i] = scn.nextInt();
    }
    //Creating sumArray
    int [] sumArr = new int [num1 > num2 ? num1 : num2];
    int i = arr1.length - 1;
    int j = arr2.length - 1;
    int k = sumArr.length - 1;
    int carry = 0;
    
    while(k >= 0){
        //Adding carry to digit
        int digit = carry;
        //Adding value of arr1 in digit 
        if(i >= 0){
            digit += arr1[i];
        }
        //Adding value of arr2 in digit
        if(j >= 0){
            digit += arr2[j];
        }
        //Getting new carry after addition
        carry = digit / 10;
        //Getting new digit after addition
        digit = digit % 10;
        //Assigning digit in sumArray
        sumArr[k] = digit;
        i--;
        j--;
        k--;
        
    }
    //if carry is left print it
    if(carry != 0){
        System.out.println(carry);
    }
    //Printing value of sumArray
    for(int val : sumArr){
        System.out.println(val);
    }
 }

}