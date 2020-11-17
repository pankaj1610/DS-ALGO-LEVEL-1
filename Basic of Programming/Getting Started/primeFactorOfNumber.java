/*
Question
1. You are required to display the prime factorization of a number.
    2. Take as input a number n.
    3. Print all its prime factors from smallest to largest.
                               
Input Format
n, an integer

Output Format
p1  p2  p3  p4.. all prime factors of n

Constraints
2 <= n < 10 ^ 9

Sample Input
1440

Sample Output
2 2 2 2 2 3 3 5
*/
import java.util.Scanner;
public class primeFactorOfNumber {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int counter = 2;
        while(num > 1){
            if(num % counter == 0){
                System.out.print(counter + " ");
                num = num / counter;

        }
        else{
            counter++;
        }
    }
}
}

/*
More efficient
public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        for(int div = 2; div * div < num; div++){
            while(num % div == 0){
                num = num / div;
                System.out.print(div + " ");
                
                
            }
            
        }
        if(num != 1)
        {
            System.out.println(num);
        }

}
}
*/
