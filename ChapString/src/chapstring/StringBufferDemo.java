

package chapstring;

import java.awt.BorderLayout;

public class StringBufferDemo {
    
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("shashi");
        System.out.println(sb);
        sb.append(" kushwaha");
        System.out.println(sb);
        System.out.println(sb.charAt(3));
      //  System.out.println(sb.delete(3, 6));
      StringBuffer sb2 = new StringBuffer("rishabh");
        System.out.println(sb2.deleteCharAt(5));//rishah
        StringBuffer sb1= new StringBuffer("rahul");
        System.out.println(sb1.reverse());
        sb1.capacity();
        System.out.println(sb1); 
        // StringBuffer me equals method overriding nhi karega;
        // but String buffer muttable object create karta hai;
        StringBuffer sb3= new StringBuffer("sunny");
        StringBuffer sb4= sb3.append("hii");// sunnyhii;
         StringBuffer sb5= new StringBuffer("sunny");
        System.out.println(sb3.equals(sb4));
        System.out.println(sb3.equals(sb5));//****** false****// memory allocation alag alag hai
       // sb3.append kiye hai to sb3 ka value sunnyhii ho gaya hai usko dono point kar 
        // rahe hai sb3 and sb4;
        System.out.println(sb3.indexOf("3"));
        
        System.out.println(sb3.replace(1, 5, "d"));//sdhii;// 1 ke bad se aur 5 ke phle tak ko
                                                  //     repalce kar dega
         System.out.println(sb3.insert(3, "s"));// sdhsii;
         //reverse method string buufer me hota hai string me nhi
         System.out.println(sb3.substring(2));
    }
    
}
