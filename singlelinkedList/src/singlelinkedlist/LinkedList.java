

package singlelinkedlist;
 
    
public class LinkedList {

    
     Node head; // head of list 
  
    /* Linked list Node.  This inner class is made static so that 
       main() can access it */
    
  
    /* This function prints contents of linked list starting from head */
    public void printList() 
    { 
        Node n = head; 
        while (n != null) { 
            System.out.print(n.data + " "); 
            n = n.next; 
        } 
        System.out.println();
    } 
     public void printList1( Node n1) 
    { 
        Node n = n1; 
        while (n != null) { 
            System.out.print(n.data + " "); 
            n = n.next; 
        } 
        System.out.println();
    } 
  
    /* method to create a simple linked list with 3 nodes*/
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList llist = new LinkedList(); 
  
       Node third = new Node(3); 
         llist.head = new Node(1); 
        Node second = new Node(2); 
        Node fourth= new Node(4);
  
       llist.head.next = second; // Link first node with the second node 
        second.next = third; // Link second node with the third node 
        third.next=fourth;
        llist.printList(); 
       llist.addToStart(5);
       llist.addToStart(3);
       llist.printList();
       Node n=  llist.reverse(llist.head);
       llist.printList1(n);
        System.out.println(llist);
    } 
    
       void addToStart( int data){
        Node n= new Node(data);
        if(head== null)
        { 
           
            head=n;
        }
        else
            n.next= head;
        head=n;
    }
      Node reverse(Node head){
           if(head.next==null || head==null)
           {
               return head;
           }
           Node s=reverse(head.next);
           head.next.next= head;
           head.next= null;
           return s;
       }
}
    

