/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraydemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author shash
 */
public class HashMap1 {
    
    public static void main(String[] args) {
        
        int [] arr={5,4,3,2,2,1,1,5,5,5,5,4};
        Map<Integer,Integer> hm= new HashMap<>();
        for(int no:arr)
        {
            
            if(hm.containsKey(no)== true)
            {
                int count =hm.get(no);
                hm.put(no, count+1);
            }
            else
            {
                hm.put(no,1);
               
            }
        }
        System.out.println(hm);
        Set<Map.Entry<Integer,Integer>> es=hm.entrySet();
        for(Map.Entry<Integer,Integer> me:es)
        {
            if(me.getValue()==1)
            {
                System.out.print(me.getKey()+" ");
            }
            
        }
        
    }
    
}
