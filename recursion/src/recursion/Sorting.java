/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursion;



/**
 *
 * @author shash
 */
public class Sorting {
    public static void main(String[] args) {
        int [] a={1,2,3,5,6,7,12,4};
        int n= a.length;
      if(  sort(a,n))
      {
          System.out.println("sorted"); 
      }
      else
            System.out.println("unsorted");
    }
      static boolean  sort(int []a,int n)
    {
        int count=0;
        if(n==1)
        {
            return true;
        }
        if(a[n-1]>a[n-2] &&  sort(a,n-1))
        {
          return true;
        }
        return false;
    }
    
}
