/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

/**
 *
 * @author shash
 */
public class PowerOf2 {
    
    public static void main(String[] args) {
        int n=33;
        PowerOf2 p2= new PowerOf2();
        
        System.out.println(p2.isPowerOfTwo(n));
    }
    boolean isPowerOfTwo(int n) {
    
    if(n % 2 == 1 && n != 1) {
        
        return false;
    }
    else if(n == 0) {
        
        return false;
    }
    else if(n == 1) {
        
        return true;
    }
    else {
        
        return isPowerOfTwo(n / 2);
    }
    
    
}
    
}
