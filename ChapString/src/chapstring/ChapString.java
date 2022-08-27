

package chapstring;

import java.awt.BorderLayout;


public class ChapString {

    public static void main(String[] args) {
        String s1= "a";
        String s2="A";
        String s3= "shashi";
        String s4=" SHASHI";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s3.compareTo(s4));
        System.out.println(10+s1+20+30/30);//10a201;
        System.out.println(String.join("/",s1,s2,s3));
        String s6= "this is demo";
        System.out.println(s6.subSequence(3,10));
        System.out.println(s6.substring(3));
        System.out.println(s6.substring(1, 10));
        System.out.println(s3.charAt(3));
        System.out.println(s3.indexOf('s'));
        System.out.println(s3.lastIndexOf('s'));
        System.out.println(s3.endsWith("i"));
        System.out.println(s3.toUpperCase());
        System.out.println(s4.toLowerCase());
          int a=10; int b=20;
        String s7= String.valueOf(a);
          String s8= String.valueOf(b);
          String a9= "100";
          System.out.println(s7+s8);
             int  c= Integer.valueOf(a9);
             System.out.println(c/5);
            char[] s10= s4.toCharArray();
             System.out.println(s10);
        
    }
    
}
