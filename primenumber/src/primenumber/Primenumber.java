/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package primenumber;
import java.util.Scanner;

/**
 *
 * @author shash
 */
public class Primenumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("plz write the number");
        Scanner s = new Scanner(System.in);
        int  no = s.nextInt();
        
        int temp = 0;
        for(int i= 2; i<=no-1;i++)
        {
            if(no%2==0)
            {
                temp = temp+1;
            }
        }
        if( temp >0)
        {
            System.out.println(" not prime ");
        }
        else
        {
            System.out.println("prime");
        }
    }
    
}
