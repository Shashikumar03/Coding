/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraydemo;

import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author shash
 */
public class DuplicateElement {

    public static void main(String[] args) {
        int[] a={3,5,4,3,2,2,1};
         Set<Integer> s = new HashSet<>();
         for( int no:a)
         {
           if(s.add(no)==false) 
           {
               System.out.println(no);
           }
         }
    }
}
