

package oops;


public class Constructor {

    String name;
    int a;
    public Constructor(String name1,int a1) 
    {
        name= name1;
        a=a1;
    }
     void display()
     {
         System.out.print(name+" "+a);  
     }
    public static void main(String[] args)
    {
      Constructor con = new Constructor("shashi",33);
        System.out.println(con.name);
       con.display();
       
       
    }
    
    
    
}
