/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package startpattern;

/**
 *
 * @author shash
 */
public class StartPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j;
        for(i=1;i<=5;i++)
        {
         for (j=1;j<=i;j++)
         {
             System.out.print("*");
         }
            System.out.println();
            
        }
        for(i=1;i<=5;i++)
        {
         for (j=4;j>=i;j--)
         {
             System.out.print("*");
         }
            System.out.println();
            
        }
    }
    
}
