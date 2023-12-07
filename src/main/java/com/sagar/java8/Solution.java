package com.sagar.java8;

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {

        String[] strs={"ab","a"};
        String ans=longestCommonPrefix(strs);
        System.out.println(ans);
    }
    public static String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
       int row=strs.length;
       int col=strs[0].length();
     StringBuilder output=new StringBuilder();


        //column
        //string of minimum length
       for(int i=0;i<col;i++)
       {
           for(int j=0;j<row-1;j++)
           {
               if(i>strs[j].length()-1) return output.toString();
               if(strs[j].charAt(i)!=strs[j+1].charAt(i))
                    return output.toString();
           }
           output.append(strs[0].charAt(i));
       }
       return output.toString();

    }
}