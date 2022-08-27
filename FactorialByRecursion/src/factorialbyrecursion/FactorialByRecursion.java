/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factorialbyrecursion;

/**
 *
 * @author shash
 * 
 */

public class FactorialByRecursion {

    /**
     * @param args the command line arguments
     */
    static int fact=1; 
    static int no= 5;
    public static void main(String[] args) {
        // TODO code application logic here
        int no= 5;
        FactorialByRecursion r= new FactorialByRecursion();
           r.calFact(no);
           System.out.println("factorial of "+ no+ " is "+fact);
        
        
    }
    void calFact(int no)
    {
        if(no>=1)
        {
        fact = fact*no;
            calFact(no-1);
        }
        
    }
}
