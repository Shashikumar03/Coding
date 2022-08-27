/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numberpattern7;

/**
 *
 * @author shash
 */
public class NumberPattern7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int count =0;
        for( int i=1;i<=5;i++)
        {
            for( int j=1;j<=3;j++)
            {
                count = count+1;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
    
}
