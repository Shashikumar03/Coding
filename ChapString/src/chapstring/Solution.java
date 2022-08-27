/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapstring;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shash
 */
public class Solution 
{  static List<List<Integer> > al = new ArrayList<List<Integer> >();
    public static void main(String[] args) 
    {
        int nums[]={1,2,3};
        permute(nums);
        for (int i = 0; i <al.size(); i++)
        {
            for (int j = 0; j < al.get(0).size(); j++)
            {
                System.out.print(al.get(i).get(j));
            }
            System.out.println("");
        }
    }
  
    public  static List<List<Integer>> permute(int[] nums)
    {
      
       
     int box[] = new int[nums.length];
         Ans(nums, box,0);
         
        return al;
    }
    public static List<List<Integer>> Ans(int [] nums,int [] box,int ci)
    {
        if(ci==nums.length)
        {
            List<Integer> al1= new ArrayList<>();
            for(int i=0;i<box.length;i++)
            {
                if(box[i]==-11)
                {
                    al1.add(0);
                }
                else
                al1.add(box[i]);
            }
            al.add(al1);
            return al;
        }
        for(int i=0;i<nums.length;i++)
        {
           
            if(box[i]==0)
            {
                
                if(nums[ci]==0)
                {
                   box[i]=-11; 
                }
                else
                  box[i]=nums[ci];
                
                Ans(nums,box,ci+1);
                box[i]=0;
                
            }
        }
        return al;
        
    }
    
}
