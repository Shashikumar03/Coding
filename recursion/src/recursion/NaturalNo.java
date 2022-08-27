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
public class NaturalNo {
   
    public static void main(String[] args)
    {
       
        int no=5;
       NaturalNo nn= new NaturalNo();
        System.out.println(naturalNo1(no));
       
    }
    static int naturalNo1(int n)
    {
        if(n==0)
            return 1;
        
       naturalNo1(n-1);
        System.out.println(n);
      
       return n;
    }
    
    
}
