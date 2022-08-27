/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shash
 */
public class PracticeOfMergeSort {
    
    public static void main(String[] args) {
        int [] arr={1,50,11,11,9,3,4};
      int [] arr1=divideArray(arr,0,arr.length-1);
      print(arr1);
    }
    static int [] divideArray(int [] arr, int start, int end)
    {
        if(start== end)
        {
            int[] a= new int[1];
            a[0]=arr[start];
            return a;
        }
        int mid=(start+end)/2;
        
        int [] leftsort=divideArray(arr, start,mid);
        int  [] rightsort=divideArray(arr,mid+1,end);
 
          int[] finalresult=mergesort(leftsort,rightsort);
        
        
        return finalresult;
    }
    static int [] mergesort(int[] left,int[] right){
        int n1=left.length;
        int n2=right.length;
        int[] result=new int[n1+n2];
        int i,j,k;
        i=j=k=0;
        while(i<n1 && j<n2)
        {
            if(left[i]<right[j])
            {
                result[k]=left[i];
                i++;
                k++;
            }
            else
            {
                result[k]=right[j];
                j++;
                k++;
            }
        }
        while(i<n1)
        {
            result[k]=left[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            result[k]=right[j];
            j++;
            k++;
        }
       
        return result;
    }
    static void print(int[] arr){
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
