package com.sagar.utilities;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetToMap {

    public static void main(String[] args) {

        Set<Integer> set=new HashSet<>();
        set.add(25);
        set.add(100);
        set.add(3);
        set.add(1);
        set.add(2);

        System.out.println(set);
        Integer[] emptyArray = new Integer[0];
        System.out.println(Arrays.toString(emptyArray));
        Integer[] array = set.toArray(emptyArray);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(set.toArray(new Integer[10])));


    }
}
