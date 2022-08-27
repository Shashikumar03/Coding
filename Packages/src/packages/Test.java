/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package packages;
 
import package1.Shashi;
public class Test {

    
    public static void main(String[] args) {
       
       Shashi s= new Shashi("shashi");
       Shashi s2= new Shashi("kumar");
     String s1= s.getName();
        System.out.println(s1);
        System.out.println(s.getName());
    }
    
}
