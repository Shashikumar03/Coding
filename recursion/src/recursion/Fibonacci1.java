/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursion;

/**
 *
 * @author shash
 */
public class Fibonacci1 {
    
    static int a=0,b=1,c;
    public static void main(String[] args) {
        System.out.print(a+" "+b+" ");
        Fibonacci1 f1= new Fibonacci1();
        f1.printFibo(10);
    }
    static int printFibo(int n)
    { if (n>=1)
    {
        c=a+b;
        System.out.print(c +" ");
        a=b;
        b=c;
     printFibo(n-1);
     }
    return c;
    } 
    
}
