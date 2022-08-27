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
public class MinValue {
     
    public static void main(String[] args) {
        
        int[] a={10,50,40,70,90,5,100};
        int min=a[0];
        for (int i = 1; i <a.length-1; i++)
        {
          if(a[i]<min)
          {
              min=a[i];
          }
        }
        System.out.println(min);
    }
    
}
