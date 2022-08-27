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
public class FirstIndex
{
    public static void main(String[] args) 
    {
        
        int arr[]={1,5,8,9,7,10,15,9};
         int tar=90;
       int a=  fun(arr, tar,0);
        System.out.println(a);
    }
    static int fun(int[] arr, int tar, int n)
    {
        if(n==arr.length)
            return -1;
        if(arr[n]==tar)
        {
            return n;
        }
       int a= fun(arr, tar, n+1);
         return a;
    }
    
}
