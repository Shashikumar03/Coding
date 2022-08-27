
package sorting1;


public class SelectionSort {
    public static void main(String[] args) {
        int[] a= {50,1,5,9,100,4,1001,20,80,2};
        int min;
        int temp=0;
        int n=a.length;
        for (int i = 0; i <n; i++) {
             min =i;
            for (int j = i+1; j < n; j++) {
                if(a[j]<a[min])
                {
                    min =j;
                }
                
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
            
            
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
            
        }
    }
    
}
