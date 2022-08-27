/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oops.Interface11;

/**
 *
 * @author shash
 */
public class Test implements I1,I2// i1 and i2 ke sare method aya likhna apdega;
{
    @Override
    public  void run()// public lgna pdega
      {
         System.out.println("running");
       }
  @Override
   public  void eating()// public lgna padega
    {
        System.out.println("eating");
    }
    public static void main(String[] args) {
        Test t= new Test();
        t.run();
        t.eating();
        
        
        
    }
    
}
interface I1{
    void  run();// abstract keyword compiler apne aap likh dega;
}
interface I2{
     void eating();// abstract keyword compiler apne aap likh dega;
   
} 
