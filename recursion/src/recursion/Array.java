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
public class Array 
{
    public static void main(String[] args) {
        int arr[] ={1,5,4,7,800,9};
        int len= arr.length;
     int a=   revArray(arr, len,0);
        System.out.println(a);
    }   
   
    static  int revArray(int [] arr, int len, int n)
    {
        if(n==len-1)
          return arr[n];
        int max=revArray(arr, len, n+1);
        if(max>arr[n])
            return max;
        else
            return arr[n];
        
    }
    
}
