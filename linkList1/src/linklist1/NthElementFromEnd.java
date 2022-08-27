/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linklist1;

public class NthElementFromEnd {
   Node head;
    
     static class  Node{
         int data;
        Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
    }
 
    public static void main(String[] args) {
         NthElementFromEnd s=new NthElementFromEnd();
        s.head=new Node(1);
     
        
        Node sec= new Node(2);
        s.head.next=sec;
       
        
         Node third= new Node(3);
        sec.next=third;
       
        
         Node fourth= new Node(4);
        third.next=fourth;
        
        
         Node fifth= new Node(5);
        fourth.next=fifth;
      
        
         Node sixth= new Node(6);
        fifth.next=sixth;
        sixth.next=null;
       
       
       // s.display();
        //s.nthElement(s.head,2);
      boolean b=  s.checkLoop(s.head);
        System.out.println(b);
       
    }
     public void display(){
         Node n=head;
         while(n!=null)
         {
             System.out.print(n.data+" ");
             n= n.next;
             
         }
         System.out.println();
     }
       public void nthElement(Node head , int n){
       Node  temp= head;
       Node curr=head;
       while(n>0)
       {
           temp=temp.next;
           n--;
       }
       while(temp!=null)
       {
           temp= temp.next;
           curr= curr.next;
       }
           System.out.println(curr.data);
      }
       public boolean checkLoop(Node head){
           Node fast,slow;
           fast=slow=head;
           slow= slow.next;
           fast=fast.next.next;
           while(fast!=slow)
           {
               if(slow.next == null || fast == null || fast.next == null || fast.next.next == null)
				return false;
               fast=fast.next.next;
               slow= slow.next;
              
           }
           System.out.println("loop exist");
           Node temp=head;
           while(temp!=slow)
           {
              temp= temp.next;
               slow= slow.next;
           }
           System.out.println(slow.data+" "+ " from here loop is starting");
           return true;
       }
}
