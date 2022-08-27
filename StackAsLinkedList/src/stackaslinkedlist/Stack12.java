
package stackaslinkedlist;


import java.util.LinkedList;
import java.util.Stack;

public class Stack12 {
    public static void main(String[] args) {
        LinkedList<Integer> st= new LinkedList<>();
     int [] a={1,2,3,4,5};
        for (int i = 0; i < a.length; i++) {
            st.push(a[i]);
            
        }
        System.out.println(st);
    }
    
}
