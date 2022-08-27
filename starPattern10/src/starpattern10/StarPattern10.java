/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package starpattern10;

/**
 *
 * @author shash
 */
public class StarPattern10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=1;i<=4;i++)
        {
        
            for( int j=4;j>=i;j--)
            {
                System.out.print(" ");
            }
            for( int k=1;k<=i;k++)
            { 
                if(i>=2 && k>=2)
                {
                System.out.print(" ");
                }
                else
                {   //   *
//                      * *
  //                   *   *
 //                   *     *
                    
                    System.out.print("*");
                }
            }
            for( int l=2;l<=i;l++) 
            {
                if(i>=3 && l<=i-1)
                {
                System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    
}
