

package sumoftwonumberswithoutaddition;

public class SumOfTwoNumberswithoutAddition {

    public static void main(String[] args) {
        int n= addition(5,4);
        System.out.println(n);
    }
    static int addition(int x,int y){
        while(y!=0)
        {
            int carry =x&y;
            x=x^y;
            y=carry<<1;
            
            
        }
        return x;
       
    }
    
}
