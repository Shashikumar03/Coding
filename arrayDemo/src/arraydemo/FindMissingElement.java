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
public class FindMissingElement {
    
    public static void main(String[] args) {
        
        int[] a= {1,2,3,4,6,5,8,7,10,11,12};
        int xor1=a[0];
        int xor2=1;
        for (int i = 1; i <a.length; i++)
        {
            xor1= xor1^a[i];
            
        }
        for (int i = 2; i <=(a.length+1); i++) 
        {
          xor2 =xor2^i;   
        }
        System.out.println(xor1^xor2);
        
    }
}
