/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursion;

import java.util.Scanner;


/**
 *
 * @author shash
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */static int fact =1;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s= new Scanner(System.in);
          System.out.println(" enter the number");
          int no =s.nextInt();
        Recursion r = new Recursion();
           r.calFact(no);
        System.out.println(" factorial of given no is :"+fact);
       
    }
      int calFact(int no)
      {
        
          if(no>1)
          {
             fact = fact*no;       
             calFact(no-1);
          } 
          return fact;
      }
     
    
}
