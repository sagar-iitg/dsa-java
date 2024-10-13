package com.sagar.heap.impl1;

public class MinHeap {


    int[] arr;
    int size;
    int totalSize;

    public MinHeap(int totalSize) {
        this.arr = new int[totalSize];
        this.size = 0;
        this.totalSize = totalSize;
    }

    void add(int val){

        System.out.println();
        if(size==totalSize){
            System.out.println("Heap Overflow");
            return;
        }
        int index=size;
        arr[index]=val;
        size++;

        while (index>0 && arr[index] < arr[(index-1)/2]){
             swap(arr,index,(index-1)/2);
             index=(index-1)/2;
        }

    }

    void delete(){

        System.out.println();
        if(size==0){
            System.out.println("Heap Underflow");
            return;
        }
        int index=0;
        arr[index]=arr[size-1];
        size--;

        while(index<size){

            int left=2*index+1;
            int right=2*index+2;
            int largest=index;

            if(left<size && arr[largest]>arr[left]){
                largest=left;
            }

            if(right<size && arr[largest]>arr[right]){
               largest=right;
            }

            if(largest==index){
                return;
            }else{
                swap(arr,largest,index);
                index=largest;
            }


        }





    }


    private static void swap(int[] arr,int first,int second){

        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    private  void print(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }



    public static void main(String[] args) {

        MinHeap heap=new MinHeap(6);
        heap.add(30);
        heap.add(60);
        heap.add(20);
        heap.add(10);
        heap.add(40);
        heap.add(50);
        heap.print();
        heap.delete();
        heap.print();
        heap.delete();
        heap.print();
        heap.delete();
        heap.print();

    }
}
