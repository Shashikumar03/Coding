
package myqueue;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class MyCircularQueueAsLinkedList {
    Node front,rear;
   
    void enqueue(int x){
        Node n= new Node(x);
        if(front==null && rear==null)
        {
            rear=front=n;
            rear.next=front;
        }
        else 
            rear.next=n;
            rear=n;
            rear.next=front;
    }
    void dequeue(){
        if(front==null && rear==null)
          return;
        else if(rear== front){
            rear=null;
            front=null;
        }
        else
        {
            front=front.next;
          rear.next=front;
        }
    }
    void display(){
         
        if(front==null && rear==null)return;
        Node temp= front;
        while(temp.next!=front)
        {
            System.out.println(temp.data);
            temp= temp.next;
          
        }
    }
    public static void main(String[] args) {
        MyCircularQueueAsLinkedList mq= new MyCircularQueueAsLinkedList();
     mq.enqueue(3);
     mq.enqueue(1);
     mq.enqueue(5);
        mq.display();
    }
        
    
}
