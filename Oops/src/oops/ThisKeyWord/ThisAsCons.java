/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oops.ThisKeyWord;

import java.awt.BorderLayout;

/**
 *
 * @author shash 
 */
public class ThisAsCons {
    public ThisAsCons(){
        System.out.println("shashi");
    }
   static  void text(){
        ThisAsCons t= new ThisAsCons();
    }
    public static void main(String[] args) {
        text();
    }
}
