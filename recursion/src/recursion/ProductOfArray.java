

package recursion;


public class ProductOfArray {
    public static void main(String[] args) {
        int[] a= {1,5,8,9};
    int n= a.length;
    product(a,n);
   
    
    }
    static void product( int [] a,int n){
        int[] arr= new int[n];
        
        for (int i = 0; i <n; i++)
        {
            int pro= 1;
            for (int j = 0; j <n; j++)
            {
                if(i!=j)
                {
                    pro=pro*a[j];
                }
                
            }
            arr[i]=pro;
            
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
            
        }
    }
}
