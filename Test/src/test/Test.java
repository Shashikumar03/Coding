/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

/**
 *
 * @author shash
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int num=38;
       int temp=num;
       int rem=0;
       int flag=0;
       while(temp>9)
       {
          rem=temp%10;
          flag = flag+rem;
          temp=temp/10;
          
       }
      
        System.out.println(""+flag);
    }
    
}
