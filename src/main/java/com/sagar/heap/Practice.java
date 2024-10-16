package com.sagar.heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Practice {
    public static void main(String[] args) {

        ArrayList<Integer> pq=new ArrayList<>(1000000);
        for(int i=0;i<2147483647;i++){
            pq.add(i);
        }
        System.out.println(pq);
    }
}
