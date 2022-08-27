

package exceptiondemo;
import java.lang.Exception;

public class ThrowsKeyword {
     void exp() throws Exception{
         System.out.println(100/0);
     }
     
    
}
class Test{
    public static void main(String[] args) {
        ThrowsKeyword tk= new ThrowsKeyword();
        try{
           tk.exp();  
        }
        catch(Exception ae){
            System.out.println("exception hai bhai isme");
        }
       
    }
}
