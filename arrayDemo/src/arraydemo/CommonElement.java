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
public class CommonElement {
    
    public static void main(String[] args) {
        
        int[] a1={1,2,3,4,5};
        int[] a2={3,4,5,6,7};
        System.out.println("common element is");
        for (int i = 0; i <a1.length; i++)
        {
            for (int j = 0; j <a2.length; j++)
            {
             
                if(a1[i]==a2[j])
                {
                    System.out.print(a1[i]+" ");
                }
            }
            
        }
    }
    
}
