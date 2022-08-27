
package linklist1;

import java.util.TreeMap;




public class LinkList1 {

    public static void main(String[] args) {
      int [] arr={1,3,5,7};
    int a=  maximizeSum(arr,4);
        System.out.println(a);
      
    }
     public static int maximizeSum (int arr[], int n) {
        TreeMap<Integer, Integer> hm= new TreeMap<>();
     for(int no:arr){
         if(hm.containsKey(no))
         {
             hm.put(no,hm.get(no)+1);
             
         }
         else
         hm.put(no,1);
     }
     int sum=0;
         for(int no:arr){
             if(hm.containsKey(no-1)){
                sum= sum+no;
                   hm.put(no-1,hm.get(no-1)-1);
                   hm.put(no,hm.get(no)-1);
               }
             }
         
         int sum1=0;
         for(int no:hm.keySet())
         {
             sum1= sum1+ no*hm.get(no);
         }
         return sum+sum1;
    }
    
    
    
}
