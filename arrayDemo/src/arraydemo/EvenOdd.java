/*,,,,
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraydemo;

import java.util.ArrayList;

/**
 *
 * @author shash
 */
public class EvenOdd {
    
    public static void main(String[] args) {
        
        int[] a={1,2,5,4,6,8,9,16,40,55,44};
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer>al2=new ArrayList<>();
        int total1=0;
        int total2=0;
        for (int i = 0; i <a.length;i++)
        {
            if (a[i]%2==0)
            {
                al1.add(a[i]);
            }
            else
            {
                al2.add(a[i]);
            }
            
        }
        System.out.println("even no are");
        for( int no1:al1)
        {
            total1= total1+no1;
            System.out.print( no1+" ");
           
        }
        System.out.println();
        System.out.println("sum of even no is " + total1);
        System.out.println();
        System.out.println("odd no are");
        
            for(int no2:al2)
            {
                total2= total2+no2;
                System.out.print(no2+" ");
            }
            System.out.println();
            System.out.println("sum of odd no is " + total2);
            System.out.println();
        
        
         
    }
   
}
