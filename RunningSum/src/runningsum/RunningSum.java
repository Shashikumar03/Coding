/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package runningsum;

/**
 *
 * @author shash
 */
public class RunningSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a={1,2,3,4};
        int[] arr= new int[a.length];
        arr[0]=a[0];
        for (int i = 1; i <a.length; i++)
        {
            for (int j = i; j <=i; j++)
            {
                arr[j]=a[i]+a[j-1];
                
            }
            System.out.println(arr[i]);
        }
        
    }
    
}
