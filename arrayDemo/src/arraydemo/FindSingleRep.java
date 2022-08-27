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
public class FindSingleRep {
    
    public static void main(String[] args) {
         int[] a={5,2,3,3,5,};
         int temp=a[0];
         for (int i = 1; i <a.length; i++)
         {
           temp= temp^a[i]; 
        }
         System.out.println(temp);
    }
    
}
