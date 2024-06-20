package com.sagar.gfg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class SortingItems {
    public static void main(String[] args) {

        String[] items={"D","C","B","ABC","AA"};
        ArrayList<String> res = sortItems(items.length,items);
        System.out.println(res);
    }

    public static ArrayList<String> sortItems(int n, String[] items) {
        // code here
        Map<Long,String> map=new TreeMap<>();
        for(int i=0;i<items.length;i++){
            System.out.println(items[i]);
            Long temp=mapping(items[i]);
            System.out.println(temp);
            map.put(temp,items[i]);
        }
        Collection<String> res=map.values();
        ArrayList<String> ans=new ArrayList<>(res);
        return ans;


    }

    static long mapping(String str){
        long ans=0;
        int n=str.length();
        for(int i=0;i<str.length();i++){

            int ch=str.charAt(n-i-1)-'A';
            ch=ch+1;
            ans=ans+ch*(long)Math.pow(26,i);


        }
        return ans;
    }
}
