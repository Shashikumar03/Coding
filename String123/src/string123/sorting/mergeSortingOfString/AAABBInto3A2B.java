/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package string123.sorting.mergeSortingOfString;

/**
 *
 * @author shash
 */
public class AAABBInto3A2B {
    public static void main(String[] args) {
        String s="aaabbbbccccagaaceeeggg";
        int letters[]= new int[26];
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i)-'a']++;
        } String s3="";
        for (int i = 0; i < 26 ;i++) {
            for (int j = 0; j < letters[i]; j++) {
              String  s1=String.valueOf(letters[i]);
                String s2=String.valueOf((char)(i+'a'));
                System.out.println(s2);
                s3=s3+s1+s2;
                break;
            }
        }
        System.out.println(s3+" ");
      
    }
    
}
