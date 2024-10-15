package com.sagar.heap.impl1;

public class MaxHeap {

    int[] arr;
    int size;
    int totalSize;

    public MaxHeap(int totalSize){
        this. arr=new int[totalSize];
        this.size=0;
        this.totalSize=totalSize;
    }
    void add(int val){


        if(size==totalSize) {
            System.out.println("Heap Overflow");
            return;
        }
        int index=size;
        arr[index]=val;
        size++;

        while (index>0){
            int parent=(index-1)/2;
            if(arr[index] >arr[parent]){
                swap(arr,index,parent);
                index=parent;
            }
            else{
                break;
            }
        }
    }
    void delete(){

        int index=0;
        arr[index]=arr[size-1];
        size--;


        while (index<size){
            int largest=index;
            int left=2*index+1;
            int right=2*index+2;
            if(left<size && arr[largest] < arr[left]){
                largest=left;
            }
            if(right<size && arr[largest]<arr[right]){
                largest=right;
            }
            if(index==largest) break;
            else{
                swap(arr,largest,index);
                index=largest;
            }
        }

    }


    void print(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    private static void swap(int[] arr,int first,int second){

        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    public static void main(String[] args) {
        MaxHeap heap=new MaxHeap(6);
        heap.add(20);
        //heap.print();
        heap.add(10);
        heap.add(50);
        heap.add(60);
        heap.add(40);
        heap.add(30);
        heap.print();
        heap.delete();
        heap.print();

    }
}
