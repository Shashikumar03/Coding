/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package string123.sorting.mergeSortingOfString;

import java.util.Arrays;

/**
 *
 * @author shash
 */
public class MerSorting {
    public static void main(String[] args) {
        String s="dcba";
        char [] arr=s.toCharArray();
        MerSorting m= new MerSorting();
  arr=    m.divideArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
       
    }
       char [] divideArray(char [] arr){
        if(arr.length<=1)
            return arr;
        
        
            int length=arr.length;
            int mid= length/2;
            char [] left=new char[mid];
            char [] right= new char[length-mid];
            for (int i = 0; i < mid; i++)
            {
                left[i]=arr[i];
                
            }
            int j=0;
            for (int i = mid; i < length; i++)
            {
               
                 right[j]= arr[i];
                 j++;
                
                
            }
            char [] leftSorted= divideArray(left);
            char[] rightSorted= divideArray(right);
              return merge(leftSorted,rightSorted);
            
        
        
        
    }
        static   char[] merge(char[] arr1,char[] arr2){
               int n1= arr1.length;
               int n2= arr2.length;
               char result [] = new char[n1+n2];
               int i,j,k;
               i=k=j=0;
               while(i<n1 && j<n2)
               {
                   if(arr1[i]>arr2[j])
                   {
                       result[k]=arr2[j];
                       j++;
                   }
                   else{
                       result[k]= arr1[i];
                       i++;
                   }
                   k++;
                   
               }
               while(i<n1){
                   result[k]=arr1[i];
                   i++;
                   k++;
               }
               while(j<n2)
               {
                   result[k]= arr2[j];
                   j++;
                   k++;
               }
               
               return result;
           }
        static void printArr( int [] arr){
            for(int no:arr)
            {
                System.out.print(no+" ");
            }
        }
    
}
