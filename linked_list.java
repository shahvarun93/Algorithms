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
public class linked_list {
    public static void main(String args[])
    {
        LinkedList<String> l1=new LinkedList<String>();
        l1.add("I1");
        l1.add("I5");
        l1.add("I3");
        l1.add("I6");
        l1.add("I2");
        System.out.println(l1);
        l1.addFirst("First I1tem");
        l1.addLast("LastItem");
        System.out.println("After addition"+l1);
        
        Object thirdvar=l1.get(2);
        System.out.println("Third value"+thirdvar);
        
        l1.set(2, "Changed third Item");
        System.out.println("After updating"+l1);
        Object f2=l1.get(2);
        System.out.println("New value"+f2);
        
        //remove
        l1.removeFirst();
        l1.removeLast();
        System.out.println("After deletion"+l1);
        
        l1.add(0,"newly added");
        l1.remove(2);
        l1.add("newly added");
        int c=l1.lastIndexOf("newly added");
        System.out.println("Final content"+l1);
        String s=l1.poll();
        System.out.println(s);
        
        
    }
    
}
