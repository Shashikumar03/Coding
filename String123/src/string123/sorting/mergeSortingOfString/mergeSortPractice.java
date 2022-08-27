

package string123.sorting.mergeSortingOfString;

public class mergeSortPractice {
    public static void main(String[] args) {
        mergeSortPractice mm= new mergeSortPractice();
        String s="this is a dog";
      String[] a=s.split(" ");
    a=    mm.divideArray(a);
    for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
    }
    String [] divideArray(String [] arr){
        if(arr.length==1) return arr;
        int length= arr.length;
        int mid= length/2;
        String [] left= new String [mid];
        String [] right= new String[length-mid];
        for (int i = 0; i < mid; i++) {
            left[i]= arr[i];
            
        }
        int j=0;
        for (int i = mid; i <length; i++) {
            right[j]=arr[i];
            j++;
            
        }
        String leftsorted[] = divideArray(left);
        String rightsorted[] = divideArray(right);
        return merge(leftsorted,rightsorted);
    }
    String [] merge(String arr1[], String arr2[]){
        int n1= arr1.length;
        int n2= arr2.length;
        String [] result = new String[n1+n2];
        int i,j,k;
        i=j=k=0;
        while(i<n1&& j<n2){
            
            if(arr1[i].compareTo(arr2[j])>0){
                result[k]=arr2[j];
                j++;
            }
            else{
                result[k]=arr1[i];
                i++;
            }
            k++;
        }
        while(i<n1){
            result[k]= arr1[i];
            i++;
            k++;
        }
        while(j<n2){
            result[k]= arr2[j];
            k++;
            j++;
        }
        return result;
        
    }
}
