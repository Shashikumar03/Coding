
package oops;


public class Vehicle {

    int wheels;
   String name;
   int  headlights;
   static int temp=0;
    Vehicle( int no_wheels,String name1)
    {
       wheels = no_wheels;
        name = name1;
        headlights=2;
    }
    public static void main(String[] args) {
   
        Vehicle v= new Vehicle(4,"car");
       v.display();
        int n=5;
       int d=5;
         v.test();
       
        System.out.println( v.fact(n));
       
       
    }
    
      void display(){
        System.out.println(wheels+" "+ name +" "+ headlights);
    }
     
      
      // recursion
      int fact(int n)
      { 
          
          if( n==1)
          {
              return 1;
          }
          if(n>1){
             
              temp= n*fact(n-1);
          }
          return temp;
      }
      void test()
      {
          System.out.println("shashi modi");
          
      }
    
}
