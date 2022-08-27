/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursion;

/**
 *
 * @author shash
 */
 /**public class Test1 {
   
    public static void main(String[] args) {
        
        System.out.println(pow(3,2));
        
    }
    static int pow(int a,int b)
    {
        if(b==0)
        {
           
            return 1;
        }
        
       
        return a*pow(a,b-1);
    }
    
}
 */
public class Test1 {
   
    public static void main(String[] args) {
        
        System.out.println(pow(3,10));
        
    }
    static int pow(int a,int b)
    {
        if(b==0)
        {
           
            return 1;
        }
        if(b%2==0)
        {
            return pow(a*a,b/2);
        }
        else
       
        return a*pow(a,b-1);
    }
    
}
