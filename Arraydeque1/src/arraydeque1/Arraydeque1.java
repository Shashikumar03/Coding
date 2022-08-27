/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraydeque1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//import javafx.scene.shape.QuadCurve;

/**
 *
 * @author shash
 */
public class Arraydeque1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
         ArrayDeque<Integer> ad= new ArrayDeque<>();
         ad.add(1);
         ad.add(2);
         ad.addFirst(3);
         ad.addLast(5);
         int n=ad.getLast();
         ad.removeFirst();
         System.out.println(n);
         System.out.println(ad);
       
         
    }
    
}
