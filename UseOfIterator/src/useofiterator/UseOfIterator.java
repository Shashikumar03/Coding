/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package useofiterator;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author shash
 */
public class UseOfIterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a[] = {1,2,3,4};
        HashSet<Integer> hs= new HashSet<>();
        hs.add(1);
        hs.add(2);
       Iterator<Integer> it= hs.iterator();
       while(it.hasNext())
       {
           System.out.print(it.next()+" ");
       }
    }
    
}
