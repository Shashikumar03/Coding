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
public class StringSortSelection {
    
    public static void main(String[] args) {
        
        
        String[] a= {"shashi","rishabh","kanu","rahul","parth"};
        int min; String temp=" ";
        for (int i = 0; i <a.length; i++) 
        {
             min =i;
            for (int j = i+1; j <a.length; j++)
            {
                if(a[j].compareTo(a[min])<0)
                {
                    min= j;
                }
                
            }
             
             temp=a[i];
             a[i]=a[min];
             a[min]=temp;
        }
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+" ");
            
        }
        System.out.println();
    }
    
}
