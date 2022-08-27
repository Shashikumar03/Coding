/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraydemo;


import java.util.Arrays;

/**
 *
 * @author shash
 */
public class Test3 {
    public static void main(String[] args) {
         int[] a={5, 8, 10,};
          int max = Arrays.stream(a).max().getAsInt();
          int sum= Arrays.stream(a).sum();
          int min=Arrays.stream(a).min().getAsInt();
         
          System.out.println(max);
          System.out.println(sum);
          System.out.println(min);
    }
    
}
