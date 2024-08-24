package com.sagar.interviews.practice2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int minimumPushes(String word) {
       
       Map<Character,Integer> map=new HashMap<>();

       for(int i=0;i<word.length();i++){
             char ch=word.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
       }
       System.out.println(map);
       int[] freq=new int[map.size()];
       int i=0;
       for(int value:map.values()){
                freq[i]=value;
                i=i+1;
       }
       Arrays.sort(freq);
        System.out.println(Arrays.toString(freq));
       int cost=0;
       for(int k=0;k<freq.length;k++){
            
          if(k<8)
            cost=cost+1*freq[k];
          else if(k>=8 && k<16){
            cost=cost+2*freq[k];
          }
          else if(k>=16 && k<24){
            cost=cost+3*freq[k];
          }
          else if(k>=24 && k<=26){
            cost=cost+4*freq[k];
          }
            
       }
     return cost;
        
        
    }

    public static void main(String[] args) {
            String word="aabbccddeeffgghhiiiiii";
            int ans=minimumPushes(word);
        System.out.println(word);
        System.out.println(ans);

    }
}