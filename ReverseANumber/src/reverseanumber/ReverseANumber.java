/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reverseanumber;

/**
 *
 * @author shash
 */
public class ReverseANumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int no=58945842, rem,rev=0;
        while(no!=0)
        {
            rem = no%10;
            rev = rev*10+rem;
            no = no/10;
        }
        System.out.println(rev);
    }
    
}
