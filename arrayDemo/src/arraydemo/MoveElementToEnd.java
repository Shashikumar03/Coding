

package arraydemo;

import java.util.Arrays;
import java.util.HashSet;

public class MoveElementToEnd {
    
    public static void main(String[] args) {
        int[] array= {2,1,2,4,2,3,2,2,7,8,9,2};
        last(array);
        
    }
    static int[] last(int[] array){
        int temp = 0;
        int[] arr= new int[array.length];
        HashSet<Integer> hs= new HashSet<>();
        for (int i = 0; i < array.length; i++) 
        {
            hs.add(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            
        
            if(hs.contains(array[i]))
            {
                temp =array[i];
                break;
                
               
            }
        }
        
      
        int j=0;
        for (int i = 0; i < array.length; i++) 
        {
           if(temp!=array[i]&& j<array.length)
           {
                  
               arr[j]=array[i];
               j++;
           }

        }
       
        for(int i=0;i<array.length;i++)
        {
            if(array[i]== temp && j<array.length)
            {
                arr[j]=temp;
                j++;
            }
        }
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(arr[i]+" ");
            
        }
       
    return arr;
    } 
}
