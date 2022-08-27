

package demothread.SynchronizationInJava;


public class BookingBusTicket5 {
 static   int total_seat=10;
   synchronized  static void bookedSeat(int seat){
    if(total_seat>=seat){
        System.out.println(seat+" seat is successfully booked");
        total_seat=total_seat-seat;
        System.out.println("seat left "+ total_seat);
        
    }
    else
    {
        System.out.println(seat+" seat is not booked");
        System.out.println(" beacause seat available is "+ total_seat);
        
    }
}
}
    class Test extends Thread{
        int seat;
     static BookingBusTicket5  bs1;
     Test( BookingBusTicket5 bs1,int seat){
         this.bs1= bs1;
         this.seat=seat;
     }
        public void run(){
            bs1.bookedSeat(seat);
           
          
            
        }
    }    
    class Test2 extends Thread{
        int seat;
     static BookingBusTicket5  bs5;
     Test2( BookingBusTicket5 bs5,int seat){
         this.bs5= bs5;
         this.seat=seat;
     }
        public void run(){
           
            bs5.bookedSeat(seat);
          
            
        }
    }
       class BookingApp{
            static BookingBusTicket5 bs1, bs2;  
           public static void main(String[] args) {
               bs1= new BookingBusTicket5();
               Test t= new Test(bs1, 8);
               Test2 t2= new Test2(bs2, 8);
               t.start();
               t2.start();
          //----------------------------------------//
               bs2= new BookingBusTicket5();
               Test t11= new Test(bs1, 7);
               Test2 t22= new Test2(bs2, 5);
               t11.start();
               t22.start();
               
           }
    }
    

