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
public class MaxValue {
    
    public static void main(String[] args) {
        
        int[] a={10,20,50,40,5,100,90,80};
        int max=a[0];
        for (int i = 1; i <a.length; i++)
        {
            if(max<a[i])
            {
                max=a[i];
                
            }
        }
        System.out.println(max);
    }
}
