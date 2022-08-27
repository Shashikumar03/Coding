

package string123.Coversion;

/**
 *
 * @author shash
 */
public class Ato_a {
    public static void main(String[] args) {
      String s="SHASHI";
      s.toLowerCase();
      StringBuffer sb= new StringBuffer(s);
       sb=sb.reverse();
       String s11=sb.toString();
        System.out.println(s11);
      for(char c:s.toCharArray()){
          int a2=c-'A';
          System.out.print((char)(a2+'a'));
      }
        System.out.println(); 
        String s1= new String();
        
    }
    
}
