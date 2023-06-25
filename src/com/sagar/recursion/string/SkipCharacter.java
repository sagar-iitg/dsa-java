package com.sagar.recursion.string;

public class SkipCharacter {


    public static void main(String[] args)
    {

        String s="abcdddaa";
        skip("",s,'z');


    }

    public static void skip(String p,String up,char skipCharacter)
    {

        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch==skipCharacter)
        {
            skip(p,up.substring(1),skipCharacter);
        }
        else{
            skip(p+ch,up.substring(1),skipCharacter);
        }
    }



}
