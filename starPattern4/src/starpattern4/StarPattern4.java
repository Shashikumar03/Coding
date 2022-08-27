/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package starpattern4;

/**
 *
 * @author shash
 */
public class StarPattern4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for( int i=1;i<=4;i++)
        {
            for( int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for( int k=i-1;k>=1;k--)
            
                {
                     System.out.print(k);
                
            }
            System.out.println();
        }
    }
    
}
