
package hashmap1;

import java.util.HashMap;


public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr={10,15};
        HashMap<Integer, Boolean> hm= new HashMap<>();
        
        for(int no:arr){
            hm.put(no,true);
        }
        for(int no:arr){
            if(hm.containsKey(no-1))
                hm.put(no, false);
        }
        int max=1;
        for(int no:arr){
            
            if(hm.get(no)==true){
                {
                   int tl=1;
                   int tsp=no;
                   while(hm.containsKey(tsp+tl)){
                       tl++;
                       
                }
                   if (tl>max)
                           max= tl;
                
                }
                
            }
        }
        System.out.println(max);
    }
    
}
