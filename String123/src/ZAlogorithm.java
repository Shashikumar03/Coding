/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shash
 */
public class ZAlogorithm {
     public static void main(String[] args) {
        String s="aaaaaaaacaaaaaaaaab";
        String s1="aaaac";
    int a=    strstr(s,s1);
   
        System.out.println(a);
    }
    static int strstr(String s, String x)
    {
       int n1=s.length();
        int n2=x.length();
       char [] res=new char[n1+n2+1];
       for(int i=0;i<n2;i++)
       {
           res[i]=x.charAt(i);
           
       }
       res[n2]='@';
       int p=0;
       for(int i=n2+1;i<res.length;i++)
       {
           res[i]=s.charAt(p);
           p++;
       }
      // System.out.print(res.length+"bb");
       int [] z=calculateZ(res);
       int index=0;
      for(int i=0;i<z.length;i++)
      {
          if(z[i]==n2)
          {
              index=(i-n2-1);
              return index;
          }
      }
       return -1;
       
    }
    
   static int [] calculateZ(char [] arr)
    {
        int[] z= new int[arr.length];
        int left=0;
      int  right=0;
        for(int i=0;i<z.length;i++)
        {
            if(i>right)
            {
                right=left=i;
                
                while(right<arr.length && arr[right]==arr[right-left])
                {
                    right++;
                }
                z[i]=right-left;
                right--;
            }
            else
            {
                int j=i-left;
                if(z[j]<right-i+1)
                {
                    z[i]=z[j];
                }
                else
                {
                    left=i;
                    while(right<arr.length && arr[right]==arr[right-left])
                {
                    right++;
                }
                z[i]=right-left;
                right--;
                }
            }
        }
        return z;
    
}
}