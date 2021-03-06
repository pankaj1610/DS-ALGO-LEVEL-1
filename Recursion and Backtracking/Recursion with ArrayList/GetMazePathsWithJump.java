/*
Question
1. You are given a number n and a number m representing number of rows and columns in a maze.
2. You are standing in the top-left corner and have to reach the bottom-right corner. 
3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 
4. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
Use sample input and output to take idea about output.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
Input Format
A number n
A number m
Output Format
Contents of the arraylist containing paths as shown in sample output
Constraints
0 <= n <= 10
0 <= m <= 10
Sample Input
2
2
Sample Output
[h1v1, v1h1, d1]
*/

import java.io.*;
import java.util.*;

public class GetMazePathsWithJump {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList < String > paths = getMazePaths(1, 1, n, m);
        System.out.println(paths);
    }

    public static ArrayList < String > getMazePaths(int sr, int sc, int dr, int dc) {
     
        if (sr == dr && sc == dc) {
            ArrayList < String > bres = new ArrayList < > ();
            bres.add("");
            return bres;
        }

        ArrayList < String > paths = new ArrayList < > ();
        //Horizontal move
        for (int move = 1; move <= dc - sc; move++) {
            ArrayList < String > hpaths = getMazePaths(sr, sc + move, dr, dc);
            for (String hpath: hpaths) {
                paths.add("h" + move + hpath);
            }
        }
        //Vertical move
        for (int move = 1; move <= dr - sr; move++) {
            ArrayList < String > vpaths = getMazePaths(sr + move, sc, dr, dc);
            for (String vpath: vpaths) {
                paths.add("v" + move + vpath);
            }
        }
        //Diagonal move
        for (int move = 1; move <= dc - sc && move <= dr - sr; move++) {
            ArrayList < String > dpaths = getMazePaths(sr + move, sc + move, dr, dc);
            for (String dpath: dpaths) {
                paths.add("d" + move + dpath);
            }
        }

        return paths;
    }
}