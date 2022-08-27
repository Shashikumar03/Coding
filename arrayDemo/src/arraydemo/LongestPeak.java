

package arraydemo;

import java.util.ArrayList;


public class LongestPeak {
    public static void main(String[] args) {
        int [] a= {1,2,3,3,4,0,10,6,5,-1,-2,2,3};
        int n= a.length;
        peak(a,n);
    }
    static int peak(int[] a,int n){
        ArrayList<Integer> al= new ArrayList<>();
        for (int i = 1; i < n-1; i++) {
            if(a[i]>a[i+1] && a[i]>a[i-1])
            {
                al.add(i);
            }
            
            
        }
        System.out.println(al);
      
      
      return 1;
    }
   
    
    
}
