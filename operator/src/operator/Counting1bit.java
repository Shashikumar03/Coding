

package operator;

public class Counting1bit {
    public static void main(String[] args) {
        int i= 7;
        System.out.println(countSet(i));
    }
     static int countSet(int n){
         int count =0;
        while(n>0)
        {
            count++;
            n= n&(n-1);
        }
        return count;
    }
}
