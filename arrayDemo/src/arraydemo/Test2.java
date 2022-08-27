/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraydemo;

import java.util.HashSet;

/**
 *
 * @author shash
 */
public class Test2 {
    
    
    public static void main(String[] args) {
        int [] arr= {1,1,2,2,2,2,3};
        int x=2;
         int temp=0;
        
        HashSet<Integer> hs= new HashSet<>();
         hs.add(x);
       for(int i=0;i<arr.length;i++)
       {  
       
           
          
           if(hs.contains(arr[i]) && arr[i]==x)
           { 
             
               temp =temp+ 1;
               
           }
           else
           {
               hs.add(arr[i]);
           }
       }
       
        System.out.println(temp);
        System.out.println(hs); 
   }
    
}
