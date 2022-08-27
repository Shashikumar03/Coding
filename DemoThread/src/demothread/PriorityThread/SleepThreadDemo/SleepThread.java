/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demothread.PriorityThread.SleepThreadDemo;


public class SleepThread  extends Thread{
     public void run(){
         
     }
     public static void main(String[] args) {
        try{
          
            for (int i = 0; i < 10; i++) {
                System.out.print(i+" ");
                  Thread.sleep(1000);
            }
        }
        catch(Exception e){
            
        }
    }
    
}
