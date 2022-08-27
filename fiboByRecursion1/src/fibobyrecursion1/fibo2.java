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
public class fibo2 
{
    static int a=0;
    static int b=1;
    public static void main(String[] args) 
    {
        System.out.println(0);
        System.out.println(1);
        fin(2);
    }
    static void fin(int n)
    {
        if(n>4)
        {
           // System.out.println(a);
            return ;
        }
            int c=a+b;
            a=b;
            b=c;
            System.out.println(c);
            fin(n+1);
        
    }
}
