/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package queue;

/**
 *
 * @author shash
 */
public class Stack {
    public static void main(String[] args) {
        Stack1 s= new Stack1();
        s.push(5);
        s.push(6);
        s.push(7);
      //  s.push(10);
        System.out.println(s.pop());
        
       boolean  b=  s.isEmpty();
        System.out.println(b);
    }
    
}
