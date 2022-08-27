

package demothread;


public class Test  extends Thread{
    @Override
    public void run (){
        System.out.println("shashi");
    }

    public static void main(String[] args) {
        Test t= new Test();
        t.start();
    }
    
}
