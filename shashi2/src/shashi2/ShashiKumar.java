/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shashi2;
import java.util.Scanner;

public class ShashiKumar {

    
    public static void main(String[] args) {
        // TODO code application logic here
         int d;
    Scanner obj = new Scanner(System.in);
     d = obj.nextInt();
     if( d%4==0)
     {
         System.out.println(" leap year"); 
     }
     else 
     {
         System.out.println(" not leap year");
     }
      
     
    }
    
}
