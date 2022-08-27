
package recursion;


public class MonotonicArray {
    public static void main(String[] args) {
        int[] arr={-1,-2,-4,-5,-6};
        System.out.println(mono(arr));
    }
    static boolean mono(int [] arr){
        int flag=0;
        int count=0;
        for (int i = 1; i <arr.length; i++)
        {
            if(arr[0]<arr[i])
            {
                arr[0]=arr[i];
                flag = flag+1;
                if(flag== arr.length-1)
                {
                    return true;
                }
            }
            else if(arr[0]>arr[i])
            {
               arr[0]=arr[i];
               count= count+1;
               if(count==arr.length-1)
               {
                   return true;
               }
            }
            
        }
        return false;
    }
    
}
