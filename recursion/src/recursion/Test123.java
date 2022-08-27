
package recursion;
public class Test123 {
    
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,3,5,7,6};
        int k=3;
       
        System.out.println( game(arr,0,k));
        
    }
    static int game(int [] arr, int n,int k){
        if(n==arr.length)return -1;
   int fii = game(arr,n+1,k);
   if(fii==-1)
   {
       if(arr[n]==k)
           return n;
       else
           return -1;   
   }
        else 
            return  fii;
    }
    
}
