

package oops;


public class Overriding {
    
    void show(int a, String s)
    {
        
        System.out.println("kushwaha");
    }
    void show( String s,int a)
    {
        System.out.println("shashi");
        
    }
    public static void main(String[] args) {
        Overriding o= new Overriding();
        o.show("b",1);// it will print shashi
        o.show(1, "m");//it will call kushwaha;
    }
    
}
