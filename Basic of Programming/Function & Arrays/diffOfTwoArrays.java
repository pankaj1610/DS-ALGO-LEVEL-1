/*
Question
1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. The two arrays represent digits of two numbers.
6. You are required to find the difference of two numbers represented by two arrays and print the arrays. a2 - a1

Assumption - number represented by a2 is greater.

Input Format
A number n1
n1 number of elements line separated
A number n2
n2 number of elements line separated

Output Format
A number representing difference of two numbers (a2 - a1), represented by two arrays.

Constraints
1 <= n1, n2 <= 100
0 <= a1[i], a2[i] < 10
number reresented by a1 is smaller than number represented by a2

Sample Input
3
2
6
7
4
1
0
0
0

Sample Output
7
3
3
*/
import java.util.*;

public class diffOfTwoArrays{

public static void main(String[] args) throws Exception {
    Scanner scn  = new Scanner(System.in);
    
    int num1 = scn.nextInt();
    int [] arr1 = new int [num1];
    //Taking input of arr1
    for(int i = 0; i < arr1.length; i++){
        arr1[i] = scn.nextInt();
    }
    
    int num2 = scn.nextInt();
    int [] arr2 = new int [num2];
    //Taking input of arr2
    for(int j = 0; j <  arr2.length; j++){
        arr2[j] = scn.nextInt();
    }
    //Creating diffArr of size num2
    int [] diffArr = new int[num2];
    
    int i = arr1.length - 1;
    int j = arr2.length - 1;
    int k = diffArr.length - 1;
    int carry = 0;
    
    while(k >= 0){
        //Initializing digit
        int digit = 0;
        //Adding leading zeroes to the lesser number
        int alv = i >= 0 ? arr1[i] : 0;
        //if sum of carry and each value of arr2 is greater than each value of arr1
        //then simply subtract and change carry to 0.
        if(arr2[j] + carry >= alv){
            digit += arr2[j] + carry - alv;
            carry = 0;
        }
        //if sum of carry and each value of arr2 is lesser than each value of arr1
        //then add 10 to value of arr2 and subtract and change carry to -1.
        else{
            digit = arr2[j] + carry + 10 - alv;
            carry = -1;
        }
        //Putting digit in diffArr
        diffArr[k] = digit;
        
        i--;
        j--;
        k--;
        
    }
    
    int index = 0;
    //Counting leading zeroes of diffArr 
    for(int x = 0; x < diffArr.length; x++){
        if(diffArr[x] == 0){
            index++;
        }
        else{
            break;
        }
    }
    //Printing values of diffArr after counting leading zeroes by index
    while(index < diffArr.length){
        System.out.println(diffArr[index]);
        index++;
    }
    
    
 }

}