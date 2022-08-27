/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraydemo;

import java.util.HashSet;

/**
 *
 * @author shash
 */
public class CommonElement2 {
    
    public static void main(String[] args) {
        
        
        int[] a={1,2,3,4,1,5,6,7,8,9};
        int[] b={2,4,6,6,8,10};
        HashSet<Integer>  hs= new HashSet<>();
        for (int i = 0; i <a.length; i++)
        {
            for (int j = 0; j < b.length; j++)
            {
                if(a[i]==b[j])
                {
                    hs.add(a[i]);
                }
                
            }
            
        }
        for(int no:hs)
        {
            System.out.print(no+" ");
        }
    }
    
}
