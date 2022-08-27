/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package starpattern3;

/**
 *
 * @author shash
 */
public class StarPattern3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic  
       
        for(  int i=1;i<=4;i++)
        {
          for( int j=4;j>=i;j--)
            {
                System.out.println(" ");
            }
          for( int k=1;k<=i;k++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    
}
