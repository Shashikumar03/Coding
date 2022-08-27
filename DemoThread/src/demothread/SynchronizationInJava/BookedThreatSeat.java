

package demothread.SynchronizationInJava;


public class BookedThreatSeat {

     int total_seat=10;
    void bookedseat(int seat){
        System.out.println("request for seat booking is "+seat );
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
   
  class MovieTicketApp extends Thread{
       static BookedThreatSeat  bts;
       int seat;
     public void run(){
         bts.bookedseat(seat);
        
         
         
     }
      public static void main(String[] args) {
          
          MovieTicketApp mt= new MovieTicketApp();
       bts=new BookedThreatSeat();
       mt.seat=8;
          mt.start();
           MovieTicketApp mt1= new MovieTicketApp();
           mt1.seat=20;
           mt1.start();
      }
    
}
