package com.sagar.leet.code;

import java.util.Arrays;

public class LeetCode11ContainerWithMostWater {

    public static void main(String[] args) {

        int[] arr={1,2,3,4};
        System.out.println(Arrays.toString(arr));
        int ans=new LeetCode11ContainerWithMostWater().maxArea(arr);
        System.out.println(ans);

    }
    public int maxArea(int[] height) {

        int maxWater=0;
        int i=0;
        int j=height.length-1;
        while(i<j){

            int w=j-i;
            int h=Math.min( height[i],height[j] );
            int area=h*w;
            maxWater=Math.max(maxWater,area);


            if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }


        }
        return maxWater;
    }
}
