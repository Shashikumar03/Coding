/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demothread.PriorityThread;

public class PriorityThread extends Thread {
    public void run(){
        
        System.out.println(Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        
        System.out.println(Thread.currentThread().getPriority());
        PriorityThread pt= new PriorityThread();
        pt.start();
    }
       
    
}
