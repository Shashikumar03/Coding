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
public class InsertionSort {
    public static void main(String[] args) {
        int[] a= {14,12,16,6,3,10};
        int c=0;
        int n= a.length;
        int temp,j;
        for (int i = 1; i < n; i++)
        {
            temp=a[i];
            j=i;
            while(j>0 && a[j-1]>temp)
            {
                a[j]=a[j-1];
                j--;
                c++;
            }
            a[j]=temp;
        }
        for (int i = 0; i < n; i++)
        {
           // System.out.print(a[i]+" ");
            
        }
        System.out.println(c);
    }
    
}
