/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursion;

import java.awt.BorderLayout;

/**
 *
 * @author shash
 */
public class Test12 {
    
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
   
    
    static int fact(int n) 
    {
         int sum=0;
        if(n==0 || n==1)
        {
            return n;
        }
      
       int f1= fact(n-1); 
       int f2= fact(n-2);
       
        return f1+f2;
    }
}
