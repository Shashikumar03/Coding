 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mtdemo;

import java.time.Clock;

/**
 *
 * @author  shashi
 */
public class Test extends Thread
{
 
   public void run()
   {
       System.out.println("multi taks");
       
   }
      public static void main(String[] args) {
        Test t = new Test();
         t.start();
         
    }
}

