/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demothread.yieldMethod;

/**
 *
 * @author shash
 */
public class YieldMethod  extends Thread{
    @Override
    public void run(){
        Thread.yield();
        for (int i = 0; i < 6; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
            
        }
        
    }
    public static void main(String[] args) {
        YieldMethod ym= new YieldMethod();
        ym.start();
        Thread.yield();
        for (int i = 0; i < 6; i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
    
}
