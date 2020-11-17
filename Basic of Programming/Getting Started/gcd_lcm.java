import java.util.Scanner;

/*
Question
1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
3. Take input "num1" and "num2" as the two numbers.
4. Print their GCD and LCM.

Input Format
num1
num2
.. the numbers whose GCD and LCM we have to find.

Output Format
a
b
.. where 'a' and 'b' are the GCD and LCM respectively.

Constraints
2 <= n <= 10^9

Sample Input
36
24

Sample Output
12
72

*/
public class gcd_lcm {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int originalNum1 = num1;
        int originalNum2 = num2;
        while(num1 % num2 != 0){
            int ans = num1 % num2;
            num1 = num2;
            num2 = ans;
        }
        int gcd = num2;
        int lcm = (originalNum1 * originalNum2) / gcd;
        System.out.println(gcd);
        System.out.println(lcm);


    }
}
