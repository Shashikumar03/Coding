/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numberpattern6;

/**
 *
 * @author shash
 */
public class NumberPattern6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for( int i=1;i<=5;i++)
        { 
            int no= i;
            for( int j=1;j<=i;j++)
            {
                System.out.print(no+ " ");
                no = no+5-j;
            }
            System.out.println();
        }
        
    }
    
}
