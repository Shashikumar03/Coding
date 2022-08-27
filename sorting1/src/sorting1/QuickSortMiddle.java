/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sorting1;

/**
 *
 * @author shash
 */
public class QuickSortMiddle {
    
    public static void main(String[] args) {
        int[] arr={15,9,7,13,12,16,4,18,11};
        int length=arr.length;
        QuickSortMiddle qm= new QuickSortMiddle();
        qm.qickSortRecursion(arr,0,length-1);
        qm.printArray(arr);
    }
    int partition(int[] arr,int low,int high){
        int pivot=arr[(low+high)/2];
        while(low<high){
            
            while(arr[low]<pivot){
                low++;
            }
            while(arr[high]>pivot)
            {
                high--;
            }
            if(low<=high){
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
            
        }
        return low;
    }
    void qickSortRecursion(int[] arr,int low,int high){
        int pi=partition(arr,low,high);
        if(low<pi-1)
        {
            qickSortRecursion(arr, low, pi-1);
        }
        if(pi<high)
        {
            qickSortRecursion(arr, pi, high);
        }
    }
    void printArray(int [] arr){
        for(int n:arr)
        {
            System.out.print(n+" ");
        }
    }
    
}
