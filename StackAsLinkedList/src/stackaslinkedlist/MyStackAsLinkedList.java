
package stackaslinkedlist;
class StackNode1
{
    int data;
    StackNode next;
    public StackNode1(int data){
        this.data = data;
        this.next=null;
    }
}

public class MyStackAsLinkedList
{ 
    StackNode Top;// stack me head ke jagah top hota hai;
    public int push(int data){
        StackNode sn=new StackNode(data);
        if(Top==null)
        {
          Top=sn; 
        }
        else
        {
            sn.next=Top;
            Top=sn;
        }
       return data;
    }
    public void pop(){
        if(Top== null)
        {  
            System.out.println("stack is empty");
        return;
        }
        else
        {
            int temp= Top.data;
            Top= Top.next;
        
        System.out.println(" remove item is "+" "+ temp);
        }
    }
    public static void main(String[] args) {
        MyStackAsLinkedList ms=new MyStackAsLinkedList();
        System.out.println( ms.push(5));
        ms.pop();
    }
    
}
