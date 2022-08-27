/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fibobyrecursion1;

/**
 *
 * @author shash
 */
public class FiboByRecursion1 {

    /**
     * @param args the command line arguments
     */
    static int a=0,b=1,c;
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(a);
        System.out.println(b);
        FiboByRecursion1 r1 =new FiboByRecursion1();
        r1.printFab(10);
    }
    void printFab( int i)
    {
        if(i>=1)
        {
            c= a+b;
            System.out.println("" +c);
            a=b;
            b=c;
            printFab(i-1);
        }
    }
}
