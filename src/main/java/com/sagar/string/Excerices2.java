package com.sagar.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class Excerices2 {

    public static void main(String[] args) {
        String[] str={"aabbcc","","abcde","aabbc","aabbcc","a  b! a b!","aA"," ","/0","  "};
        for(String i:str)
            System.out.println(solve(i));
    }
    public static int solve(String str) {

        Map<Character, Integer> map=new LinkedHashMap<>();

        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        System.out.println(map);

        for (int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                return i;
            }
        }
        // Step 3: Return -1 if no unique character is found
        return -1;




    }
}
