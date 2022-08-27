/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraydemo;

/**
 *
 * @author shash
 */
public class BinarySearch {
    
    public static void main(String[] args) {
        
        int[] arr= {1,2,3,4,5,6,7,8,9};
        int li = 0;
        int hi=arr.length-1;
        int mi =( hi+li)/2;
        int search=10;
        while (li<=hi)
        {
            if(arr[mi]== search)
            {
                System.out.println(" item is at "+mi+" index position");
                break;
                
            }
            else if(arr[mi]<search)
            {
                li= mi+1;
            }
            else
            {
                hi= mi-1;
            }
            mi= (hi+li)/2;
            
        }
        if (li>hi) 
        {
        
            System.out.println("element not found");
        }
    }
    
}
