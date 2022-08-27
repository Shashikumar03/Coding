/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exceptiondemo;


class UnderAgeException extends Exception{

    public UnderAgeException() {
        super(" you are under Age");
    }
    
    
}
public class CustomizeException {
    
    public static void main(String[] args) {
        int age=17;
        if(age<18){
           try{
           
            throw new UnderAgeException();
           }
           catch(UnderAgeException e){
               e.printStackTrace();
           }
        }
    }
}
