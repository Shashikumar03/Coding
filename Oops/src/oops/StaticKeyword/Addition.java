/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oops.StaticKeyword;

/**
 *
 * @author shash
 */
public class Addition {
     static int count=0;

     Addition() {
        this.count++;
        System.out.println(count);
    }
    public static void main(String[] args) {
        Addition a3= new Addition();
         Addition a1= new Addition();
          Addition a2= new Addition();
           Addition a4= new Addition();
    }
    
}
