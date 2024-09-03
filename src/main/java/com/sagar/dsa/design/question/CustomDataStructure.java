package com.sagar.dsa.design.question;

public class CustomDataStructure {

    private int[] data;
    private int head;
    private int tail;
    private int capacity;

    public CustomDataStructure(int capacity) {
        this.capacity = capacity;
        data=new int[capacity];
        head=0;
        tail=0;
    }
    public void push(int value){
        if(tail==capacity) return;
        data[tail]=value;
        tail++;
    }
    public int pop(){
        if(head==tail) throw new IllegalStateException("No elements in Data Structure");
        int val=data[head];
        head++;
        return  val;
    }
    public  int seek(int i) {
        if (head + i >= tail || head + i < head) {
            throw new IndexOutOfBoundsException("Error: Invalid index.");
        }
        return data[head + i];
    }

    public static void main(String[] args) {
        CustomDataStructure c=new CustomDataStructure(10);
        c.push(9);
        c.push(7);
        c.push(10);
        System.out.println(c.seek(1));
        int ans=c.pop();

        System.out.println(ans);
    }
}


