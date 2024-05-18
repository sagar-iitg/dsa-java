package com.sagar.array.pair.example;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Pair{
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


}
public class Solution {

    public static void main(String[] args) {

        int[] a={10,9,4,5,4};
        int[] b={2,10,9,1,5};
        ArrayList<Pair> ans=new ArrayList<>();

        for(int i=0;i<a.length;i++)
        {
            ans.add(new Pair(a[i],b[i]));
        }
        ans.sort((o1,o2) ->o1.second - o2.second);
        System.out.println(ans);

    }
}

