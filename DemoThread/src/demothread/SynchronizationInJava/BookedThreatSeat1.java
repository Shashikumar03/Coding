/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demothread.SynchronizationInJava;

/**
 *
 * @author shash
 */
public class BookedThreatSeat1 {
    int total_seat=10;
  synchronized void bookedseat1(int seat){
        System.out.println("request for seat booking is " +seat);
         if(total_seat>=seat){
             System.out.println("seat booked Sucessfully");
             total_seat= total_seat-seat;
             System.out.println("seat left:"+" "+total_seat);
         }
         else
         {
             System.out.println("seat not booked");
             System.out.println("available seat is only "+" "+total_seat);
         }
     }
    

} 
  class MovieTicketApp1 extends Thread{
       static BookedThreatSeat1  bts;
       int seat;
     public void run(){
         bts.bookedseat1(seat);
        
         
         
     }
      public static void main(String[] args) {
          
          MovieTicketApp1 mt= new MovieTicketApp1();
       bts=new BookedThreatSeat1();
       mt.seat=8;
          mt.start();
           MovieTicketApp1 mt1= new MovieTicketApp1();
           mt1.seat=20;
           mt1.start();
      }
    


}