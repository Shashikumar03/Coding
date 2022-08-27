/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;

/**
 *
 * @author shash
 */
public class PrimeNumber {
     
   
    public static void main(String[] args) 
    { 
        int  n=30;
        
        
        PrimeNumber pn = new PrimeNumber();
        pn.prime(n);
       
    }   
       void prime(int n)
       {
         
         boolean[] prime = new boolean[n+1];
     
          for( int i=0;i<n;i++)
           {
             prime[i]= true;
           }  
           for (int i = 2; i*i <=n; i++)
           {
               if(prime[i]==true)
               {
                   for (int j = i*i; j <=n; j+=i) 
                   {
                       prime[j]=false;
                       
                   }
               }
               
           }
           for (int i = 2; i <=n; i++) 
           {
               if(prime[i]==true)
               {
                   System.out.print(i+",");
               }
           }
            
       }
}
