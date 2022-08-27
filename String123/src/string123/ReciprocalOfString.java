

package string123;

import java.util.ArrayList;
import java.util.Arrays;


public class ReciprocalOfString {
    
    public static void main(String[] args) {
       int [] arr={-1,2,5,-8,4,3,1}; int min;
       String s= "shashi";
     
        for (int i = 0; i < arr.length-1; i++) {
            min=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min]>arr[j]){
                    min=j;
                }
                
            }
            
           int temp=arr[i];
           arr[i]= arr[min];
           arr[min]= temp;
        }
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        check1(s);
          }
    static  void check1(String s){
        int min1;
         char [] arr1=s.toCharArray();
        for (int i = 0; i < arr1.length-1; i++) {
            min1=i;
            for (int j = i+1; j < arr1.length; j++) {
                if(arr1[min1]>(arr1[j])){
                    min1=j;
                }
                
            }
            
           char temp=arr1[i];
           arr1[i]= arr1[min1];
           arr1[min1]= temp;
        }
        for (int i = 0; i <arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}