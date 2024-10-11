package com.sagar.heap.leetcode;


import java.util.*;

class Pair1{
    int x;
    int y;

    public Pair1(int x, int y) {
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

public class TopKFrequentElement347 {

    public static void main(String[] args) {
        int[] nums={1};
        int k=1;
       solve(nums,k);
    }
    private static void solve(int[] nums,int k){

              Map<Integer,Integer> map=new HashMap<>();

              for(int i:nums){
                  map.put(i,map.getOrDefault(i,0)+1);
              }
             // System.out.println(map);

              PriorityQueue<Pair1>  pq=new PriorityQueue<>(Comparator.comparing(Pair1::getY));
              for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                  pq.add(new Pair1(entry.getKey(),entry.getValue()));

                  if(pq.size()>k){
                      pq.poll();
                  }
              }

              System.out.println(pq);

              int[] ans=new int[k];
              int i=0;
              for(Pair1 p:pq){
                  ans[i]=p.getX();
                  i++;
              }

        System.out.println(Arrays.toString(ans));
    }
}
