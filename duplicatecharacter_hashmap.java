/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;
import java.util.*;

/**
 *
 * @author shahv
 */
public class duplicatecharacter_hashmap {
    public static void main(String args[])
    {
        String s="repeatition";
        char c[]=s.toCharArray();
        HashMap<Character,Integer> h=new HashMap<Character,Integer>();
        for(Character i: c)
        {
            if(h.containsKey(i))
            {
                h.put(i,h.get(i)+1);
            }
            else 
                h.put(i, 1);
        }
        Set k=h.entrySet();
        Iterator i=k.iterator();
        while(i.hasNext())
        {
            Map.Entry m=(Map.Entry)i.next();
            System.out.println(m.getKey()+":"+m.getValue());
        }
        Set<Character> keys=h.keySet();
        for(Character j: keys) //Insertion order not preserved but if used character array c[] fthen insertion order is preserved
        {
            if(h.get(j)>=1)
            {
                //System.out.println(j+":"+h.get(j));
                //break;
            }
        }
    }
}
