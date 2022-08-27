 
package queue;

public class StackImplemetationByLinkedList {
    Node head;
   class Node{
       int data;
      Node next;
      Node(int data){
          this.data=data;
          this.next=null;
      }
        
    }
   void push(int data){
       Node n= new Node(data);
       if(head==null){
           head=n;
          
       }
       else
       {
          n.next= head;
          head= n;
       }
       
       
   }
     int pop(){
         if(head==null)
         {
             System.out.println("Error Stack is empty");
             return -100;
         }
         else{
             int x= head.data;
             head= head.next;
             return x;
         }
         
     }
     boolean Isempty(){
         if(head==null) return true;
         else
             return false;
     }
     int peek(){
         if(head==null)
         {
             System.out.println("empty");
             return -1000;
         }
         else
             return head.data;
     }
     void print(){
         Node temp= head;
         while(temp!=null){
             System.out.println(temp.data);
             temp= temp.next;
         }
     }
     
    
}
