/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collection;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


/**
 *
 * @author shash
 */
public class Collection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> ll= new LinkedList<>();
        List<Integer> al= new ArrayList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        al.add(1);
        al.add(2);
        al.add(3);
        System.out.println(al);
        System.out.println(ll);
        System.out.println(ll.size());
       ll.add(3, 5);
        System.out.println(ll);
        
      
    }
    
}
