/*
Question
1. You are given a string str.
2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
Use sample input and output to take idea about subsequences.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.
Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
Input Format
A string str
Output Format
Contents of the arraylist containing subsequences as shown in sample output
Constraints
0 <= str.length <= 20
Sample Input
abc
Sample Output
[, c, b, bc, a, ac, ab, abc]
*/

import java.io.*;
import java.util.*;

public class GetSubSequences {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> res = gss(str);
        System.out.println(res);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();//Creating baseresultArrayList
            bres.add("");//Adding space to baseresultArrayList
            return bres;
        }
        char ch = str.charAt(0);//getiing a
        String ss = str.substring(1);//getting bc
        ArrayList<String> rres = gss(ss);//getting list of subsequences of bc
        
        ArrayList<String> myres = new ArrayList<>();//creating myres 
        for(String s: rres){
            myres.add("" + s);//Adding space with aubsequences of bc in myres
        }
        for(String s: rres){
            myres.add(ch + s);//Adding a with subsequences of bc in myres
        }
        return myres;//returning myres
    }

}