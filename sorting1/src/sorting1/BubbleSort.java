/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sorting1;

/**
 *
 * @author shash
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a={36,19,100,29,12,5};
        int n=a.length;
        for (int i = 0; i < n; i++) {
            int flag=0;
            for (int j = 0; j < n-1-i; j++) {
                if(a[j]>a[j+1])
                {
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                    flag=1;
                }
                
                
            }
            if(flag==0)
                {
                    break;
                }
            
        }
        for (int j = 0; j < n; j++) {
                System.out.print(a[j]+" ");
                
            }
    }
    
}
