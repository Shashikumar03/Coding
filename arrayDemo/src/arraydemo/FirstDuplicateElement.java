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
public class FirstDuplicateElement {
    
    public static void main(String[] args) {
        
        int[] a={6,5,3,2,5,1,2,4};
        int temp=-1;
        HashSet<Integer> hs= new HashSet<>();
        for(int i=a.length-1;i>=0;i--)
        {
           if(hs.contains(a[i]))
           {
               temp=i;
           }
           else
           {
               hs.add(a[i]);
           }
        }
        if(temp==-1)
        {
            System.out.println(" no duplicate element is found");
        }
        else if(temp!=-1)
        {
            System.out.println("first duplicate element is: "+a[temp]);
        }
    }
    
}
