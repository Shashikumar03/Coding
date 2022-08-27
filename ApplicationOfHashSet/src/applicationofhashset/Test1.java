/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package applicationofhashset;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Arrays;

/**
 *
 * @author shash
 */
public class Test1 {
    public static void main(String[] args) {
        int[] a= {5,7,2,2,1,3,1,5,9,9};
        int k=2;
        ArrayList<Integer>al= new ArrayList<>();
        Map<Integer,Integer>hm = new HashMap<>();
        for(int no:a)
        {
            if(hm.containsKey(no))
            {
                int count= hm.get(no);
                hm.put(no, count+1);
            }
            else
            {
                hm.put(no, 1);
            }
        }
        Set<Map.Entry<Integer,Integer>> es=hm.entrySet();
        for(Map.Entry<Integer,Integer>me:es)
        {
            if(me.getValue()==k)
            {
                al.add(me.getKey());
            }
          
        }
        System.out.println(al);
        System.out.println(al.get(0));
        System.out.println("size of :"+ al.size());
        
    }
    
}
