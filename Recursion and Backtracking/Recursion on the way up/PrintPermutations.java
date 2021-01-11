/*
Question
1. You are given a string str.
2. Complete the body of printPermutations function - without changing signature - to calculate and print all permutations of str.
Use sample input and output to take idea about permutations.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
Input Format
A string str
Output Format
Permutations of str in order hinted by Sample output
Constraints
0 <= str.length <= 7
Sample Input
abc
Sample Output
abc
acb
bac
bca
cab
cba
*/

import java.io.*;
import java.util.*;

public class PrintPermutations {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printPermutations(str, "");
    }

    public static void printPermutations(String que, String path) {
        
        if(que.length() == 0){
            System.out.println(path);
            return;
        }
        
        
        for(int i = 0; i < que.length(); i++){
            char ch = que.charAt(i);
            String lftPart = que.substring(0, i);
            String rghtPart = que.substring(i + 1);
            String ros = lftPart + rghtPart;
            printPermutations(ros, path + ch);
            
        }
    }

}
