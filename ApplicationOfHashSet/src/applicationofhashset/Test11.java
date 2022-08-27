/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package applicationofhashset;
import java.util.Arrays;

import java.util.stream.IntStream;
/**
 *
 * @author shash
 */
public class Test11 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        IntStream a=Arrays.stream(arr,1,3);
        a.forEach(str -> System.out.print(str + " "));
    }
    
}
