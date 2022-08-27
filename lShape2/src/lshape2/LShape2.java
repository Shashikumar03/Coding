/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lshape2;

/**
 *
 * @author shash
 */
public class LShape2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for( int i=0;i<=3;i++)
        {
            for( int j=0;j<=3;j++)
            {
                if( i<3 && j==0)
                {
                    System.out.print("*");
                }
                if(i==3)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    
}
