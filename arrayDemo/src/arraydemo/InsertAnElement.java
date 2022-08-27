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
public class InsertAnElement {
    
    public static void main(String[] args) {
        
        int[] a={10,20,30,40,50};
        int pos=3;
        int element=100;
        for (int i =a.length-1; i > pos-1; i--)
        {
            a[i]=a[i-1];
            
        }
        a[pos-1]=element;
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+" "); 
        }
        System.out.println();
    }
    
}
