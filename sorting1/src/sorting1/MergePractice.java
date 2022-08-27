

package sorting1;

public class MergePractice {
    public static void main(String[] args) {
        int[] arr= {5,4,3,-5,2,1};
        MergePractice m= new MergePractice();
     int [] a=   m.mergeSort(arr,0,arr.length-1);
        m.printArr(arr);
        System.out.println(" ");
        System.out.println("sorted array is");
       m.printArr(a);  
        
    }
     int [] mergeSort(int[] arr,int start,int end){
        if(start==end)
        {
            int[] ba= new int[1];
            ba[0]=arr[start];
            return ba;
        }
        int mid=(start+end)/2;
            int [] leftSorted= mergeSort(arr,start,mid);
            int[] rightSorted= mergeSort(arr,mid+1,end);
              return mergetwoSortedArray(leftSorted,rightSorted);
            
        
        
        
    }
        static   int[] mergetwoSortedArray(int[] arr1,int[] arr2){
               int n1= arr1.length;
               int n2= arr2.length;
               int result [] = new int[n1+n2];
               int i,j,k;
               i=k=j=0;
               while(i<n1 && j<n2)
               {
                   if(arr1[i]>arr2[j])
                   {
                       result[k]=arr2[j];
                       j++;
                   }
                   else{
                       result[k]= arr1[i];
                       i++;
                   }
                   k++;
                   
               }
               while(i<n1){
                   result[k]=arr1[i];
                   i++;
                   k++;
               }
               while(j<n2)
               {
                   result[k]= arr2[j];
                   j++;
                   k++;
               }
               
               return result;
           }
        static void printArr( int [] arr){
            for(int no:arr)
            {
                System.out.print(no+" ");
            }
        }
    
}
