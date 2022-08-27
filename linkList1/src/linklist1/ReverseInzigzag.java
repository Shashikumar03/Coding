/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linklist1;

import java.util.Stack;


public class ReverseInzigzag {
    Node head;
    static class Node{
    int data ;
    Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
        
    }
    }  public static void main(String[] args) {
            ReverseInzigzag rz=new ReverseInzigzag();
             rz.head=new Node(1);
     
        
        Node sec= new Node(2);
        rz.head.next=sec;
       
        
         Node third= new Node(3);
        sec.next=third;
       
        
         Node fourth= new Node(4);
        third.next=fourth;
        
        
         Node fifth= new Node(5);
        fourth.next=fifth;
        fifth.next=null;
      
          Node sixth= new Node(6);
        fifth.next=sixth;
        sixth.next=null;
        Node sevth= new Node(7);
        sixth.next=sevth;
        Node eight= new Node(8);
        sevth.next=eight;
        eight.next=null;
     // rz.zig(rz.head);
        Node s= rz.rotateRight(rz.head, 5);
       rz.display(s);
       
        
        }
        public Node zig( Node head){
            if(head==null) return null;
            Node slow= head;
            Node fast=head.next;
            while(fast!=null  && fast.next!=null )
            {
                fast =fast.next.next;
                slow = slow.next;
            }
            Node head2= slow.next;
            slow.next=null;
           Stack<Node> s= new Stack<>();
           while(head2!=null)
           {
               Node temp=head2;
               head2=head2.next;
               temp.next=null;
               s.push(temp);
           }
           Node curr= head;
           while(!s.isEmpty())
           {
               Node temp= s.pop();
               temp.next= curr.next;
               curr.next=temp;
               curr= temp.next;
               
           }
           return head;
        }
          public void display(Node s){
         Node n=s;
         while(n!=null)
         {
             System.out.print(n.data+" ");
             n= n.next;
             
         }
         System.out.println();
     }
          public  Node rotateRight( Node head, int k){
              Node slow,fast;
              slow=fast= head;
              while(k>0)
              {
                  fast = fast.next;
                  k--;
              }
              while(fast.next!=null)
              {
                 fast= fast.next;
                 slow = slow.next;
              }
              Node curr=slow.next;
              slow.next= null;
              fast.next= head;
              
              head= curr;
              return head;
          }
         
}

