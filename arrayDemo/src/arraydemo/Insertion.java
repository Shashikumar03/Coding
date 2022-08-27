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
public class Insertion {
    
    public static void main(String[] args) {
        
        int[] a={5,7,6,2,4,3,1};
        int temp,j;
        for (int i = 1;i <a.length; i++) 
        {
            temp =a[i];
            j=i;
            while(j>0 && a[j-1]>temp)
            {
                a[j]=a[j-1];
                j=j-1;
                
            }
            a[j]=temp;
           
        }
        for (int i = 0; i <a.length; i++) 
        {
            System.out.print(a[i]+" ");   
        }
        System.out.println( );
    }
}
