/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hashmap1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author shash
 */
public class HashMap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       HashMap<Integer,Integer> hm= new HashMap<>();
       ArrayList<Integer> al = new ArrayList<>();
      int [] a= {2,5,3,2,2,1,3,3};
    
      for(int no:a){
         if(hm.containsKey(no))
         {  int count= hm.get(no);
             hm.put(no,count+1);
         }
         else
         {
             hm.put(no,1);  
         }
      }
      for(int n:hm.keySet()){
          if(hm.get(n)>1)
          {
              System.out.println(n+" ");
          }
      }
    }
    
}
