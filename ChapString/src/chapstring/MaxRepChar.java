/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapstring;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author shash
 */
public class MaxRepChar {
    
    public static void main(String[] args) {
        
        String s= "axxbxxx000000xbcccxxx";
        HashMap<Character,Integer> hm= new HashMap<>();
        char [] c= s.toCharArray();
        
        for(char ch:c)
        {
      
            if(hm.containsKey(ch))
            {
                hm.put(ch,hm.get(ch)+1);
            }
            else
                hm.put(ch,1);
        }
        int max =0;
        char cd=' ';
        for(Map.Entry<Character,Integer> me:hm.entrySet())
        {
            if(max < me.getValue())
            {
                max = me.getValue();
                cd = me.getKey();
              
            }
        }
        System.out.println(cd);
    }
}
