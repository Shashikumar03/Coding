
package stackaslinkedlist;

    class StackNode {
        int data;
        StackNode next;
 
        StackNode(int data)
        {
            this.data = data; 
            this.next=null;
        }
    }
public class StackAsLinkedList<E> {

     StackNode stackhead;
 
    
 
    public boolean isEmpty()
    {
        if (stackhead == null) {
            return true;
        }
        else
            return false;
    }
 
    public void push(int data)
    {
        StackNode newNode = new StackNode(data);
 
        if (stackhead == null) {
            stackhead = newNode;
        }
        else {
           
           newNode.next= stackhead;
           stackhead=newNode;
        }
        System.out.println(data + " pushed to stack");
    }
 
    public int pop()
    {
        int popped = Integer.MIN_VALUE;
        if (stackhead== null) {
            System.out.println("Stack is Empty");
            return 0;
        }
        else {
            popped = stackhead.data;
            stackhead = stackhead.next;
        }
        return popped;
    }
 
    public int peek()
    {
        if (stackhead == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        else {
            return stackhead.data;
        }
    }
 
    // Driver code
    public static void main(String[] args)
    {
 
        StackAsLinkedList<Integer> sll = new StackAsLinkedList<>();
 
       sll.push(1);
       sll.push(2);
       sll.push(3);
      
        
       
        System.out.println(sll.pop()
                           + " popped from stack");
 
        System.out.println("Top element is " + sll.peek());
    }
}
    

