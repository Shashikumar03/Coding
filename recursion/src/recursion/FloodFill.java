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
public class FloodFill {
    
    public static void main(String[] args) {
       
        int[][] a={{1,1,1,1,0,1},
                   {1,2,1,2,0,2},         
                   {1,2,2,2,0,2},
                   {1,1,2,1,0,1},
                   {1,2,2,2,0,2},
                   {1,2,2,1,0,1},
                  };
        floodFill2(a,4,2,3,2);
       printMatrix(a);
          
            
        
                       
                 
    }
    static void floodFill2(int a[][],int r,int c,int toFill,int preFill)
    {
        int rows=a.length;
        int cols=a[0].length;
        if(r<0||r>=rows||c<0||c>=cols)
        {
            return;
        }
        if(a[r][c]!=preFill)
        {
            return;
        }
        
        a[r][c]=toFill;
        floodFill2(a,r-1,c,toFill,preFill);
        floodFill2(a,r+1,c,toFill,preFill);
        floodFill2(a,r,c-1,toFill,preFill);
        floodFill2(a,r,c+1,toFill,preFill);
    }

     static void printMatrix(int[][] a) {
         for (int i = 0; i < a.length; i++) {
             for (int j = 0; j <a.length; j++)
             {
                 System.out.print(a[i][j]+" ");
                 
             }
             
         }
    }
}
