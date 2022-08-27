

package chapstring;


public class ReverseString {
    public static void main(String[] args) {
        
        String s= "mam";
        String rev= "";
        for (int i = s.length()-1; i >=0; i--)
        {
        rev = rev+s.charAt(i);
            
        } 
        System.out.println(rev);
        if(s.equals(rev))
        {
            System.out.println(" palindrome number");
        }
        else System.out.println(" not palindrome number");
    }
    
}
