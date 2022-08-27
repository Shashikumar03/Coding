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
public class Test102 {
    
    public static void main(String[] args) {
      add(6);
  int a=50;
  int b=100;
  int c= b++;
  int d= ++a;
        System.out.println(c+" "+d);
        System.out.println(a+" "+b);
        
    }
   static  int add(int n){
         if(n==0)return 8;
           System.out.println(n);
         add(n-1);
         return n;
       
        
     }
}
