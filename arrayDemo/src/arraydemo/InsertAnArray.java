/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraydemo;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author shash
 */
public class InsertAnArray {
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) 
        {
            a[i]= sc.nextInt();
            
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) 
        {
            System.out.println(a[i]);
            
        }
    }
    
}
