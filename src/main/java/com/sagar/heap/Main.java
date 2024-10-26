package com.sagar.heap;

public class Main {

    public static void main(String[] args) throws Exception {

        Heap<Integer> heap=new Heap<>();

        heap.insert(34);
        heap.insert(33);
        heap.insert(45);
        heap.insert(26);
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        //System.out.println(heap.remove());

    }
}
