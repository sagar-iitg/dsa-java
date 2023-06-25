package com.sagar.interview.netradyne;

import java.util.HashMap;
import java.util.Map;

public class SecondUniqueCharacterInString {


    public static void main(String[] args) {

        String str="I love my India";

        HashMap<Character,Integer> hash=new HashMap();


        for(int i=0;i<str.length();i++)
        {
             char ch=str.charAt(i);


                if(hash.containsKey(ch))
                {
                    hash.put(ch,hash.get(ch)+1);
                    continue;

                }
                hash.put(ch,1);
        }
        System.out.println(hash);

        char ch1=' ';
        int c=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            if(hash.get(ch)==1)
            {
                ch1=ch;
                c++;



            }
            if(c==2)
                break;

        }

        System.out.println(ch1);

        for(Map.Entry<Character,Integer> mp:hash.entrySet())
        {
            System.out.println(mp.getKey() + " "+ mp.getValue());
        }




    }
}
