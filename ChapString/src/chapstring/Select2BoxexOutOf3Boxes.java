/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapstring;

/**
 *
 * @author shash
 */
public class Select2BoxexOutOf3Boxes 
{
 
    public static void main(String[] args) {
        int no=3;
        int box[]= new int[3];
        
       perm(box,no,1, 0);
    }
   
    static void perm(int[] box,int no,int ci,int ts)
    {
        if(ts==no)
        {
            for (int i = 0; i <box.length; i++)
            {
                System.out.print(box[i]);
                
            }
            System.out.println();
            return ;
        }
        for (int i = 0; i <box.length; i++) 
        {
            if(box[i]==0)
            {
                box[i]=ci;
                perm(box, no, ci+1, ts+1);
                box[i]=0;
            }
            
        }
       
    }
     
}
