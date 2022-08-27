/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kdiff;

import java.util.HashMap;


/**
 *
 * @author shash
 */
public class Kdiff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] arr={3,5,5,7,8,9,5};
       int b= TotalPairs(arr,0);
        System.out.println(b);
    }
     public static int TotalPairs(int[] nums, int k)
    {
   
    int count=0;
    HashMap<Integer,Integer> hm= new HashMap<>();
      for(int no:nums){
          if(hm.containsKey(no))
          {
              int n= hm.get(no);
              hm.put(no,n+1);
          }
          else
              hm.put(no, 1);
          }
      if(k==0){
          for(int n:hm.keySet()){
              if(hm.get(n)>1)
              {
                  count= hm.get(n)-1;
              }
              
          }
      }
      
      else{ 
      for(int no:hm.keySet()){
          
          if(hm.containsKey(no+k)  )
              
          {
              count++; 
          }
          
      }  
    }
        return count;
}
}