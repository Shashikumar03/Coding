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
public class fact {
    public static void main(String[] args) {
        int no=5;
       int n= fact1(no);
        System.out.println(n);
    }
    static int fact1(int n)
    {
        if(n==0)
        return 1;
        return n*fact1(n-1);
        
    }
    
}
