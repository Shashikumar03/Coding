/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package math;

import java.awt.BorderLayout;
import java.util.HashSet;

/**
 *
 * @author shash
 */
public class Math {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int[] a= {1,3,4,5,6,7,10};
        int n=a.length;
        int k=110;
     
        System.out.println( sum(a,n,k));
         sum3(a,n,k);
      
    }
      static  boolean  sum(int[] a,int n,int k)
    {
        int sum=0;
        int left=0;
        int right=n-1;
        
        
        if(left<=right)
            return false;
       
            sum=a[right]+a[left];
        if(sum>k)
        {
          sum(a,right-1,left);
            
        }
        else if(sum<k)
        {
            sum(a,right,left+1);
        }
        else
        {
            return true;
        }
    
      
         return false;
    }
      static void sum3(int [] a,int n,int k)
      {
             HashSet<Integer> hs= new HashSet<>();
             for (int i = 0; i < n; i++)
            {
               int temp = k-a[i];
              if(hs.contains(temp))
               {
                System.out.println(a[i]+" "+temp);
               }
              hs.add(a[i]);
             
            }
            
      }
    
 }
// A Java program to find floor(sqrt(x))

class GFG {
    
    // Returns floor of square root of x
    static int floorSqrt(int x)
    {
        // Base cases
        if (x == 0 || x == 1)
            return x;

        // Staring from 1, try all numbers until
        // i*i is greater than or equal to x.
        int i = 1, result = 1;
        
        while (result <= x) 
        {
            i++;
            result = i * i;
        }
        return i - 1;
    }

    
    public static void main(String[] args)
    {
        int x = 11;
        System.out.print(floorSqrt(x));
    }
}

// This code is contributed by Smitha Dinesh Semwal.


    