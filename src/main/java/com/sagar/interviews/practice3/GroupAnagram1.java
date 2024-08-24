package com.sagar.interviews.practice3;

import java.util.*;

public class GroupAnagram1 {

    public static void main(String[] args) {

        String[] strs={"eat","tea","tan","ate","nat","bat"};
       // String res=hash("ate");
        //System.out.println(res);
        Map<String, List<String>> groups = new HashMap<>();
        for(String s:strs){
            String temp=hash(s);
            if(groups.containsKey(temp)){

                   groups.get(temp).add(s);
            }else{
                ArrayList<String> x=new ArrayList<>();
                x.add(s);
                groups.put(temp,x);
            }
        }
        System.out.println(groups);
    }
    public static  String hash(String s){

        int[] freq=new int[26];
        for(char ch:s.toCharArray()){

            freq[ch-'a']++;
        }
      //  System.out.println(Arrays.toString(freq));
        StringBuilder res=new StringBuilder();
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                res.append((char) (i+'a')).append(freq[i]);


            }
        }
        return  res.toString();
    }


}
