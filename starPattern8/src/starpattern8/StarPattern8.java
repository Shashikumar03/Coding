/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package starpattern8;

/**
 *
 * @author shash
 */
public class StarPattern8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       for(int i=1;i<=4;i++)
       {
           for(int j=1;j<=i;j++)
           {
               System.out.print(" ");
           }
           for(int k=4;k>=i;k--)
           {
               System.out.print("*");
           }
           for( int l=3;l>=i;l--)
           {
                 System.out.print("*");
           }
             System.out.println();
       }
        
    }
    
}
