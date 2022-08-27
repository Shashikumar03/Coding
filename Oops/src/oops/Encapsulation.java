
package oops;

public class Encapsulation 
{
  
    private  int age;
 
   public int getAge()
   {
       return age;
   }
   public void setAge(int age)
   {  
       if(age>10)
        {
           System.out.println("not valid");
        }
       else
        {
          this.age=age;   
        }
        
   }
    
}
 class Test{
    public static void main(String[] args) {
        Encapsulation ep= new Encapsulation();
     ep.setAge(5);
        
    }
}
