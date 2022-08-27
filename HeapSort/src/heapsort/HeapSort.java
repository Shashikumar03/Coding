/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package heapsort;



/**
 *
 * @author shash
 */
public class HeapSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[] arr= {5,1,4,10,50,30,3};
      HeapSort hs= new HeapSort();
     hs.sort(arr);
     hs.printArray(arr);
       
    }
    void sort( int [] arr){
        int len= arr.length;
        for(int i=len/2-1;i>=0;i--){
            heapify(arr,len,i);
        }
      for(int i= len-1;i>=0;i--){
          int temp=arr[i];
          arr[i]= arr[0];
          arr[0]=temp;
          heapify(arr,i,0);
      }
        
    }
     void heapify(int[] arr,int len,int i){
         int largest=i;
         int l= 2*i+1;
         int r=2*i+2;
         if(l<len && arr[l]>arr[largest]){
             largest =l;
         }
         if(r<len&& arr[r]>arr[largest]){
             largest=r;
         }
         if(largest!=i){
             int temp= arr[largest];
             arr[largest]=arr[i];
             arr[i]= temp;
             heapify(arr,len,largest);
         }
        
    }
     void printArray(int[] arr){
         
         for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i]+" ");
             
         }
     }
    
}
