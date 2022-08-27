/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package starpattern6.pkg1;

/**
 *
 * @author shash
 */
public class StarPattern61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=1;i<=4;i++)
        {
            for( int j=4;j>=1;j--)
            {
                if (j>i)
                {
                     System.out.print(" ");
                }
                else
                {
                    System.out.print(" *");
                }
                
            }
            System.out.println();
        }
    }
    
}
