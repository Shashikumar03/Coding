
package hashset123;
import java.util.HashSet;

/**
 *
 * @author shash
 */
public class HashSet123 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int [] a= {1,2,3,4,1};
        HashSet<Integer> hs= new HashSet<>();
        for (int i = 0; i <a.length; i++)
        {
            if(!hs.contains(a[i]))
            {
                System.out.println(a[i]);
                hs.add(a[i]);
                
            }
            else
            {
                hs.add(a[i]);
            }
                
            
        }
       System.out.println(13/10);
    }
    
}
