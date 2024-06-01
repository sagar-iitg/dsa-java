package com.sagar.two.pointer;

import java.util.ArrayList;
import java.util.List;

public class FindAllTriplets {

    public static void main(String[] args) {

        int[] arr={2,3,1,6,8,7};
        int target=1;
        int c=0;
        List<Integer> sum=new ArrayList<>();
        for (int i=0; i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    sum.add(arr[i]+arr[j]+arr[k]);
                    c++;
                }
            }
        }

        int minDiff=Integer.MAX_VALUE;
        int updatedSum=0;
        for(int i=0;i<sum.size();i++){
            int diff=Math.abs(target-sum.get(i));
            if(minDiff>=diff){
                minDiff=diff;
                updatedSum=sum.get(i);
            }
        }
        System.out.println(updatedSum);
        System.out.println(c);
    }
}
