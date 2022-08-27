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
public class Maxcoin {
    public static void main(String[] args) {
        int [] a={1,5,700,2,3,6,8,9};
       
        int r=a.length-1;
        System.out.println( game(a,0,r));
        
    }
    static int game(int [] a,int l,int r){
        if(l+1==r) return Math.max(a[l],a[r]);
        return Math.max(a[r]+Math.min(game(a,l+1,r-1), game(a,l,r-2)), 
                       a[l]+Math.min(game(a,l+2,r),game(a,l+1,r-1)));
    }
    
}
