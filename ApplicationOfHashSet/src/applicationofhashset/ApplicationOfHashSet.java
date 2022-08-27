/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package applicationofhashset;

import java.util.HashSet;

/**
 *
 * @author shash
 */
public class ApplicationOfHashSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] a= {1,2,3,4,1,2,4};
        HashSet<Integer> hs= new HashSet<>();
        for (int i = 0; i <a.length; i++)
        {
            hs.add(a[i]);
            
        }
        System.out.println(hs);
    }
    
}
