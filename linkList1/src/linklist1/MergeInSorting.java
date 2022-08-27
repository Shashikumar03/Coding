

package linklist1;

public class MergeInSorting {
    Node head1,head2;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        MergeInSorting ms= new MergeInSorting();
        ms.head1=new Node(1);
        Node sec=new Node(2);
         Node third=new Node(4);
          Node fourth=new Node(7);
           Node fifth=new Node(9);
           ms.head1.next= sec;
           sec.next=third;
           third.next=fourth;
           fourth.next=fifth;
           fifth.next= null;
         ms.head2= new Node(3);
         Node dusra =new Node(5);
         Node tisra = new Node(6);
         Node chautha= new Node(8);
         ms.head2.next=dusra;
         dusra.next=tisra;
         tisra.next=chautha;
         chautha.next=null;
         Node curr= ms.merge(ms.head1, ms.head2);
        ms.display(curr);
         
         
        
    }
    Node merge(Node head1, Node head2){
        Node n= new Node(0);
        if(head1== null) return head2;
        if(head2==null) return head1;
        if(head1.data<head2.data)
        {
            n= head1;
            n.next=merge(head1.next, head2);
        }
        else
        {
            n= head2;
        n.next=merge(head1,head2.next);
        }
       return n;
    }
     void display(Node curr){
        if(curr== null)
            return;
        else
        {
             System.out.print(curr.data+" ");
            display(curr.next);
           
        }
     }
    
}
