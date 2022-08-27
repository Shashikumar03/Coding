/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demothread.copperativeThread;

public class BookingBusTicket extends Thread {
     int total_earning=0;
     public void run(){
         for (int i = 0; i < 10; i++) {
             total_earning +=100;
         }
         System.out.println(total_earning); 
    }
     public static void main(String[] args) {
        BookingBusTicket bb=new BookingBusTicket();
        bb.start();
         System.out.println(bb.total_earning);
    }
    
}
