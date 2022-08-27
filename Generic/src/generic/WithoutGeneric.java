/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package generic;

/**
 *
 * @author shash
 */
public class WithoutGeneric {

    public static void main(String[] args) {
        String [] str={"shashi","rahul","rishabh"};
        WithoutGeneric wg= new WithoutGeneric();
        wg.printArray(str);
        int [] array= {1,2,3,4,5};
        wg.printArray(array);
    }
    void printArray(String[] s){
        for (int i = 0; i <s.length; i++) {
            System.out.println(s[i]+" ");
            
        }
    }
    void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}
