package com.sagar.string;

public class CheckEnglishCharacter {


    public static void main(String[] args) {

        String s="abc-A$1";
        for(char ch:s.toCharArray())
        {
            boolean ans=checkEnglishCharcater(ch);
            System.out.println(ans+" "+ ch);

        }

        System.out.println((int)'z');

    }

    private static boolean checkEnglishCharcater(char ch) {



            if(ch>=55 && ch<=90)
            {
                return true;
            }
            if(ch>=97 && ch<=122)
            {
                return true;
            }

        return  false;
    }
}
