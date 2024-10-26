package com.sagar.heap.interviewbit;

import java.util.Collections;
import java.util.PriorityQueue;

public class ProfitMaximisation {

    public static int solve(int[] A, int B) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int ele : A) pq.add(ele);
        System.out.println(pq);
        int profit = 0;
        while (B > 0) {
            int top = pq.remove();
            profit = profit + top;
            pq.add(top-1);
            B--;
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arr={2,3};
                int k=3;
        System.out.println(     solve(arr,k));
    }

}
