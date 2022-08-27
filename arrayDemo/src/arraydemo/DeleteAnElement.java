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
public class DeleteAnElement {
    
    public static void main(String[] args) {
        
        int[] a={10,20,30,40,50,60};
       int del_element=30;
        for (int i = 0; i <a.length; i++)
        {
            if(del_element==a[i])
            {
                for (int j = i; j <a.length-1; j++)
                {
                  
                    a[j]=a[j+1];
                }
                    break;
                
            }
            
            
        }
        for (int i = 0; i <a.length-1; i++) 
        {
            System.out.print(a[i] +" ");
            
        }
    }
    
}
