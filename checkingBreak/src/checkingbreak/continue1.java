/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkingbreak;

/**
 *
 * @author shash
 */
public class continue1 {
    
    public static void main(String[] args) {
        outer:  for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++) 
            {
                if(j>i)
                {
                    System.out.println(" ");
                    continue outer;
                }
                System.out.print(" "+(i*j));
            }
            
        }
        System.out.println();
    }
    
}
