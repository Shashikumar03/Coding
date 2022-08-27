

package arraydemo;


public class Selectionsort {
    public static void main(String[] args) {
        
        int [] arr= {5,2,-1,6,3};
       int n=arr.length;
        for (int i = 0; i < n-1; i++)
        {
            int min=i;
            for (int j = i+1; j < n; j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
                
            }
                    int temp=arr[i];
                    arr[i]=arr[min];
                    arr[min]=temp;
            
        }
        for(int no:arr)
        {
            System.out.print(no+" ");
        }
    }
    
}
