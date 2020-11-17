/*
Question
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.

Input Format
A number n
n1
n2
.. n number of elements

Output Format
A number representing max - min

Constraints
1 <= n <= 10^4
0 <= n1, n2
 .. n elements <= 10 ^9

Sample Input
6
15
30
40
4
11
9

Sample Output
36
*/
import java.util.*;

public class spanOfArray{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    int [] arr = new int[num];
   
    for(int i = 0; i < arr.length; i++){
        arr[i] = scn.nextInt();
    }
    int maxNum = arr[0];
    int minNum = arr[0];
    
    for(int j = 0; j < arr.length; j++){
        if(arr[j] > maxNum){
            maxNum = arr[j];
        }
        if(arr[j] < minNum){
            minNum = arr[j];
        }
    }
    int span = maxNum - minNum;
    System.out.println(span);
 }

}