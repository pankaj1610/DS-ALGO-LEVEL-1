/*
Question
1. You've to check whether a given number is prime or not.
2. Take a number "t" as input representing count of input numbers to be tested.
3. Take a number "n" as input "t" number of times.
4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.

Input Format
A number t
A number n
A number n
.. t number of times

Output Format
prime
not prime
not prime
.. t number of times

Constraints

1 <= t <= 10000
2 <= n < 10^9

Sample Input
5
19
21
33
37
121

Sample Output
prime
not prime
not prime
prime
not prime

*/
import java.util.*;
public class IsPrime {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int testCase = scn.nextInt();
        for(int i = 1; i <= testCase; i++){
            int num = scn.nextInt();
            int count = 0;
            for(int j = 2; j * j <= num; j++){
                if(num % j == 0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println("prime");
                }
            else{
                System.out.println("not prime");
                }
            

        }

    }
    
}
