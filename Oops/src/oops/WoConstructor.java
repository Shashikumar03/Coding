/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

import java.awt.BorderLayout;

/**
 *
 * @author shash
 */
public class WoConstructor 
{
    static String name;
    static int roll;
    public static void main(String[] args) {
        WoConstructor w= new WoConstructor();
        w.display(); 
        WoConstructor w1= new WoConstructor("rishabh", 1000);
      w1.show();
         System.out.println(w1.name+" "+roll);
    }
     void display(){
         WoConstructor t= new WoConstructor();
         WoConstructor v= new WoConstructor();
        t.name="shashi";
        t.roll=100;
        v.name="rahul";
        v.roll=101;
        
        System.out.println(t.name+" "+ t.roll);
         System.out.println(v.name+" "+v.roll);
        
        
    }
   
    void show(){
        System.out.println(name+" "+roll);
    }
   public WoConstructor(String name,int roll){
       this.name= name;
       this.roll= roll;
       
   }
   public WoConstructor(){
       
   }
    
}
