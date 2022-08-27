

package heapsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Arrays {
    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        int[] a= {1,5,32,4,2,6};
        for (int i = 0; i <a.length; i++) {
            al.add(a[i]);
            
        }
        Collections.sort(al);
      Iterator<Integer> i = al.iterator();
        while(i.hasNext())
        {
            System.out.print(i.next()+" ");
        }
    }
    
}
