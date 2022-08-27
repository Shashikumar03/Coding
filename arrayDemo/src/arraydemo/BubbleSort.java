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
public class BubbleSort {
    
    public static void main(String[] args) {
        int [] arr={-5,1,5,0,2,3,4};
        int n= arr.length;
        
        for (int i = 0; i <n; i++)
        { 
            int flag=0;
            for (int j = 0; j < n-1-i; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    flag=1;
                   
                    
                }
                
                
            }
            if(flag==0)break;
        }
        for( int no:arr)
        {
            System.out.print(no+" ");
        }
    }
    
}
