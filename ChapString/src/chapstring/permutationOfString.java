/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapstring;

/**
 *
 * @author shash
 */
public class permutationOfString 
{
    public static void main(String[] args) {
        String str="abc";
        per(str,"");
    }
    public static void per(String str, String asf)
    {
        if(str.length()==0)
        {
            System.out.println(asf);
        }
        for (int i = 0; i < str.length(); i++) 
        {
            char ch=str.charAt(i);
            String l=str.substring(0,i);
            String r=str.substring(i+1);
            String ros=l+r;
            per(ros,asf+ch);
        }
        
    }
    
}
