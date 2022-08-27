
package chapstring;

public class MaxAndMinChar {
    public static void main(String[] args) {
        String s= "deepaeek";
       int  min= Integer.MAX_VALUE;
       int max= Integer.MIN_VALUE;
        char c=' ';
       int [] arr = new int [127];
       
        for (int i = 0; i < s.length()-1; i++)
        {
           arr[s.charAt(i)]= arr[s.charAt(i)]+1; 
        }
        for (int i = 0; i < s.length(); i++) {
            if(max<arr[s.charAt(i)])
            {
                max = arr[s.charAt(i)];
                c=s.charAt(i);    
            }
        }
        System.out.println(c);
      
    }
}
