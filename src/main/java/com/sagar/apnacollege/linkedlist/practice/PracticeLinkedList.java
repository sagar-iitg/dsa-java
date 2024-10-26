package com.sagar.apnacollege.linkedlist.practice;

public class PracticeLinkedList {

    private Node head;

    class Node{

        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
        }
        public Node(int data,Node next)
        {
            this.data=data;
            this.next=next;

        }

    }

    public void addFirst(int val)
    {
        Node newNode=new Node(val);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    
    public void addLast(int val)
    {
        Node newNode=new Node(val);
        
        if(head==null)
        {
            head=newNode;
            return;
        }

        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        //newNode.next=null;


    }

    public void deleteFirst(){
        if(head==null)
            {
                System.out.println("No element in linked list");
                return;
            }
        head=head.next;
    }

    public void print()
    {

        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {


        PracticeLinkedList ll=new PracticeLinkedList();
        //System.out.println(ll.head);
        // //System.out.println(ll.head.data);
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        //ll.addLast(10);
       // ll.print();
        ll.deleteFirst();
        ll.print();

        
        
    }
    
}
