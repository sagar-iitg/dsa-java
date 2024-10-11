package com.sagar.leet.code;

import java.util.*;

class Pair2{
    int x;
    int y;

    public Pair2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Pair1{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
public class FrequencySort1636 {

    public static void main(String[] args) {
        int[] arr={2,3,1,3,2};
        int[] ans=new int[arr.length];
        solve(arr,ans);
        System.out.println(Arrays.toString(ans));
    }
    private static void solve (int[] arr,int[] ans){

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
       // System.out.println(map);
        Comparator<Pair2> cmp=new Comparator<Pair2>() {
            @Override
            public int compare(Pair2 o1, Pair2 o2) {

               if(o1.getY()==o2.getY()){
                   return Integer.compare(o2.getX(),o1.getX());
               }
                return Integer.compare(o1.getY(),o2.getY());
            }
        };
        PriorityQueue<Pair2> pq=new PriorityQueue<>(cmp);

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                pq.add(new Pair2(entry.getKey(),entry.getValue()));
        }
        int i=0;
        while (!pq.isEmpty()){
          Pair2 p=pq.poll();
          int y1=p.getY();
          int x1=p.getX();
          for(int j=0;j<y1;j++){
              ans[i]=x1;
              i++;
          }

        }
     //  System.out.println(Arrays.toString(ans));

    }
}
