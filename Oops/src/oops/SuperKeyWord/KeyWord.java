/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oops.SuperKeyWord;

import java.awt.BorderLayout;

/**
 *
 * @author shash
 */
public class KeyWord {
    
   int a=10;
   
   
    public static void main(String[] args) {
      Test t= new Test();
      t.display(30);
    }
}
 class Test extends KeyWord{
  int a=20;
  void display(int x){
      System.out.println(super.a);//10
      System.out.println(this.a);//20
       System.out.println(x);//30
       
       
  }
}