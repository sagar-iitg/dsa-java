package com.sagar.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class Excerices1 {

    public static void main(String[] args) {
        String str="aabbcc";
        System.out.println(solve(str));
    }
    public static int solve(String str) {

        Map<Character, Integer> map=new LinkedHashMap<>();

        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        System.out.println(map);
        char ch='\0';
        for(Map.Entry<Character,Integer> i:map.entrySet()){
            if(i.getValue()==1)
            {
                ch=i.getKey();
                break;
            }
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                return i;
            }
        }
        return -1;


    }
}
