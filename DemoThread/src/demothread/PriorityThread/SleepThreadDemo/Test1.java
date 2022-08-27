

package demothread.PriorityThread.SleepThreadDemo;

public class Test1 extends Thread{
    public void run (){
        try{

             for (int i = 0; i < 8; i++) {
                 String s=Thread.currentThread().getName();
                  
                  System.out.println(i+" "+s); 
                  Thread.sleep(1000);
           }
        }
        catch(Exception e){
            
        }
    }
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.start();
        Test1 tt= new Test1();
        tt.start();
    }
}
