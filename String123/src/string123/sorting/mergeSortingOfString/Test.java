/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package string123.sorting.mergeSortingOfString;

import java.util.HashSet;

/**
 *
 * @author shash
 */
public class Test {
    public static void main(String[] args) {
        String s="aaabbbbccccagaaceeeggg";
        String s1="";
        boolean [] count=new boolean[26];
        for(char ch:s.toCharArray()){
            int a= (ch-'a');
            if(!count[a])
            {
                s1=s1+String.valueOf(ch);
                count[a]= true;
            }
        }
    
       System.out.println(s1);
        
        
    }
}