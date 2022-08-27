
package myqueue;
 class QueueNode{
    int data;
    QueueNode next;
    public QueueNode(int data){
        this.data= data;
        this.next=null;
    }
}
public class MyQueueAsLinkedList {
    
 QueueNode head,rear;
       
    void enqueue(int x){
        QueueNode qd= new QueueNode(x);
       if(head==null)
           head=rear=qd;
       else{
           rear.next=qd;
           rear=qd;
       }
     
 }
     int dequeue(){
        if(head==null)
            return 0;
        else{
           QueueNode  temp= head;
            head=head.next;
            if(head==null)
                rear=null;
            return temp.data;
        }
            
    }
     void display(){
         QueueNode qd1=head;
         while(qd1!=null)
         {
             System.out.print(qd1.data+" ");
              qd1= qd1.next;
         }
         System.out.println();
     }
 
    public static void main(String[] args) {
       MyQueueAsLinkedList mq=new MyQueueAsLinkedList();
       mq.enqueue(1);
       mq.enqueue(2);
       mq.enqueue(3);

      mq.display();
      System.out.println(mq.dequeue());
      System.out.println(mq.dequeue());
      mq.display();
    }
    
}
