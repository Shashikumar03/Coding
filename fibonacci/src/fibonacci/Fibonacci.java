/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonacci;

/**
 *
 * @author shash
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=0,b=1;
        int sum1;
        for( int i=1;i<=10;i++)
        {
            sum1 = a+b;
            System.out.println(sum1);
              
           a= b;
             b=sum1;
        }
    }
    
}
