

package doublylinkedlist;

public class DoublyLinkedlist {
    Node head;
    static class Node{
        int data;
        Node next,prev;
        public Node(int data){
            this.data= data;
            this.next=null;
            this.prev=null;
        }
    }

    
    public static void main(String[] args) {
       DoublyLinkedlist dl= new DoublyLinkedlist() ;
        dl.head= new Node(1);
        Node sec= new Node(2);
        Node third= new Node(3);
        dl.head.next=sec;
        sec.prev=dl.head;
        sec.next=third;
        third.prev=sec;
        dl.reverse();
        dl.display();
       
    }
    public void display(){
        Node s= head;
        while(s!=null)
        {
            System.out.print(s.data+" ");
            s= s.next;
        }
    }
     void reverse()
    {
        Node temp = null;
        Node current = head;
 
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
    }
    
  
}
