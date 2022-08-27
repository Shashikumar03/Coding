

package recursion;


public class Permutation {
    public static void main(String[] args) {
        String str="abcd";
        int l=0;
     int r= str.length();
        game(str,l,r-1);
    }
   static void  game(String str,int l,int r){
       if(l==r)
       {
           System.out.println(str);
           return;
       }
       for(int i=l;i<=r;i++)
       {    
          str = swap(str,l,i);// do
          game(str,l+1,r);// recursive call;
         str = swap(str,l,i);// undo
       }
        
    }
   static String swap(String str,int a,int b){// swaping kiye hai isme
       char array[]=str.toCharArray();
       char t=array[a];
       array[a]=array[b];
       array[b]= t; 
       return String.valueOf(array);
   }
}
