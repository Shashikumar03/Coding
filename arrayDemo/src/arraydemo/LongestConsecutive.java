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
public class LongestConsecutive {
    
    public static void main(String[] args) {
        int[] a={3,9,1,10,4,20,2};
        int long_leng=0;
        HashSet<Integer> hs=new HashSet<>();
        for (int i = 0; i <a.length; i++)
        {
            hs.add(a[i]);
            
        }
        for (int i = 0; i < a.length; i++)
        {
            if(!hs.contains(a[i]-1))
            {
                int no=a[i];
            
            while(hs.contains(no))
            {
              no++;  
            }
            if(long_leng<no-a[i])
            {
                long_leng= no-a[i];
            }
          }  
            
        }
        System.out.println("largest sub seq lenght is "+long_leng);
    }
    
}
