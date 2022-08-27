/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package queue;


public class Stack1{

    int max=3;
    int[] arr=new int[max];
    int top;
    Stack1(){
        top= -1;
    }
    void push(int x){
        
         if(top>=max-1){
            System.out.println("Stack over flow");
            return;
        
        }
        else{
           
            arr[++top]=x;
        }
        
    }
    int pop(){
        if(top==-1)
        {
            System.out.println("stack underflow");
            
        }
            int a=arr[top];
            top--;
                     return a;
    }
    boolean isEmpty(){
        if(top<0) return true;
        else return false;
    }
    void print(){
        if(top==-1)
            System.out.println("stack is empty");
        else{
        while(top!=-1){
            System.out.print(arr[top]+" ");
            top--;
        } 
        }
        
    }
    
   
}
