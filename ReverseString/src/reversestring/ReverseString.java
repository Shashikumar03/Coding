/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reversestring;
 import java.util.Scanner;
/**
 *
 * @author shashi
 */
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String yn;
        do
        {
           
        System.out.println("plz write the name to be reversed");
        Scanner s= new Scanner(System.in);
        String name;
        name = s.next();
        
        int  lenght = name.length();
        String rev = "";
        for(int i=lenght-1;i>=0;i--)
        {
            rev = rev+name.charAt(i);
        }
        System.out.println(rev);
            System.out.println("do u want to comtinue (press y for yes and n  for no");
        yn = s.next();
        }
        while(yn.equals("y")|| yn.equals("Y") );
    }
    
}
