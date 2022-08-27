/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numberpattern3;

/**
 *
 * @author shash
 */
public class NumberPattern3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        for(int i=1;i<=10;i++)
        {
            for(int j=i;j>=1;j--)
            {
                
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
