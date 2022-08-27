/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

/**
 *
 * @author shash
 */
public class Project {
  Shashi next1;
  Shashi next2; 
   Shashi next3;
  class Shashi{
      Shashi next;
     int data;
     Shashi(int data){
         this.data=data;
         
     }
  }
     void add( Project p,int x){
         Shashi s= new Shashi(x);
         if(next1==null)
         {
             
             next1=s;
         }
        else if(next2==null){
             next2=s;
         }
        else if(next3== null)
            next3=s;
         
     }
     int delete(){
         if(next3!=null) 
         {
             int x= next3.data;
             return x;
         }
         else if(next2!=null)
         {
             int x= next2.data;
             return x;
         }
         else{
             return next1.data;
         }
         
     }
  
    public static void main(String[] args) {
        Project p= new Project();
       p.add(p,1);
       p.add(p,3);
       p.add(p,1);
       int x= p.delete();
       
       
    }
    
}
