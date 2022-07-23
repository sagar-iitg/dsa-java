package com.sagar.linked.list.scratch;




public class SinglyLinkedList {

    Node head;
    static class Node{

        int val;
        Node next;
        Node(int data){
            this.val=data;
            next=null;

        }


    }

    public static void main(String[] args) {


       // System.out.println(head);
        SinglyLinkedList llist=new SinglyLinkedList();
        llist.head=new Node(1);
        System.out.println(head);

    }
}
