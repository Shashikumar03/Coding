
package arraydemo;

import java.util.Arrays;


public class ThreeNumberSum {
    public static void main(String[] args) {
        int[] arr= {12,3,1,2,-6,5,-8,6};
       int n= arr.length;
     
       Arrays.sort(arr);
       for(int no:arr)
       {
           System.out.print(no+" ");
       }
        System.out.println();
       int k=0;
        sum(arr,k);
    }
    static void sum(int [] arr,int tarValue ){
        int sum=0;
        int current=0;
        int right = arr.length-1;
        int left=current+1;
          while(current<right-1)
        {
            sum= arr[current]+arr[left]+arr[right];
            
            if(sum>tarValue)
            {
             right=right-1;
            }
            else if(sum<tarValue)
            {
             left= left+1;
            }
            
            else 
            {
                System.out.println(sum+" "+arr[current]+" "+ arr[left]+" "+arr[right]);
                left=left+1;
                right= right-1;
            }
            if(left>=right){
                current= current+1;
                left= current+1;
                right=arr.length-1;
            }
            
        }
    }
    
}
