
package recursion;

/**
 *
 * @author shash
 */
public class Power {
    
    public static void main(String[] args) 
    {
        int a=2;
        int b=0;
        
        System.out.println(math(a,b));
        System.out.println(math(5,5)); 
       
    }
   static int math(int a,int b)
   {
      
       
        if (b==0)
        {
            return 1;
        }
      
        
        
      return  a*math(a,b-1);
        
    }
      static int math2(int c,int d)
   {
       if(d==0)
           return 1;
       int ans=math2(c,d/2);
      
       ans = ans*ans;
       
       if(d%2!=0)
       {
          return c*ans; 
       }
       return ans;
   }
  
}
