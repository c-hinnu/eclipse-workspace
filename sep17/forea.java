package sep17;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;



public class forea {



   public static void main(String[] args) {
        LinkedList<Integer> l=new LinkedList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
       
         
        l.forEach(i->System.out.println(i));
    }



}