/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkingbreak;

/**
 *
 * @author shash
 */
public class Test {
    
    public static void main(String[] args) {
        int[] a= {0,1,2,5,4,6};
        int exp_elem =a.length;
        int total_sum=(exp_elem*(exp_elem+1))/2;
        for (int i = 0; i <a.length; i++)
        {
            total_sum=total_sum-a[i];
            
        }
        System.out.println(" "+total_sum);
        
        
        
        
    }
}
