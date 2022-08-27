/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package set;

import java.util.HashMap;



/**
 *
 * @author shash
 */
public class Map {
    
    public static void main(String[] args) {
        
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("shashi", 3);
        hm.put("kushwaha",3);
        System.out.println(hm);
        System.out.println(  hm.get("shashi")); 
       System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm);
        
    }
}
