/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mtdemo;

/**
 *
 * @author shash
 */
public class Test1  implements Runnable{
   
    @Override
      public void run()
    {
        System.out.println(" thread task 2");
    }
      public static void main(String[] args) {
          {
              Test1 t1 = new Test1();
              Thread th = new Thread(t1);
              th.start();
              
         }
    }
}
