/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package starpattern2;

/**
 *
 * @author shash
 */
public class StarPattern2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
         
        for(int k=1;k<=4;k++)
        {
            for(int l=4;l>=k;l--)
            {
                System.out.print(" ");
            }
            for( int i=1;i<=k;i++)
            {
                System.out.print(" *");
            }
            System.out.println();
            
        }
    
        
    }
        
    
}
