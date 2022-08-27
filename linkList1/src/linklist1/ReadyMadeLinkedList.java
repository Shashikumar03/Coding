/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linklist1;

/**
 *
 * @author shash
 */
public class ReadyMadeLinkedList {
  static  Node  head= null;
    public static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    
    
     
    
    public static void main(String[] args) {
        
         head= new Node(5);
        Node dusra= new Node(10);
        Node tisra = new Node(20);
        Node chautha= new Node(25);
        head.next=dusra;
        dusra.next=tisra;
        tisra.next=chautha;
      
       
 //Node reverseOrder= reverseTheLinkedlist(head);
     //   print(reverseOrder);
      System.out.println();
     // reverseprint(reverseOrder);
      print(head);
        sortedInsert(head, 15);
        print(head);
    }
    static void print(Node ll){
        Node temp=ll;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
       
    }
    static  void reverseprint(Node ll){
        if(ll==null)
            return;
        reverseprint(ll.next);
        System.out.print(ll.data+" ");
        
        
    }
    static Node reverseTheLinkedlist(Node head){
        if(head.next==null) return head;
      Node start  = reverseTheLinkedlist(head.next);
        head.next.next=head;
        head.next=null;
        return start;
        
    }
   static  Node sortedInsert(Node head, int key) {
       Node curr=head;
       
       Node n= new Node(key);
       if(head==null) return n;
       if(head.data>key)
       {
           n.next=head;
           head=n;
           return n;
       }
       Node temp=head;
       
       while(curr!=null && curr.data<key)
       {
          temp=curr;
           curr= curr.next;
          
       }
        n.next=curr;
        temp.next=n;
      
       return head;
    }
    
}
