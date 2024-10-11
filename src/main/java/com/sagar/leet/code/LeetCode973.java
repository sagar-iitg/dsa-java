package com.sagar.leet.code;


import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Thrice{

    int x;
    int y;
    double sqrt;
    Thrice(int x,int y){
        this.x=x;
        this.y=y;
        this.sqrt=Math.sqrt(x*x+y*y);
    }
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
    double getsqrt(){
        return sqrt;
    }

    @Override
    public String toString() {
        return "Thrice{" +
                "x=" + x +
                ", y=" + y +
                ", sqrt=" + sqrt +
                '}';
    }
}



public class LeetCode973 {

    public static void main(String[] args) {
        int[][] points={{3,3},{5,-1},{-2,4}};
        int k=2;
        int[][] ans=new int[k][2];
        kClosest(points,k,ans);
    }
    public static void kClosest(int[][] points, int k,int[][] ans) {

        PriorityQueue<Thrice> pq=new PriorityQueue<>(
                Comparator.comparing(Thrice::getsqrt).reversed());

        for(int i=0;i<points.length;i++){

            int x=points[i][0];
            int y=points[i][1];
            pq.add(new Thrice(x,y));
            if(pq.size()>k){
                pq.poll();
            }
        }
       // System.out.println(pq);

        int i=0;
        while (!pq.isEmpty()){
            Thrice t=pq.poll();
            ans[i][0]=t.getX();
            ans[i][1]=t.getY();
            i++;

        }
        System.out.println(Arrays.deepToString(ans));

    }

}
