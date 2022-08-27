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
public class PartitionWithX {
    Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        PartitionWithX px= new PartitionWithX();
         px.head=new Node(2);
     
        
        Node sec= new Node(5);
        px.head.next=sec;
       
        
         Node third= new Node(0);
        sec.next=third;
       
        
         Node fourth= new Node(0);
        third.next=fourth;
        
        
         Node fifth= new Node(6);
        fourth.next=fifth;
      
        
         Node sixth= new Node(1);
        fifth.next=sixth;
        
        
        sixth.next=null;
       
       
        //System.out.println();
       // px.partition(px.head, 4);
        // px.display2();
     Node n=  px.partition1(px.head,4);
      px.display(n);
        
      // px.partition(px.head, 5);
        
    }
    public void partition(Node head,int k){
        if(head==null|| head.next==null) return;
       
        Node curr=head,pivot=head;
        while(pivot!=null)
        {
         if(pivot.data==k)
         {
             break;
         }
         pivot= pivot.next;
        }
        Node flag=null;
        while(curr!=pivot)
        {
            if(curr.data<pivot.data)
            {
                flag=curr;
                curr= curr.next;
            }
            else
            {
                flag.next= curr.next;
            curr.next=pivot.next;
            pivot.next=curr;
            curr= flag.next;
            }
        }
        curr= curr.next;
        Node s= curr;
        while(curr!=null)
        {
            if(curr.data<pivot.data)
            {
               s.next=curr.next;
               curr.next=flag.next;
               flag.next=curr;
               flag=curr;
               curr= s.next;
            }
            else
            {
                s=curr;
            
            curr= curr.next;
            }
        }
        
    }
     public void display(Node f){
         Node n=f;
         while(n!=null)
         {
             System.out.print(n.data+" ");
             n= n.next;
             
         }
         System.out.println();
     } 
     public void display2(){
         Node n=head;
         while(n!=null)
         {
             System.out.print(n.data+" ");
             n= n.next;
             
         }
         System.out.println();
     }
     public Node link(int k){
         Node s= new Node(0);
         while(k>0)
         {
             s.next=new Node(k);
             k--;
         }
         return s.next;
     }
     public Node partition1( Node head,int k){
         Node less_head= new Node(0);
         Node great_head=new Node(0);
         Node less= less_head;
         Node great = great_head;
         while(head!=null){
             if(head.data<=0)
             {
                 less.next=head;
                 less= less.next;
             }
             else
             {
                 great.next= head;
                 great= great.next;
             
             }
                head=head.next;
         }
         great.next= null;
         great_head= great_head.next;
         less_head= less_head.next;
         less.next=great_head;
         return less_head;
         
     }
    
}
