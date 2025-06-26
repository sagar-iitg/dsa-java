package com.sagar.stacks;

import java.util.ArrayList;
import java.util.List;

public class NearsetSmallestRight {

    public static void main(String[] args) {
        int[] arr={2,1,5,6,2,3};
        List<Integer> ans=new ArrayList<>();
        List<Integer> indexAns=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            int smaller=-1;
            int index=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    smaller=arr[j];
                    index=j;
                    break;
                }
            }
            ans.add(smaller);
            indexAns.add(index);
        }
        System.out.println(ans);
        System.out.println(indexAns);
    }
}
