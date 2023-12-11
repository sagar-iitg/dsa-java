package com.sagar.string;

public class PalindromeCheckRecursionString {

    public static void main(String[] args) {

        String str="madama";
        boolean ans=solve(str,0,str.length()-1);
        System.out.println(ans);
    }

    private static boolean solve(String str,int first,int last) {

        if(last<first) return true;
        if(str.charAt(first)==str.charAt(last))
        {
            return solve(str,first+1,last-1);
        }
        else{
            return false;
        }

    }
}
