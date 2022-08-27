

package string123;

/**
 *
 * @author shash
 */
public class String123 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String s="10000111";
     char [] ch = s.toCharArray();
         String s1 = "";
        for(int i = 0;i<s.length();i++)
        {
            if(ch[i]=='0')
                s1 = s1+Character.toString('1');
            else
                s1= s1+Character.toString('0');
        }
       

   
        System.out.println(s1);
    }
    
}
