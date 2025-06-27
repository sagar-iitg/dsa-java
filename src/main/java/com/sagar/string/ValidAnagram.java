package com.sagar.string;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {
        String str1="sagar";
        String str2="raags";
        boolean ans=solve(str1,str2);
        System.out.println(ans);
    }

    static  boolean solve(String  s1,String  s2){

        HashMap<Character,Integer> h1=new HashMap<>();


        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(h1.containsKey(ch)){
               int c= h1.get(ch)+1;
                h1.put(ch,c);
            }else{
                h1.put(ch,1);
            }
        }

        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            if(h1.containsKey(ch)){
                int c= h1.get(ch)-1;
                h1.put(ch,c);
            }else{
                return false;
            }
        }
        for(Map.Entry<Character,Integer> i:h1.entrySet()){
            if(i.getValue()!=0) return false;
        }
        return  true;
    }
}
