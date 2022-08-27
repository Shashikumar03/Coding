
package singlelinkedlist;

  class Node1{
    int data;
    Node next;
    public Node1(int data){
     this.data=data;
     this.next=null;
        
    }
    
}
public class LinkedListUsingArray {
    static Node root;
    
   // add to starting of the inkedlist 
    static Node insert(Node root,int item){
         Node temp= new Node(item);
         temp.next=root;
         root=temp;
         return root;
     }
  static Node arrToList(int [] a,int n){
      root= null;
      for(int i=n-1;i>=0;i--)
      root= insert(root, a[i]);
        return root;
    }
    public static void main(String[] args) {
        int [] a={1,2,3,4,5};
        int n=a.length;
       Node head=   arrToList(a,n);
       display(head);
        
    }
   static  void display( Node head){
        while(head!=null)
        {
            System.out.print(head.data+" ");
             head =head.next;
        }
    }
    
}
