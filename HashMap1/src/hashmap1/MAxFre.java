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
public class MAxFre {
    public static void main(String[] args) {
        String S= "this is aa a a car is";
      String ss=  check(S);
        System.out.println(ss);
     
    }
public static String check(String s){
        String [] a= s.split(" ");
        HashMap<String,Integer> hm= new HashMap<>();
        for(String val:s.split(" ")){
            if(hm.containsKey(val)){
                int count=hm.get(val);
                
                hm.put(val,count+1);
            }
            else
            {
               
                hm.put(val,1);
            }
        }
        
        String shi=" ";
        Set<Map.Entry<String,Integer>> es = hm.entrySet();
        int max=Integer.MIN_VALUE;
       for(String str:a)
       {  int k = hm.get(str);
         if(k>max){
             max=k;
             shi=str;
         }
          
      }
      return shi+" "+max;
       
    }


    
}
