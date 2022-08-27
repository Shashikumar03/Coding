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
public class TowerOfHonoi {
    
    public static void main(String[] args) {
        int t11=10;
        int t12=11;
        int t13=12;
        int n=3;
        game(n,t11,t12,t13);
        
    }
    static void game(int n,int a1,int a2,int a3)
     {
         if (n==0)return;
         
       game(n-1,a1,a3,a2);
         System.out.println(n +" from " + a1 +" to "  + a2);
         game(n-1,a3,a2,a1);
         
    }
    
}
