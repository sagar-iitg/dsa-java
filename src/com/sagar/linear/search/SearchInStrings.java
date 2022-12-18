package com.sagar.linear.search;

public class SearchInStrings {


    public static void main(String[] args) {
        String str="hello";
        char target='x';
       // System.out.println((int)target);

       // System.out.println( search(str,target));
        System.out.println(search1(str,target));



    }

    private static boolean search(String str, char target)
    {


        if(str.isEmpty())
            return false;

        for(int index=0;index<str.length();index++)
        {
            if(str.charAt(index)==target)
                return true;
        }
        return false;


    }
    private static boolean search1(String str, char target)
    {


        if(str.isEmpty())
            return false;

        for(char ch:str.toCharArray())
        {
            if(ch==target)
                return true;
        }
        return false;


    }

}
