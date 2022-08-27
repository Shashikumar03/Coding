

package demothread;


public class UsesOfMethod  extends Thread{
    public void run (){
        System.out.println("shashi");
        System.out.println(Thread.currentThread().getName());
    }
    
    public static void main(String[] args) {
        UsesOfMethod t= new UsesOfMethod();
        t.setName("learningThread1");
        t.start();
      
        UsesOfMethod t2= new UsesOfMethod();
        t2.setName("LearnThread");
        t2.start();
        
    }
}
