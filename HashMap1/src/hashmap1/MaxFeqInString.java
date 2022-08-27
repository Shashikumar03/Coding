/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hashmap1;

import java.util.HashMap;
//import jdk.nashorn.internal.ir.ForNode;

/**
 *
 * @author shash
 */
public class MaxFeqInString {
    public static void main(String[] args) {
        
    
    String s= "shashikushwahaaaaaaaeeeeeeeeeeee";
    HashMap<Character,Integer> hm = new HashMap<>();
     for( int i=0;i<s.length();i++){
         if(hm.containsKey(s.charAt(i)))
         {
             int count= hm.get(s.charAt(i));
             hm.put(s.charAt(i),count+1);
         }
         else hm.put(s.charAt(i), 1);
     }
     int max=0;
      char c='q';
         for(char sh:hm.keySet()){
             if(max<hm.get(sh))
             {
                 max=hm.get(sh);
                 c=sh;
             }
         }
         System.out.println(max+" "+ c);
    

    } 
}
