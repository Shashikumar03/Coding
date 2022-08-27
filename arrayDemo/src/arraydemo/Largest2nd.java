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
public class Largest2nd { 
    
    public static void main(String[] args) {
        int[] a= {10,20,30,40,80,90,70};
        int largest = Integer.MIN_VALUE;
        int second_largest =Integer.MIN_VALUE;
        for (int i = 0; i <a.length; i++)
        {
         
            if( a[i]>largest)
            {
                second_largest=largest;
                largest =a[i];
            }
            else if (a[i]>second_largest && a[i]!=largest)
            {
                second_largest=a[i];
                
            }
        }
        System.out.println("2nd largest number is "+ second_largest);
    }
    
}
