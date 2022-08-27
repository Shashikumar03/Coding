/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package applicationofhashset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author shash
 */
public class Position {
    
    public static void main(String[] args) {
        int[] arr = {1,50,2,2,2,1,2,3,6,7,5,7,1,2,5,6,9,2,8,50,50};
       
        int count =0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
        {
            if(hm.containsKey(arr[i]))
            {
              
                count = Math.max(count, i-hm.get(arr[i]));
              
            }
            else
            {
                  hm.put(arr[i], i);
            }
        }
      
        System.out.println(count);
        
    }
}
