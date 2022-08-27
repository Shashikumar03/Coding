

package demothread;


public  class ByInterface implements Runnable{
    
    @Override
    public void run(){
        System.out.println("shashi");
    }
    public static void main(String[] args) {
        ByInterface bi= new ByInterface();
        Thread th= new Thread(bi);
        th.start();
        
    }
}
