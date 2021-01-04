/*
Question
1. You are given a number n representing number of stairs in a staircase.
2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
Use sample input and output to take idea about output.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
Input Format
A number n
Output Format
Contents of the arraylist containing paths as shown in sample output
Constraints
0 <= n <= 10
Sample Input
3
Sample Output
[111, 12, 21, 3]
*/
import java.io.*;
import java.util.*;

public class GetStairPaths {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        ArrayList<String> path = getStairPaths(num);
        System.out.println(path);
    }

    public static ArrayList < String > getStairPaths(int n) {
        
        if(n == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }else if(n < 0){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }
        
        ArrayList<String> path1 = getStairPaths(n - 1);
        ArrayList<String> path2 = getStairPaths(n - 2);
        ArrayList<String> path3 = getStairPaths(n - 3);
        
        ArrayList<String> paths = new ArrayList<>();
        
        for(String path: path1){
            paths.add(1 + path);
        }
        for(String path: path2){
            paths.add(2 + path);
        }
        for(String path: path3){
            paths.add(3 + path);
        }
    
        return paths;
    }

}