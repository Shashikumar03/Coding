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
public class Student 
{
   private String name;
   private int age;
   
   
  //getter Method////
    public int getAge()
    {
        return this.age;
        
    }
    //setterMethod//
     public void setAge(int age)
     {
         if(age<10)
         {
             System.out.println("Not Eligible");
             return;
         }
          this.age=age;
     }
     
     //=====getter Method====//
     public String getName(){
         return this.name;
     }
     
     //=====setterMethod======///
     public void setName(String name)
     {
         char ch=name.charAt(0);
          if(Character.isUpperCase(ch))
          {
              this.name= name;
          }
          else
           {
              System.out.println("name should be start With capital Letter");
           }
         
     }
    
}
