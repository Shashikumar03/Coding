
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package string123;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

/**
 *
 * @author shash
 */
public class NewClass {
    public static void main(String[] args) {
       
    
       int arr[]={1,3,4,2,2};
        int a=findDuplicate(arr);
        System.out.println(a);
    }
     public static  int findDuplicate(int[] nums) {
        
        for(int n:nums)
        {
            if(nums[Math.abs(n)]<0)
                return Math.abs(n);
            else
            {
                nums[Math.abs(n)]*=-1;
            }
            
        }
        return -1;
    }
}
