/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factorial;

import java.util.Scanner;

/**
 *
 * @author shash
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         String yn;
         do
         {
             
         System.out.println("write the factorial of "); 
       int no ;
       Scanner s = new Scanner(System.in);
       no = s.nextInt();
       
        int res=1;
      
        for(int i=no;i>=1;i--)
        {
             res =res*i; 
           
        }
        System.out.println(res);
             System.out.println("do u want to continue (press y for yes & n for no)");
              yn= s.next();
         }
         while(yn.equals("y")|| yn.equals("Y"));
    
         System.out.println("write the no");
    }
    
    
}
