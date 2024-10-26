package com.sagar.apnacollege.linkedlist;

public class LinkedList{

    public static Node head;
    public static Node tail;
    public static int size;

    public static class Node{

        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;

        }
    }
    
    public void addFirst(int data)
    {
         //step 1 create new node
        Node newNode=new Node(data);
       size++;
        if(head==null)
        {
          
            head=tail=newNode;
            return;
        }

       
        
        newNode.next=head; //link
        head=newNode;

        

    }
 
    public void addLast(int data)
    {
         //step 1 create new node
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
          
          
            head=tail=newNode; //link
            return;
        }

       
        
            tail.next=newNode; //link
            tail=newNode;

        

    }

    //indexing starts with zero

    public void add(int data,int idx)
    {
        if(idx==0)
        {
            addFirst(data);
            return;
        }

        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<(idx-1))
        {
            temp=temp.next;
            i++;
        }
        //i=idx-1; temp->prev

        newNode.next=temp.next;
        temp.next=newNode;

    }
    
    public int removeFirst(){
        
        if(size==0)
        {
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){

            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;


    }

     
    public int removeLast(){
        
        if(size==0)
        {
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        }

        else if(size==1){

            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }

        Node temp=head;
        while(temp.next!=tail)
        {

            temp=temp.next;
        }


        int val=temp.next.data;//tail.data
        
        temp.next=null;
        tail=temp;
        size--;
        return val;


    }

    public int itrSearch(int key){
        Node temp=head;
        int idx=0;
        while(temp!=null)
        {

            if(temp.data==key)
            {
                return idx;

            }
            temp=temp.next;
            idx++;

        }
        //key not found
        return -1;

    }


    public int recSearchHelper(Node head,int key)
    {

        if(head==null)
        {
            return -1;
        }
        //base case
        if(head.data==key)
        {
            return 0;
        }
        int idx=recSearchHelper(head.next, key);

        if(idx==-1)
        {
            return -1;

        }
        return idx+1;



    }

    public int recSearch(int key){
        return recSearchHelper(head, key);
    }
   
    public void print()
    {


        // if(head==null)
        // {
        //     System.out.println("linked list is empty");
        //     return;
        // }
        Node temp=null;
        temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void deleteNthFromEnd(int n)
    {
        int sz=0;
        Node temp=head;
        while(temp!=null)
        {
            sz++;
            temp=temp.next;
        }

        if(n==sz)
        {
            head=head.next;
            return;
        }
        //sz-n
        int i=1;
        int indexTOFind=sz-n;
        Node prev=head;
        while(i<indexTOFind)
        {
            prev=prev.next;
            i++;

        }
        prev.next=prev.next.next;
        return;



    }

    public void reverse()
    {
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;

       // return prev;


    }

    public Node findMid(Node head)
    {

        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next!=null)
        {
             slow=slow.next;
             fast=fast.next.next;

        }

        //slow is my mid point

        return slow;

    }

    public boolean checkPalindrome()
    {


        if(head==null || head.next==null)
        {
            return true;

        }
        //step 1 find mid

        Node midNode=findMid(head);

        // step reverse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
         //check left and right half
        Node right=prev; //head of right half
        Node left=head; //head of left half

        while(right!=null)
        {
            if(left.data!=right.data)
            {
                return false;
            }
            left=left.next;
            right=right.next;
            
        }
        return true;


       
    }

    public static void main(String[] args) {
        
        LinkedList ll=new LinkedList();
     
        // ll.head=new Node(1);
        // ll.head.next=new Node(2);
       
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        System.out.println( ll.findMid(head).data);
       
        // System.out.println();
        // ll.add(9, 0);
        // ll.print();
        // System.out.println("\n"+LinkedList.size);
        // ll.removeFirst();

        // ll.print();
        // ll.removeLast();

        // ll.print();
        // ll.removeLast();

        // ll.print();
        // ll.removeLast();

        // ll.print();
        // ll.removeLast();

        // ll.print();
        //  ll.removeLast();

        // ll.print();
    
       



    }


}