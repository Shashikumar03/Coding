/*
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
public class Leetcode {
  
    
    public static void main(String[] args) {
        int[] candies ={1,2,5,7,8,3};
        int max=0;
        for(int i:candies)
        {
            if(i>max)
            {
                max=i;
            }
        }
        System.out.println(max);
    }
    
}
