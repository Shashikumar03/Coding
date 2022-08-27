/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sorting1;

import java.util.Arrays;

/**
 *
 * @author shash
 */
public class WaveSort {
    
    public static void main(String[] args) {
        int[] arr={10,12,1,5,6,4,8,7};
       int[] arr1= sort(arr);
       
       print(arr1);
      
    }
    static int[] sort(int [] arr){
        
        for (int i = 1; i <arr.length; i+=2) 
        {
            if(arr[i]>arr[i-1])
            {
               int temp=arr[i];
               arr[i]=arr[i-1];
               arr[i-1]=temp;
            }
            if(i<(arr.length)-2 && arr[i]>arr[i+1] )
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]= temp;
            }
        }
        return arr;
    }
    static void print(int [] arr){
        for (int i = 0; i <arr.length; i++)
        {
            System.out.print(arr[i]+" ");
            
        }
    }
}
