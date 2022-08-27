/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

/**
 *
 * @author shash
 */
public abstract class Abstraction {
    
  abstract    void check();
         
      
    public static void main(String[] args) {
     
       
       Animal an= new Animal();
       an.check();
       
    }
}
    class Animal extends Abstraction {
     void check(){
         System.out.println(" kumar");
     }
}
