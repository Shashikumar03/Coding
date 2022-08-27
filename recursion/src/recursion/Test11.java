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
public class Test11 {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6};
        int k=8;
        
   int s=     game(arr,0,k);
        System.out.println(s);
        
    }
    static int game(int [] arr,int n,int k){
        if(n==arr.length) return -1;
        if(arr[n]==k && n<arr.length)
        {
            return n;
        }
     int si  =game(arr,n+1,k);
     return si;
       
    }
    
}
