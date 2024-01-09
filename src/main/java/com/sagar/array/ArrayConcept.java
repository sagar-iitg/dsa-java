package com.sagar.array;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayConcept {

    public static void main(String[] args) {
        Integer[] ans=new Integer[10];
        System.out.println(Arrays.toString(ans));
        Boolean[][] b=new Boolean[2][3];
        System.out.println(Arrays.deepToString(b));

        //hashmap concept
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,10);
        map.put(2,20);
        System.out.println(map.get(3));
    }
}
