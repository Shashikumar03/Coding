/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oops.ThisKeyWord;

/**
 *
 * @author shash
 */
public class ThisKeyword {
    int data;
     void display(int data){
      this. data = data;
     this. print();
   }
    void print(){
       System.out.println(data);
   }
}
   
      class Test5{
        public static void main(String[] args) {
         
          fun();
        }
         static void fun(){
          ThisKeyword tk= new ThisKeyword();
          tk.display(10);
        }
}
    

