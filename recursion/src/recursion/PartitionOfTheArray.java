
package recursion;

import java.util.ArrayList;


public class PartitionOfTheArray {
    public static void main(String[] args) {
        int[] array={2,1,2,3,4,8};
        int sum=0;
        for (int i = 0; i < array.length; i++)
        {
            sum= sum+array[i];
            
        }
        ArrayList<Integer> al= new ArrayList<>();
        boolean isPossible = sum%2==0 && partition(array,sum/2,0,al);
        if(isPossible){
            for(int e:al)
            {
                System.out.print(e+" ");
            }
        }
        else 
            System.out.println("not Possible");
        
    }
    static boolean partition(int[] array,int sum,int i,ArrayList<Integer> al){
        if(i>=array.length) return false;
        if(sum==0)return true;
        al.add(array[i]);
        boolean leftPossible = partition(array, sum-array[i], i+1, al);
        if(leftPossible)
            return true;
        // backtracking
        al.remove(al.size()-1);
        return partition(array, sum, i+1, al);
        
    }
    
}
