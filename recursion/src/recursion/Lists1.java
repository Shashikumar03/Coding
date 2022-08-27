/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 *
 * @author shash
 */
public class Lists1 {
    static  ArrayList<Integer> al= new ArrayList<>();
    static HashSet<Integer> hs= new HashSet<>();
    public static void main(String[] args) {
        int [] array={2,5,8,11,13};
        int sum=0;
        
        for(int i=0;i<array.length;i++)
        {
            hs.add(array[i]);
            sum= sum+array[i];
        }
     
      ArrayList<Integer> al1= subSetSum(array,0,sum,al);
      al1.add(0);
      al1.add(sum);
     
      for(int no:al1)
      {
          hs.add(no);
      }
       Collections.sort(al1);
        System.out.println(hs);
    }
    static ArrayList<Integer> subSetSum(int [] array,int i,int sum,ArrayList<Integer> al){
      
        if(i== array.length)
            return al;
       
             al.add(array[i]);
           al.add(sum-array[i]);
        
        subSetSum(array, i+1, sum,al);
        
    return al;
}
    
}
