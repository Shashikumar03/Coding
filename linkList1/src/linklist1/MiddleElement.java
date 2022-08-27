/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linklist1;

import javax.management.MBeanPermission;

/**
 *
 * @author shash
 */
public class MiddleElement {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        MiddleElement me=new MiddleElement();
        me.head=new Node(1);
     
        
        Node sec= new Node(2);
        me.head.next=sec;
       
        
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
        
         
        me.length();
        me.display(me.head);
    }
    void length(){
        int i=0;
        Node temp=head, curr=head;
        while(curr.next!=null)
        {
            if( i==0)
            {
                curr= curr.next;
                i=1;
            }
            else if(i==1){
            curr=curr.next;
            temp= temp.next;
            i=0;
            }
        }
        System.out.println(temp.data+" is the middle element");
    }
   static void display(Node head){
        if(head== null)
            return;
        else
        {
            display(head.next);
            System.out.print(head.data+" ");
        }
        
    }
    
}
