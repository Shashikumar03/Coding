

package list;

import java.util.ArrayList;
import java.util.List;


public class MyArrayList {

    public static void main(String[] args) {
        List<String> fruits= new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        System.out.println(fruits);
        Pair<String,Integer> p1= new Pair("shashi",03);
        p1.getDescription();
    }
    

   static class Pair<X,Y>{
    X x;
    Y y;
    public Pair(X x,Y y){
        this.x =x;
        this.y=y;
    }
      void getDescription()
       {
        System.out.println(x+" and "+y); 
       }

}
}