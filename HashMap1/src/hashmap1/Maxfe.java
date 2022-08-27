
package hashmap1;

import java.util.HashMap;

/**
 *
 * @author shash
 */
public class Maxfe {
    public static void main(String[] args) {
        char [] c={'a','a','b','a','b','a','c','d','a','a','b','b','b','b','b'};
        HashMap<Character,Integer> hm= new HashMap<>();
        for(char ch:c){
            if(hm.containsKey(ch)){
                int n=hm.get(ch);
                hm.put(ch,n+1);
            }
            else
                hm.put(ch, 1);
        }
        int max=0;
        char b=' ';
        for(char p:hm.keySet()){
            if(max<hm.get(p)){
                max= hm.get(p);
                b=p;
            }
        }
        System.out.println(max+" "+b);
    }
    
}
