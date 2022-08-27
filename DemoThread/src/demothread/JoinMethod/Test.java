/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demothread.JoinMethod;

public class Test extends Thread {
  
    static  Thread mainthread;// instance variable;
   
    public void run(){
         try{
            mainthread.join();// t thread wait karega main thread ke khatam hone ka
        }
        catch(Exception e){
            
        }
        try{
        for (int i = 0; i < 6; i++) {
            System.out.println("child thread"+" "+i);
            Thread.sleep(100);
            
        }
    }
    
    catch(Exception e){
    
}
    }
    public static void main(String[] args) {
        Test t= new Test();
        t.start();
         mainthread=Thread.currentThread();
       
        try{
        for (int i = 0; i < 6; i++) {
            System.out.println("main Thread"+" "+i);
            Thread.sleep(100);
            
        }
    }
    
    catch(Exception e){
    
}
    }
    
    
}
