

package linklist1;

import java.io.*;

// Java program to implement
// a Singly Linked List
public class LinkedList {
  Node head;
  class Node{
      int data ;
      Node next;
      Node( int data){
          this.data=data;
          this.next= null;
          
      }
  }
	void insert(int x){
            Node n= new Node(x);
            if(head==null){
                head= n;
            }
            else {
                Node temp=head;
                while(temp.next!=null)
                {
                   temp= temp.next;
                }
                temp.next=n;
            }
            
        }
        Node  remove(int x){
          if(head==null || head.next==null && x<1) 
          {
              System.out.println("empty hai bhai");
              return null;
          }
          if(x==1) return head= head.next;
          Node temp= head;
          int n=x;
          while(x>1 )
          {
              x--;
              temp= temp.next;
              if(temp== null)
              {  
                  System.out.println(" not posible to delete");
                  return head;
              }
              
          }
          Node flag=head;
          
              while(flag!=null && n>2){
                  flag= flag.next;
                  n--;
              }
              Node curr=flag.next;
              flag.next= curr.next;
              return head;
              
          }
        
        void print(){
            Node n= head;
            
            while(n!=null){
                System.out.print(n.data+" ");
                n= n.next;
            }
        }
       
        
	
}
