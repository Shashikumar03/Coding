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
public class IncreasingAndDecreasing {
    public static void main(String[] args) {
        
        inc(5);
        dec(1);
    }
      static void inc(int n)
      {
          if(n>0)
          {
              System.out.print(n+" ");
              inc(n-1);
          }
          
        
    }
      static void dec(int s){
          if(s<11){
              
          
              System.out.print(s+" ");
          dec(s+1);
          }
      }
    
}

