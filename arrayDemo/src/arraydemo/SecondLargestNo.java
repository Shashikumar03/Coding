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
public class SecondLargestNo {
    
    public static void main(String[] args) {
         int temp;
        int[] a={10,20,50,40,70,30,60};
        
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i+1; j <a.length; j++) 
            {
              if(a[i]<  a[j])
              {
                  temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
              }
                  
            }
            
        }
        System.out.println(a[1]);
        
        System.out.println("----------");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        
    }
    
}
