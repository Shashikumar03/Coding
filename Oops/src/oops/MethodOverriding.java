package oops;



public class MethodOverriding {
     
    void show(String s)
    {
        System.out.println("kumar");
    }
    void display(int a)
    {
        System.out.println("kushwaha");
    }
    
}
class Xyz extends MethodOverriding
{
    void show(String s)
    {
        System.out.println("shashi");  
    }
    public static void main(String[] args) {
        MethodOverriding mo= new MethodOverriding();
        Xyz x= new Xyz();
        x.show("ad");//overriding
        mo.show("abc");//overriding
        x.display(1);// inheritance 
        mo.display(2);// inheritance 
        
    }
}
