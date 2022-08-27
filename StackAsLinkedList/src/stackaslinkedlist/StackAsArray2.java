/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stackaslinkedlist;




public class StackAsArray2 {
    static final int max=1000;
    int [] a= new int[max];
    int top;
    StackAsArray2(){
        top =-1;
    }
    void push(int n){
        if(top>=max-1)
        {
            System.out.println(" stack overflow");
           return;
        }
        else{
            top++;
            a[top]=n;
            
        }
        
    }
    int pop(){
       
        if(top<0)
        {
            System.out.println("stack underflow");
            return 0;
        }
        else
        {
           
           int  x=a[top];
           top--;
          
            return x;
        }
      
    }
      void display(){
        while(top!=-1)
        {
            System.out.print(a[top]+" ");
            top--;
        }
    }
    
   static  class Stack{
        public static void main(String[] args) {
           StackAsArray2 s= new StackAsArray2();
            s.push(1);
            s.push(3);
            s.push(33);
            s.push(1999);
           System.out.println(" all pushed element is");
            s.display();
          int x=  s.pop();
            System.out.println( x);
            s.display();
            
        }
    }
    
}
