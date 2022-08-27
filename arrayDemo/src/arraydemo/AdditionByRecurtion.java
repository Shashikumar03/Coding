/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraydemo;

/**
 *
 * @author shash
 */
public class AdditionByRecurtion {
    static int  fact=0;
    public static void main(String[] args) {
        int no= 5;
        AdditionByRecurtion abr = new AdditionByRecurtion();
        abr.calAddition(no);
        System.out.println(fact);
        
        
    }
    void calAddition(int no){
        if(no>=1)
        {
            fact = fact+no;
            calAddition(no-1);
        }
    }
    
}
