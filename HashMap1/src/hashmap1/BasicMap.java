/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hashmap1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author shash
 */
public class BasicMap {
     public static void main(String[] args) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        hm.put(1,2);
        hm.put(3,4);
        hm.put(5,6);
        for(int no:hm.keySet()){
             System.out.print("key "+no+" ");
             
            System.out.print("value "+hm.get(no)+" ");
            System.out.println( );
           
        }
         System.out.println("------------next metod----------------------");
               Set<Map.Entry<Integer,Integer>> es = hm.entrySet();
               for(Map.Entry<Integer,Integer> me:es){
                     System.out.print(" key "+me.getKey());
                   System.out.print(" value "+me.getValue());
                   System.out.println();
                 
               }
        
    }
}
