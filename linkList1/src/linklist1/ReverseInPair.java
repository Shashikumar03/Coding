

package linklist1;


public class ReverseInPair {
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
        ReverseInPair me=new ReverseInPair();
        me.head=new Node(1);
     
       
        Node sec= new Node(2);
        me.head.next=sec;
       
        
         Node third= new Node(3);
        sec.next=third;
       
        
         Node fourth= new Node(4);
        third.next=fourth;
        
        
         Node fifth= new Node(5);
        fourth.next=fifth;
      
          Node sixth= new Node(6);
        fifth.next=sixth;
        sixth.next=null;
        Node sevth= new Node(7);
        sixth.next=sevth;
        Node eight= new Node(8);
        sevth.next=eight;
        eight.next=null;
        // me.reverse(me.head);
    Node s=    me.rev(me.head);
        me.display(s);
    }
//    Node reverse(Node head){
//      Node curr =head;
//        if( head==null ||head.next==null)
//        {
//            return null;
//        }
//        else
//        {
//        curr=head.next;
//        head.next=curr.next;
//        curr.next=head;
//        head= curr;
//       
//        
//        }
//        return head; 
//    }
      public void display(Node s){
         Node n=s;
         while(n!=null)
         {
             System.out.print(n.data+" ");
             n= n.next;
             
         }
         System.out.println();
      }
      public Node rev(Node head){
          if(head.next==null) return head;
          else
          {
              Node n= rev(head.next);
              head.next.next=head;
              head.next= null;
              return n;
          }
      }
    
}
