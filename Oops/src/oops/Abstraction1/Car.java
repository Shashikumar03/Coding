/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oops.Abstraction1;

/**
 *
 * @author shash
 */
public abstract class Car {
    
    abstract void run(); // abstract method;
     void   test()// concrete method;
     {
        System.out.println("shashi");
    }
    public static void main(String[] args) {
        Car n= new Wagnor();
        Car n1= new Audi();
        
        n.run();
       // n.test();
    }
}

    
    

