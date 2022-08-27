/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursion;

/**
 *
 * @author shashi
 */
public class Game {
    
    public static void main(String[] args) {
        int[] a= {1,5,700,2,7,8,9};
        System.out.println(coinMax(a,0,a.length-1));
        
    }
      static int coinMax(int[] a,int l, int r) 
      {
         if(l+1==r)
         {
             return Math.max(a[l], a[r]);
         }
         return Math.max(a[l]+Math.min(coinMax(a,l+2,r),coinMax(a,l+1,r-1)),a[r]+Math.min(coinMax(a,l+1,r-1), coinMax(a,l,r-2)));
      }
}
