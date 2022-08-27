

package operator;

public class XorSwaping {
    public static void main(String[] args) {
//        int a=5;
//        int b=7;
//        a=a^b;
//        b=a^b;
//        a=a^b;
//        System.out.println(a+" "+b);
        int[] arr= {1,1,2,2,3,4,4,5,5};
        int temp=arr[0];
        for (int i = 1; i < arr.length; i++) {
            temp=temp^arr[i]; 
            
        }
        System.out.println(temp);
        
    }
}
