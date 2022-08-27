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
public class Insertion1 {
    public static void main(String[] args) {
        int[] arr={5,7,6,2,4,3,1};
       
        for (int i = 1; i < arr.length; i++)
        {
            int temp=arr[i];
            int j=i;
            while(j>0 && arr[j-1]>temp)
            {
                arr[j]=arr[j-1];
                j= j-1;
                
            }
            
            arr[j]=temp;
            
            
        }
        
        for(int no:arr)
        {
            System.out.print(no+" ");
        }
    }
    
}
