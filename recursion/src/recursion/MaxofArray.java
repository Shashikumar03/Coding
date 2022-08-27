/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursion;

/**
 *
 * @author shash
 */
public class MaxofArray {
    static int sum =0;
    public static void main(String[] args) {
        int[] arr= {1,2,3,1000,500};
        int index=arr.length-1;
        System.out.println(max(arr,0));
    }
    static int max(int [] arr,int index){
          
        if(index==arr.length-1)
            return arr[index];
      
       
      int a=  max(arr,index+1);
       if(arr[index]>a)
        {
            return arr[index];
        }
       
    return a;
    }
   
}
