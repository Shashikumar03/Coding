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
public class CheckingBreak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        outer:   for (int i = 0; i < 10; i++)
        {
            System.out.println("pass :"+i);
            for (int j = 0; j < 100; j++)
            {
                if(j==11)
                {
               
                break outer;
                }
                System.out.print(" " + j);
            }
            System.out.println("this will not print");
            
        }
        System.out.println(" Loops complete");
    }
    
}
