/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package addtobinaryno;



/**
 *
 * @author shash
 */
public class AddToBinaryno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      
        String x=  "1011";
       
       String y=  "1111";
        int a= Integer.parseInt(x, 2);
        int b= Integer.parseInt(y, 2);
        int c= a+b;
        int d=100;
        System.out.println(""+Integer.toBinaryString(d));
        System.out.println("sum :"+Integer.toBinaryString(c));
    }
    
}
