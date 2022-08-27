/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package generic;

import java.awt.BorderLayout;

/**
 *
 * @author shash
 */
public class GenericClass <E,T>{
    
    void print (E val1 ,T val2){
        System.out.println(val1+" "+val2);
    }
    public static void main(String[] args) {
        GenericClass<String ,Integer> gc= new GenericClass<>();
        
    }
}
