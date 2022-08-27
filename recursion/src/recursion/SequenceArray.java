
package recursion;


public class SequenceArray {
    public static void main(String[] args) {
         int [] arr ={1,5,4,6,-5,8};
         int n1= arr.length;
         int [] seq= {1,4,6,8};
         int n2= seq.length;
         check(arr,seq, n1,n2);
    }
    static void check(int[] arr,int[] seq,int n1,int n2){
        int j=0;
        int count=0;
        for (int i = 0; i < n2; i++) {
            for( ;j<arr.length;j++)
            {
               if(seq[i]==arr[j])
               { 
                   count = count+1;
                   if(count==n2)
                   {
                       System.out.println("found");
                       return;
                   }
                   j= j+1;
                   break;
               }
               
                  
            }//inner loop closed;
            
            if(j==arr.length && i<n2)
            {
                System.out.println("Not found");
                return;
            }
            
        }
      
    }
    
}
