

package hashmap1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author shash
 */
public class LowestFreq {
    public static void main(String[] args) {
        
        int arr[]={2,2,5,50,50,5,1};
       int a= LargButMinFreq(arr,arr.length);
        System.out.println(a);
    }
     public static int LargButMinFreq(int arr[], int n)
    {
        HashMap<Integer,Integer> hm= new HashMap<>();
       
        
     for(int i=0;i<n;i++){
         if(hm.containsKey(arr[i]))
         {
             int count= hm.get(arr[i]);
             hm.put(arr[i],count+1);
         }
         else hm.put(arr[i],1);
         
     }
     int max=Integer.MIN_VALUE;
     int min= Integer.MAX_VALUE;
     Set<Map.Entry<Integer,Integer>> es=hm.entrySet();
     for(Map.Entry<Integer,Integer> me:es){
         if(me.getValue()<=min && max<me.getKey())
         {
             min=me.getValue();
             max=me.getKey();
         }
         
     }
   
     
     return max;
        
    }
    
}
