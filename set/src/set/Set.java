

package set;

import java.util.HashSet;


public class Set {

    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(2);
        hs.add(0);
        hs.add(3);
        hs.add(3);
        System.out.println(hs.contains(0)); 
       System.out.println(hs);
       hs.remove(0);
        System.out.println( hs.remove(0));
       System.out.println(hs); 
      
    }
    
}
