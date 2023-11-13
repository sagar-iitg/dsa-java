package linkedlist;

public class ClientLinkedList {

    public static void main(String[] args) {
          
        LinkedList ll=new LinkedList();
     
        // ll.head=new Node(1);
        // ll.head.next=new Node(2);
       
      
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);
          ll.addFirst(1);
          ll.addLast(2);
          ll.addLast(3);

        ll.print();
        System.out.println(ll.recSearch(-1));
        //System.out.println(ll.checkPalindrome());
      
        //ll.print();
        
        // ll.reverse();
        // ll.print();
      //  ll.deleteNthFromEnd(2);
        //ll.print();

        //System.out.println(ll.recSearch(4));

        //ll.print();
        // System.out.println(ll.removeLast());
        // System.out.println(ll.removeLast());
        // System.out.println(ll.removeLast());
        // System.out.println(ll.removeLast());
        // System.out.println(ll.removeLast());

    }
    
}
