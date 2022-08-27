/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operator;

/**
 *
 * @author shash
 */
public class Operator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a=5;
       int b=6;
       int c=a^b;// xor 
        System.out.println(c);
        int d= a&b;
        System.out.println(d);
        int e=a|b;
        System.out.println(e);
        int f=b>>1;// basically b is divided by 2;
        System.out.println(f);//basically mul by 2
        int g= b<<1;
        System.out.println(g);
        int no=7; 
        // using xor
        if((no^1)==no+1)
        {
            System.out.println(" even");
        }
        else System.out.println("odd");
        // using or
        if((no|1)==no+1) System.out.println("even");
        else System.out.println("odd");
        // using and operator
        if((no&1)==0)System.out.println("even");
        else
            System.out.println("odd");
        int a1=1010101;
        
    }
    
}
