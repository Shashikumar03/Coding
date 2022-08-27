/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demothread.PriorityThread;


public class Test extends Thread {
 public void run(){
     System.out.println("Thread is running");
 }
    public static void main(String[] args) {
        Thread.currentThread().setPriority(8);
        Test t= new Test();
        t.setPriority(6);
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(t.getPriority());
        t.start();
        
    }
    
}
