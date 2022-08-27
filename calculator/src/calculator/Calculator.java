/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;
import java.util.Scanner;


/**
 *
 * @author shash
 */
public class Calculator {
   
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String yn;
        do
        {
            
        
         int no1,no2;
    Scanner s= new Scanner(System.in);
        System.out.println(" enter he 1st no");
    no1= s.nextInt();
        
   
        System.out.println(" enter the 2nd no");
        no2 = s.nextInt();
        System.out.println(" choose the sysmbol ( +,-,/,*)");
        int res;
        String symbol = s.next();
        switch(symbol)
        {
            case "+": res= no1+ no2;
                System.out.println("addition is "+res);
                break;           
                case"-": res= no1-no2;
                    System.out.println("subtraction is "+ res);
                    break;
                    case"*":res = no1*no2;
                        System.out.println("multipliction is "+ res);
                        break;
                        case"/":res = no1/no2;
                            System.out.println("division is "+res);
                            break;
                          default:
                              System.out.println("error");
                              break;
        }
         System.out.println("do u want to continue( press y for yes & n for no)"); 
                              yn= s.next();
        
        }    while(yn.equals("y")|| yn.equals("Y"));
        
        
                              
        
    }
    
}
