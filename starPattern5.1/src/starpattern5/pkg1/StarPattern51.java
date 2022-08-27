/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package starpattern5.pkg1;

/**
 *
 * @author shash
 */
public class StarPattern51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 3; j >= i; j--)
            {
                System.out.print(" ");  
            }
            for( int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
  
        }
        for(int i=1; i<=3;i++)
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(" ");   
            }
            for(int k=3;k>=i;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        } 
    }
    
}
