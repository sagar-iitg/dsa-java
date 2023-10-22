package com.sagar.array;

public class KadaneAlgorithm {


    public static void main(String[] args) {
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int res=solve(a);
        System.out.println(res);
    }

    private static int solve(int[] a) {

        int curr_sum=0;
        int max_sum=0;

        for (int j : a) {
            curr_sum = curr_sum + j;
            max_sum = Math.max(max_sum, curr_sum);
            if (curr_sum < 0)
                curr_sum = 0;
        }
        return max_sum;
    }
}
