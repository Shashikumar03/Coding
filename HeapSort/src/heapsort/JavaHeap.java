/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package heapsort;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 *
 * @author shash
 */
public class JavaHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        int[] arr={5,4,7,8,1,5,7,8,9,10,15,22,-100,85};
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            
        }
        System.out.println(pq.peek());
   }
    
}
