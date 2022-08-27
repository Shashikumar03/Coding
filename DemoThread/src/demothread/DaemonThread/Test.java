
package demothread.DaemonThread;

public class Test extends Thread {
   public void run(){
       System.out.println("in method");
   }
    public static void main(String[] args) {
        System.out.println("shashi");
        Test t= new Test();
        t.setDaemon(true);
        t.start();
    }
    
    
}
