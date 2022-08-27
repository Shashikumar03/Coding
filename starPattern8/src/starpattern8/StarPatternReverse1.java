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
public class StarPatternReverse1 {
     
    
    public static void main(String[] args) {
        
        for(int i=5; i>=1;i--)
        {
            for( int k =5;k>i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<(i*2);j++)
            {
                {
                      System.out.print("*");
                }      
              
            }
            System.out.println();
        }
    }
    
}
