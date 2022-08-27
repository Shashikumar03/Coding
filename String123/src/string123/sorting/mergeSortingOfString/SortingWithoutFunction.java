

package string123.sorting.mergeSortingOfString;

/**
 *
 * @author shash
 */
public class SortingWithoutFunction {
    
    public static void main(String[] args) {
        
    
    String s1="risiiiiiiihabh";
    int max1=26;
    int[] letters=new int[max1];
     for(int i=0;i<s1.length();i++){
         letters[ s1.charAt(i)-'a']++;
         
     }
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < letters[i]; j++) {
                System.out.print((char)(i+'a')+" ");
                
            }
            
        }
        System.out.println();
       stringfrequencyCount();
        System.out.println(3+'a');
    
}
           static  void   stringfrequencyCount(){
               String s1="shashiiissssssssssssssssssssssssssiiii";
               int letters[]=new int[26];
               
               for (int i = 0; i < s1.length(); i++) {
                   
                   letters[s1.charAt(i)-'a']++;
               }
               int max=0;int m=0;
               for (int i = 0; i < 26; i++) {
                   
                   for (int j = 0; j <1; j++) {
                       if(max<letters[i]){
                           max=letters[i];
                           m=i;
                           
                       }
                       
                   }
                   
               }
               System.out.println(max+" "+(char)(m+'a'));
           }
          
               
           
 } 

