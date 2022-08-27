/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demothread.DaemonThread;

/**
 *
 * @author shash
 */
public class Test1  extends Thread{
    
    public void run(){
      if(Thread.currentThread().isDaemon()){
           System.out.println("deamon");
      }
      else
            System.out.println("not deamon");
       
    }
    public static void main(String[] args) {
            System.out.println("main thread is working");
        Test1 tt= new Test1();
      //  tt.setDaemon(true);
       
        tt.start();
    }
    
}
