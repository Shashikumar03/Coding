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
public class Test1 {
     static int findExtra(int arr1[], 
                         int arr2[], int n)
    {
    for (int i = 0; i < n; i++)
        if (arr1[i] != arr2[i])
            return i;
    
    return n;
    }
    
    public static void main(String[] args)
    {
      int arr1[] = {2, 4, 6, 8,  10, 12, 13};
                     
        int arr2[] = {2, 4, 6, 8, 10, 12}; 
                     
        int n = arr2.length;
    
        // Solve is passed both arrays
        System.out.println(findExtra(arr1, arr2, n));
                                     
    }
}

