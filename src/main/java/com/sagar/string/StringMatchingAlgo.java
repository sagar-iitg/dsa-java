package com.sagar.string;

public class StringMatchingAlgo {
    public static void main(String[] args) {
        String text="abfcfgdefghiklmno";
        String pattern="fgh";

        boolean ans=algo(text,pattern);
        System.out.println(ans);
    }

    private static boolean algo(String text, String pattern) {


        for(int i=0;i<=text.length()-pattern.length();i++)
        {
            int j;
            for(j=0;j<pattern.length();j++)
            {
                if(pattern.charAt(j)!=text.charAt(i+j)) break;


            }
            if(j==pattern.length()) return true;
        }
        return  false;
    }
}
