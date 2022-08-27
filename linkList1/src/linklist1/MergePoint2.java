

package linklist1;


public class MergePoint2 {
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
             MergePoint2 mp= new MergePoint2();
              mp.head1= new Node(1);
              Node sec=new Node(2);
              mp.head1.next=sec;
              Node third= new Node(3);
              sec.next=third;
              Node fourth= new Node(4);
              third.next=fourth;
              Node fifth= new Node(5);
              fourth.next=fifth;
              fifth.next=null;
              mp.head2= new Node(7);
              Node dusra= new Node(8);
              
              mp.head2.next= dusra;
              Node tisra= new Node(10);
              dusra.next=tisra;
              tisra.next=fourth;
              mp.length();
        }
        void length(){
            Node curr= head1;  
            Node temp= head2;
            int count1=0;
           int  count = 0;
            while(curr!=null || temp!=null){
                if(curr!=null){
                count++;
                curr=curr.next;
                }
                if(temp!=null)
                {
                    count1++;
                    temp= temp.next;
                }
            }
            System.out.println(count1+" "+ count);
            Node nd=head1;
            Node n= head2;
            if(count1>count)
            { 
                int c= count1-count;
                while(c>0)
                {
                    n= n.next;
                    c--;
                }
            }
            else
            {
                int d= count-count1;
                
                while(d>0)
                {
                    nd= nd.next;
                    d--;
                }
            }
            while(n!=nd && n!=null &&nd!=null)
            {
                n= n.next;
                nd= nd. next;
            }
            if(n==null&& nd==null)
            {
          System.out.println(" "+" not merge point");
          return;
            }
            else if (n==nd)
                System.out.println("yes");
            
        }
}
