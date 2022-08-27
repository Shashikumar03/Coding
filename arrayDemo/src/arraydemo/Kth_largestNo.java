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
public class Kth_largestNo {
    
    public static void main(String[] args) {
        int[] a={1,20,50,30,3,55,80,90,10};
        int temp;
        int k=4;
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i+1; j < a.length; j++) 
            {
             if(a[j]>a[i]) 
             {
                 temp=a[i];
                 a[i]=a[j];
                 a[j]=temp;
             } 
            }
            if(i==k-1)
            {
                System.out.println("kth largest no. is "+a[i] );
                break;
            }
            
          
        }
        System.out.println("-----------------------");
        for (int i = 0; i < a.length; i++) 
        {
            System.out.print(a[i]+" ");   
        }
        
    }
    
}
