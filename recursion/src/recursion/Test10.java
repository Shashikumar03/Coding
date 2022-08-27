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
public class Test10 {
    
    public static void main(String[] args) {
        pzz(2); 
    }
    static void pzz(int n)
    {
        if (n<=0)
            return ;
        System.out.println( "pre"+" ");
        pzz(n-1);
        System.out.println("in"+" ");
        pzz(n-1);
        System.out.println( "post"+" ");
      
        
       
    }
    
    
}
