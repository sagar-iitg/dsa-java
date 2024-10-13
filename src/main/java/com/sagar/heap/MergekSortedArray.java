package com.sagar.heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Info {

    int value;
    int row;
    int col;

    public Info(int value, int row, int col) {
        this.value = value;
        this.row = row;
        this.col = col;
    }

    public int getValue() {
        return value;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}

public class MergekSortedArray {


    public static void main(String[] args) {

        int[][] arr = {{2, 4, 6, 8}, {1, 3, 5, 7}, {0, 9, 10, 11}};
        int k = 3;
        int n = 4;
        System.out.println(mergeKArray(arr, k, n));

    }

    private static ArrayList<Integer> mergeKArray(int[][] arr, int k, int n) {
        Comparator<Info> comp = new Comparator<Info>() {
            @Override
            public int compare(Info o1, Info o2) {
                return Integer.compare(o1.getValue(), o2.getValue());
            }
        };

        //minHeap
        // PriorityQueue<Info> pq=new PriorityQueue<>(Comparator.comparing(Info::getValue));
        PriorityQueue<Info> pq = new PriorityQueue<>(comp);


        // all first element of sorted array is inserted in priority queue

        for (int i = 0; i < k; i++) {
            Info temp = new Info(arr[i][0], i, 0);
            pq.add(temp);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        while (!pq.isEmpty()) {

            int ele = pq.peek().getValue();
            int toprow = pq.peek().getRow();
            int topcol = pq.peek().getCol();
            pq.poll();
            ans.add(ele);

            if (topcol + 1 < n) {
                Info newInfo = new Info(arr[toprow][topcol + 1], toprow, topcol + 1);
                pq.add(newInfo);
            }


        }
        return ans;


    }

}
