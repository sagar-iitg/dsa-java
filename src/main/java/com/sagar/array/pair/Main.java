package com.sagar.array.pair;


import java.util.ArrayList;
import java.util.Collections;

class Pair implements Comparable<Pair>{
    int first;
    int second;
    Pair(int first,int second)
    {
        this.first=first;
        this.second=second;
    }

    @Override
    public String toString() {
        return "{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }



    @Override
    public int compareTo(Pair o) {
        return this.second-o.second;
    }
}
public class Main {

    public static void main(String[] args) {

        int[] a={10,9,4,5,4};
        int[] b={2,10,9,1,5};
        ArrayList<Pair> ans=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            ans.add(new Pair(a[i],b[i]));
        }
        Collections.sort(ans);
        System.out.println(ans);

    }
}
