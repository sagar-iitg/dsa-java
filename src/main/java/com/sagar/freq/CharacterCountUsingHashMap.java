package com.sagar.freq;

import java.util.HashMap;

class CharacterCountUsingHashMap {
    public void count(String s) {
        
        HashMap<Character,Integer> map=new HashMap<>();
        for(Character ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
            
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        new CharacterCountUsingHashMap().count("anagram");
    }
}