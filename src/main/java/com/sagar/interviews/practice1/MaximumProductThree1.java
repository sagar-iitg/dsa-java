package com.sagar.interviews.practice1;

import java.util.PriorityQueue;

public class MaximumProductThree1{

    public static void main(String[] args) {
        int[] arr={-10,-10,5,2};
        int ans=maxProductOfThree(arr);
        System.out.println(ans);
    }

    public  static int maxProductOfThree(int[] arr){
        // Min heap to track the three largest numbers
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // Max heap (using negative values) to track the two smallest numbers
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for(int ele:arr){
            minHeap.offer(ele);
            if(minHeap.size()>3){
                minHeap.poll();
            }
            maxHeap.offer(ele);
            if(maxHeap.size()>2){
                maxHeap.poll();
            }

        }
        //System.out.println(maxHeap);
        //System.out.println(minHeap);
        // Retrieve the largest 3 numbers from the minHeap
        int max1 = minHeap.poll();
        int max2 = minHeap.poll();
        int max3 = minHeap.poll();

        // Retrieve the smallest 2 numbers from the maxHeap
        int min1 = maxHeap.poll();
        int min2 = maxHeap.poll();

        // Calculate the two possible products
        int product1 = max1 * max2 * max3;  // Product of the three largest numbers
        int product2 = min1 * min2 * Math.max(max1,Math.max(max2,max3) );  // Product of the two smallest and the largest number

        // Return the maximum of the two
        return Math.max(product1, product2);


    }
}
