/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursion;

/**
 *
 * @author shash
 */
public class ArrayReprensentation {
    
    public static void main(String[] args) {
        int [] arr={1,2,5,6,4};
        int index= 0;
        game(arr,index);
        
    }
    static void game(int [] arr,int index){
        if(index>arr.length-1)return ;
        System.out.print(arr[index]+" ");
        game(arr,index+1);
        
    }
    
}
