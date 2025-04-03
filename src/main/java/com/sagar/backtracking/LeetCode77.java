package com.sagar.backtracking;

import java.util.ArrayList;
import java.util.List;

public class LeetCode77 {

        public static List<List<Integer>> combine(int n, int k) {
            List<List<Integer>>  ans = new ArrayList<>();
            solve(ans, n, k, 1, new ArrayList<>());
            return ans;
        }

        static void  solve(List<List<Integer>>  ans, int n, int k, int start, List<Integer> temp) {
            if (k == 0) {
                ans.add(new ArrayList<>(temp));
                return;
            }

            temp.add(start);
            solve(ans, n, k - 1, start + 1, temp);  // Recurse with the next element
            temp.remove(temp.size() - 1);  // Backtrack to explore combinations without 'start'

            solve(ans, n, k, start + 1, temp);  // Recurse without adding 'start'
        }

    public static void main(String[] args) {
        System.out.println(combine(4,2));
    }
}
