package com.sagar.leet.code;

import java.util.Collections;
import java.util.PriorityQueue;

public class LeetCode295 {

    static PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
    static PriorityQueue<Integer> minHeap=new PriorityQueue<>();

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};


        for(int ele:arr){
            addNum(ele);
            System.out.println(median());
        }

    }
    static void addNum(int ele){

        if( minHeap.isEmpty() || ele>minHeap.peek()){
            minHeap.add(ele);

        }else{
            maxHeap.add(ele);
        }

        if( maxHeap.size() > minHeap.size()+1){
            minHeap.offer(maxHeap.poll());
        }
        else if(minHeap.size()>maxHeap.size()+1){
            maxHeap.offer(minHeap.poll());
        }
    }
    static double median(){
        if(maxHeap.size()==minHeap.size()){
            return (maxHeap.element()+minHeap.element())/2.0;
        }else if(maxHeap.size()>minHeap.size()){
            return  maxHeap.element();
        }else{
            return minHeap.element();
        }
    }

}
