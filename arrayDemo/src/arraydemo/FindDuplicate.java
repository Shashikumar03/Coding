/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraydemo;

;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author shash
 */
public class FindDuplicate {
    
    public static void main(String[] args) {
        
        int[] a={3,5,4,3,2,2,1};
        Map<Integer, Integer> hm = new HashMap<>();
        for(int no:a)
        {
            Integer count=hm.get(no);
            if(count == null)
            {
                hm.put(no,1);
            }
            else
            {
                count= count+1;
                hm.put(no, count);
            }
        }
        Set<Map.Entry<Integer,Integer>>es = hm.entrySet();
        for(Map.Entry<Integer,Integer>me:es)
        {
            if(me.getValue()>1)
            {
                System.out.println(me.getKey()+" ");
            }
        }
        
        
    }
    
}
