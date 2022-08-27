/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkingbreak;

/**
 *
 * @author shash
 */
public class Test1 {
    
    public static void main(String[] args) {
        int n=2;
        int rem=0;
       int  temp=0;
        while(n!=0)
        {
            rem=n%10;
            temp =temp+rem*rem;
            n=n/10;
        }
        System.out.println(rem+" "+ temp);
    }
    
}
