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
public class BookedThreatSeat3 {
int total_seat=10;
   void bookedseat3(int seat){
        System.out.println("request for seat booking is " +seat);
        System.out.println("hhh");
        System.out.println("hhhhhhaaa");
        synchronized(this){
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
        System.out.println("haha");
     }
    

} 
  class MovieTicketApp3 extends Thread{
       static BookedThreatSeat3  bts;
       int seat;
     public void run(){
         bts.bookedseat3(seat);
        
         
         
     }
      public static void main(String[] args) {
          
          MovieTicketApp3 mt= new MovieTicketApp3();
       bts=new BookedThreatSeat3();
       mt.seat=8;
          mt.start();
           MovieTicketApp3 mt1= new MovieTicketApp3();
           mt1.seat=20;
           mt1.start();
      }
    


}
