/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lshape;

/**
 *
 * @author shash
 */
public class LShape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for( int i=1;i<=8;i++)
        {
            if(i<=5)
            {
                System.out.println("*");
            }
            if(i>=5)
            {
                System.out.print("*");
            }
        }
      
    }
    
}
