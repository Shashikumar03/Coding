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
public class Cat {
    static int temp =0;
    public static void main(String[] args) {
     
        System.out.println(catEyes(5));
        
    }
    static int catEyes(int n)
    {
        
       if(n==1)
        {
           
        return 2;
        }
       return 2*catEyes(n-1);
    }
}
