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
public class Recursion1 {
    
    public static void main(String[] args) {
        System.out.println(fact(5));    
        
    }
    static int fact(int n)
    {
       
        if(n==0)
        {
            return 1;
        }
         int res= n*fact(n-1);
       return res;
    }
}
