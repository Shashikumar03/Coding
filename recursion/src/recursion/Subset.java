

package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;



public class Subset {
   
    public static void main(String[] args) {
       ArrayList<Integer> arr= new ArrayList<>();
       arr.add(2);
       arr.add(3);
       arr.add(5);
     int   n= arr.size();
     ArrayList<Integer> al= new ArrayList<>();
        ArrayList<Integer> al2= game(arr,0,n-1,0,al);
        int [] a= new int[8];
        for (int i = 0; i < al2.size(); i++) {
            
                a[i]= al2.get(i);
            }
       
       Arrays.sort(a);
       for(int no:a)
       {
           System.out.print(no+" ");
       }
}
    static ArrayList<Integer> game(ArrayList<Integer> arr,int l,int n, int sum,ArrayList<Integer> al){
        if(l>n)
        {
            al.add(sum);
           return al; 
        }
        game(arr, l+1, n, sum+arr.get(l),al);
        game(arr, l+1, n, sum,al);
       return al; 
    }
    
}
