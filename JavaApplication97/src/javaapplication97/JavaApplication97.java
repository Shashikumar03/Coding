/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication97;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author shash
 */
public class JavaApplication97 {

    /**
     * @param args the command line arguments
     */
   public static void main(String [] args)
	{
		
		int [] arr= { 4,5 , 2, 25};
		
		Stack<Integer> st=new Stack<>();
		
		st.push(arr[arr.length-1]);
		
		arr[arr.length-1]=-1;
		
		for(int i=arr.length-2;i>=0;i--)
		{
			
			while(st.peek() <= arr[i] && st.size() >0)
			{
				int a=st.pop();
                                
			}
			
			if(st.size()==0)
			{
				arr[i]=-1;
				
			}
			
			else
			{
                               int temp=arr[i];
                               
                               
				arr[i]=st.peek();
                                st.push(temp);
				
			}
			
			
		}
		
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }
		
	}
    
}
