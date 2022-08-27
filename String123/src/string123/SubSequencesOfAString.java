/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package string123;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author shash
 */
public class SubSequencesOfAString {
    static ArrayList<String> al= new ArrayList<>();
   static int count=0;
    public static void main(String[] args) {
        String s="abc";
        String psf="";
        print(s,psf);
        Collections.sort(al);
        System.out.println(al);
    }
    static void print(String s,String psf){
        if(s.length()==0)
        {
            //System.out.print(psf+",");
            al.add(psf);
            count++;
            return;
        }
        
            char ch=s.charAt(0);
            String rs=s.substring(1);
            print(rs, psf+ch);
            print(rs, psf+"");
            
            
        
    }
    
}
