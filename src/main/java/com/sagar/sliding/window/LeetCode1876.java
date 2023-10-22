package com.sagar.sliding.window;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1876 {


    public static void main(String[] args) {

        String str="aababcabc";
        int ans=solve(str);
        System.out.println(ans);


    }

    private static int solve(String str) {

        int n=str.length();
        //k=windows size
        int k=3;
        int c=0;


        for(int i=0;i<n-k+1;i++)
        {

            StringBuilder temp=new StringBuilder();
            for(int j=i;j<i+k;j++)
            {
               // System.out.print(str.charAt(j));
                temp.append(str.charAt(j));


            }

            if(check(temp))
            {
                c++;
            }

           // System.out.println();
        }
        return c;


    }

    private static boolean check(StringBuilder temp)
    {
        HashMap<Character,Integer> map=new HashMap<>();
        char[] ch=temp.toString().toCharArray();
        for(int i=0;i<ch.length;i++)
        {

            if(map.containsKey(ch[i]))
            {
                map.put(ch[i],map.get(ch[i])+1);
            }
            else{
                map.put(ch[i],1);
            }
        }

        for(Map.Entry<Character,Integer> i:map.entrySet())
        {
            if(i.getValue()>1)
            {
                return false;
            }
        }
        return  true;


    }
}
