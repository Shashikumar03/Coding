/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursion;

import java.util.ArrayList;

/**
 *
 * @author shash
 */
public class Test114 {
       static ArrayList<Integer> al= new ArrayList<>();
    public static void main(String[] args) {
        int [] arr={1,2,3,2,5,3,6,7,3};
        int k=3;
      
        ArrayList<Integer> f1 = allIndexOfArray(arr,0, k);
        System.out.println(f1);
    }
     static ArrayList<Integer>  allIndexOfArray(int [] arr,int n,int k){
         if(n==arr.length) return al;
          if(arr[n]==k)
       {
          al.add(n);
       }  
       allIndexOfArray(arr, n+1, k);
      
         
         return al;
     }
    
}
