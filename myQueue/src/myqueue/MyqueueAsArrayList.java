

package myqueue;
class Arrayqueue{
    static final int max=1000;
    int[] a= new int[max];
    int front,rear;
      Arrayqueue(){
        front =-1;
        rear=-1;
    }
      void enqueue(int x){
          if(rear==-1 && front==-1)
          {
              front++;
              rear++;
             a[rear]=a[front]=x;
           
          }
          else if(rear>=max){
              System.out.println("queque over flow");
              return;
          }
          else
           rear++;
          a[rear]=x;
         
          
      }
     void display(){
         for(int i=front;i<=rear;i++){
             System.out.println(a[i]);
         }
          
      }
      void dequeue(){
         if(front==-1 && rear==-1)
         {
             System.out.println("queue is empty");
             return;
         }
         else if(front==rear)
         {
             System.out.println("dequeue element is"+a[front]);
             front =-1;
             rear=-1;
             return;
         }
         else{
             System.out.println("dequeue element is "+a[front]);
             front++;
         }
     }
}


public class MyqueueAsArrayList {
    public static void main(String[] args) {
     Arrayqueue  mq= new Arrayqueue();
     
        mq.enqueue(3);
       // mq.enqueue(6);
       
        mq.display();
         mq.dequeue();
    }
    
}
