/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursion;

/**
 *
 * @author shash
 */
public class Fibonacci {
    static int temp =0;
    public static void main(String[] args)
    {
        int n= 4;
        Fibonacci f = new Fibonacci();
        
       
          System.out.println(f.table(n));
    }
    static int table(int n)
    {
        if (n==0 || n==1)
        {
            return n;
            
        }
     
         return   table(n-1)+table(n-2);
    }
    
}
