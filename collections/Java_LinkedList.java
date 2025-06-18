
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.LinkedList;
import java.util.*;
public class Java_LinkedList {
    public static void main(String []args){
        LinkedList<Integer> d=new LinkedList();
        d.add(1);
        d.add(2);
        d.addFirst(3);
        d.add(4);
        d.addLast(7);
        System.out.println(d);
        d.removeLast();
        System.out.println(d);
        System.out.println(d.contains(3));
        System.out.println(d.isEmpty());
        System.out.println(d.size());
        System.out.println(d.getFirst());
        System.out.println(d.getLast());
    }
}

