/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package starpettern5;

/**
 *
 * @author shash
 */
public class StarPettern5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for( int i=1;i<=5;i++)
        {
            for( int j=5;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
