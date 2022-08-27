/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shashi1;

import java.util.Arrays;
import java.util.Scanner;
public class Shashi1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int a,b ,c ;
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        c = obj.nextInt();
        
        if(a%2==0)
        {
            System.out.println("even no. is "+ a);
          
        }
        else
        {
           
            System.out.println(" odd no is   "+ a);
        }
        
         if(b%2==0)
        {
             System.out.println("even no.  " + b);
          
        }
          else
        {
            System.out.println(" odd no is " + b);
        }
        if(c%2==0)
        {  System.out.println("even no. is " + c);
          
        }
          else
        {
            System.out.println(" odd no is " + c);
           ;
        }
        
        
    }
    
}
