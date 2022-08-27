/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oops.StaticKeyword;

/**
 *
 * @author shash
 */
public class First {
    String name;
   String address= "haraiya";
    int age;
    public First( String name, int age){
        this.name= name;
        this.age=age;
    }
    public static void main(String[] args) {
        First t1= new First("shashi", 21);
        First t2= new First("amit", 22);
        First t3= new First("sunil", 25);
         
       t1.display();
       t2.display();
       t3.display();
    }
     void  display(){
        System.out.println(name+" "+ address+" "+age);
    }
    
}
