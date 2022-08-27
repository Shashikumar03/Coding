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
public class StringShorting {
    
    public static void main(String[] args) {
        
        String[] a= {"shashi","parth","rahul","rishabh","amirul","kanu"};
        String temp;
        for (int i = 0; i < a.length; i++)
        {
            int flag=0;
            for (int j = 0; j < a.length-1-i; j++) 
            {
                if(a[j].compareTo(a[j+1])>0)
                {
                   temp=a[j];  
                   a[j]=a[j+1];
                   a[j+1]=temp;
                   flag=1;
                }
            }
            if(flag==0)
            {
                break;
            }
   
        }
           for (int i = 0; i <a.length; i++) 
               {
                   System.out.print(a[i]+" ");
               }
           System.out.println();
        
    }
    
}
