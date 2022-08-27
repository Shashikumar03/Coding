/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package generic;

/**
 *
 * @author shash
 */
public class WithGeneric {  
    
   public <E> void printArray(E[] s){
        for (int i = 0; i <s.length; i++) {
            System.out.print(s[i]+" ");
            
        }
    }
    public static void main(String[] args) {
        Integer [] a= {1,2,3,4,5};
        String[] s= {"shashi","rishabh","sunil"};
        WithGeneric g= new WithGeneric();
        g.printArray(s);
        g.printArray(a);
    }
    
}
