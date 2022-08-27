/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demothread.InterruptedMethod;

/**
 *
 * @author shash
 */
public class Test1 extends Thread {
    @Override
    public void run(){
        System.out.println( Thread.interrupted());
        Thread.currentThread().isInterrupted();
        try{
             for (int i= 1; i<= 5; i++) {
                 System.out.println(i);
                 Thread.sleep(1000);
            }
     
        }
        catch(Exception e){
            System.out.println("hjjc");
        }
    }
    public static void main(String[] args) {
        Test1 t= new Test1();
        t.start();
        t.interrupt();
        
    }
    
}
