
package myqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SimpleQueue {
    public static void main(String[] args) {
        Queue<Integer> al = new LinkedList<>();
        Stack<Integer> st= new Stack<>();
        for (int i = 0; i < 10; i++) {
            al.add(i);
        }
        for(int no:al){
        
            st.push(no);
        }
        while(!st.isEmpty()==true){
            System.out.print(st.pop()+" ");
            
        }
    }
    
}
