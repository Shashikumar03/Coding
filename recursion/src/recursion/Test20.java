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
public class Test20 {
    
    public static void main(String[] args) 
    {
        int[] a= {1,2,3,4,5,6,10};
        int n=a.length;
        int k=15;
        System.out.println( linearSearch(a,0,n,k));
    }
    static int linearSearch(int[] a,int i,int n,int k)
    {
            if(i==n)
            {
               return -1;  
            }
            if(a[i]==k)
            {
                return i;
            }
           return linearSearch(a,i+1,n,k);
            
           
    }
    
}
