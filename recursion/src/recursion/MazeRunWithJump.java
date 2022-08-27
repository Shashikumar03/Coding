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
public class MazeRunWithJump {
    public static void main(String[] args) {
        System.out.println( game(3,3));
    }
    static int game(int r,int c){
        if(r==1||c==1)
        {
           return 1; 
        }
        if (r<1 || c<1)return 0;
        return game(r-2,c-2)+game(r-3,c-3)+game(r-1,c-1)+game(r-1,c)+game(r-2,c)+game(r-3,c)+game(r,c-1)
     +game(r,c-2)+game(r,c-3);
    }
    
}
