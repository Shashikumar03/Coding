/*,
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursion;

import static recursion.FirstIndex.fun;

/**
 *
 * @author shash
 */
public class LastIndex 
{
    
    public static void main(String[] args) {
         int arr[]={1,5,8,9,7,10,9,15,9};
         int tar=91;  
       int a=  fun(arr, tar,0);
        System.out.println(a);
    }
  //  static int ind=-1;
    static int fun(int [] arr, int tar, int n)
    {   
        if(n==arr.length)
            return -1;
       int index=-1;
       if(arr[n]==tar)
       {
           index=n;
       }
       int a= fun(arr, tar, n+1);
         if(index>a)
             return index;
         else
             return  a;
    }
}
