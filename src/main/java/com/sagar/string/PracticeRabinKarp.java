package com.sagar.string;

public class PracticeRabinKarp {


    public static void main(String[] args) {

        String text="abcadefgh";
        String pattern="cde";
        boolean ans=rabinKarpAlgo(text,pattern);
        System.out.println(ans);
    }

    private static boolean rabinKarpAlgo(String text, String pattern) {

        int patternHashCode=pattern.hashCode();
        for(int i=0;i<=text.length()-pattern.length();i++)
        {
            if(text.substring(i,i+pattern.length()).hashCode()==patternHashCode)
            {
                if(text.substring(i,i+pattern.length()).equals(pattern))
                    return  true;
            }
        }
        return false;
    }
}
