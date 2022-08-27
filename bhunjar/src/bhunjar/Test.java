/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bhunjar;

import java.util.Arrays;

/**
 *
 * @author shash
 */
public class Test {
    public static void main(String[] args) {
        int[] arr={0,1,1,0,0,0,1,1};
      
        int l = 0, h = arr.length - 1;
		while (l < h)
                {
			if (arr[l] == 0)
                        {
				l++;
				continue;
			}
			if (arr[h] == 1)
                        {
				h--;
				continue;
			}
			int temp = arr[l];
			arr[l] = arr[h];
			arr[h] = temp;
        
    }
                for (int i = 0; i < arr.length; i++) 
                {
                    System.out.print(arr[i]+" ");
            
        }
    
}
}
