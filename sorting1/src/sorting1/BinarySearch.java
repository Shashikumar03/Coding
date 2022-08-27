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
public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        search(arr, 3);
    }
    public static void search(int[] arr,int item){
       
        int l= 0;
        int r=arr.length-1;
        while(l<=r){
          int   mid= (l+r)/2;
            if(arr[mid]== item) 
            {
                System.out.println(" item is present at index "+mid);
                return;
            }
            if(arr[mid]>item)
            {
                r=mid-1;
            }
            else if(arr[mid]<item)
            {
                l= mid+1;
            }
           
        }
        System.out.println("not found");
        
    }
    
}
