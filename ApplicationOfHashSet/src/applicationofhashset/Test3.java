/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package applicationofhashset;

import java.awt.BorderLayout;
import java.util.ArrayList;

/**
 *
 * @author shash
 */
public class Test3 {
    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(5);
        al.add(6);
        al.add(7);
        for (int i = 0; i < al.size(); i++)
        {
            System.out.print(al.get(i)+" ");   
        }
    }
    
}
