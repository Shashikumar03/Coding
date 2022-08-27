/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exceptiondemo;

import java.io.FileInputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author shash
 */
public class ExceptionDemo {

  
    public static void main(String[] args) {
       
        ArrayList<Integer> al= new ArrayList<>();
        Stack<Integer> q= new Stack<>();
        al.add(1);
        al.add(5);
        q.add(3);
        q.add(5);
        System.out.println(q.pop());
        al.remove(0);
        
        System.out.println(al);
        
    }
    
    
}
