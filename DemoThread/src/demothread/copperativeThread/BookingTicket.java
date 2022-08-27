/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demothread.copperativeThread;

/**
 *
 * @author shash
 */
public class BookingTicket extends Thread {
    
int total_earning=0;
     public void run(){
         synchronized(this){
         for (int i = 0; i < 10; i++) {
             total_earning +=100;
         }
        this.notify();
    }
     }
     public static void main(String[] args) {
        BookingTicket bb=new BookingTicket();
        bb.start();
        synchronized(bb){
            try{
            bb.wait();
            System.out.println(bb.total_earning);
            }
            catch(Exception e){
            e.printStackTrace();
            }
        }
         
    }
    
}
