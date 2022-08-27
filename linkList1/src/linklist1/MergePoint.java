

package linklist1;

import java.util.HashSet;

public class MergePoint {
    Node head1, head2;
    static class Node{
        int data;
        Node next;
        public Node( int data){
            this.data=data;
            this.next=null;
        }
    }
        public static void main(String[] args) {
             MergePoint mp= new MergePoint();
              mp.head1= new Node(1);
              Node sec=new Node(2);
              mp.head1.next=sec;
              Node third= new Node(3);
              sec.next=third;
              Node fourth= new Node(4);
              third.next=fourth;
              Node fifth= new Node(5);
              fourth.next=fifth;
              mp.head2= new Node(7);
              Node dusra= new Node(8);
              mp.head2.next= dusra;
              dusra.next=third;
              mp.display();
              mp.display1();
              mp.searchMerge();
             
        }
    public void display(){
        Node curr= head1;
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr= curr.next;
        }
        System.out.println();
        
    }
     public void display1(){
        Node curr2= head2;
        while(curr2!=null)
        {
            System.out.print(curr2.data+" ");
            curr2= curr2.next;
        }
        System.out.println();
        
    }
    void searchMerge(){
        HashSet<Node> hs= new HashSet<>();
        Node curr1= head1;
        Node temp=head2;
        while(temp!=null){
         hs.add(temp);
         temp= temp.next;
    }
        
      while(curr1!=null)
      {
          if(hs.contains(curr1))
            {
                System.out.println(curr1.data+" "+"is the merging point");
                break;
            }
           curr1= curr1.next;
            
        }
    }
        
    
}
