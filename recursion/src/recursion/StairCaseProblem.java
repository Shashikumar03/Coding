/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursion;

/**
 *
 * @author shash
 */
public class StairCaseProblem {
    public static void main(String[] args) {
        System.out.println(game(5)); 
    }
    static int game( int n){
        if(n==0|| n==1)
            return 1;
        if(n<0)return 0;
        return game(n-1)+game(n-2)+game(n-3);
        
    }
    
}
