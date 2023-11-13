package com.sagar.apnacollege.backtracking;


public class FindSubset{

    public static void main(String[] args) 
    {
        String str="abc";
        FindSubsets(str," ",0);

        
    }

    public static void FindSubsets(String str,String ans,int idx)
    {



        //base case
        if(idx==str.length())
        {
            System.out.println(ans);
            return;
        }



        //recursion
        //yes choice 
        FindSubsets(str, ans+str.charAt(idx), idx+1);
        //nom4 choice
        FindSubsets(str, ans, idx+1);

    }
}