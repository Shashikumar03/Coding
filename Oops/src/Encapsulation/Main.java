/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Encapsulation;

/**
 *
 * @author shash
 */
public class Main 
{
   
    
    public static void main(String[] args) 
    {
        Student st1= new Student();
          st1.setAge(8);
          st1.setName("Shashi");
        Student st2= new Student();
           st2.setAge(23);
           st2.setName("Parth");
          
           System.out.println(st1.getAge());
           System.out.println(st2.getName());
        
        
    }
    
 
}
