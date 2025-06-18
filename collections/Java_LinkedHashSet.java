
import java.util.*;
public class Java_LinkedHashSet {
    public static void main(String []args){
        Set<Integer> d1=new LinkedHashSet();
        d1.add(1);
        d1.add(3);
        d1.add(null);
        d1.add(4);
        d1.add(4);
        System.out.println(d1);
        d1.remove(3);
//        d1.poll();
        System.out.println(d1);
        System.out.println(d1.contains(3));
        System.out.println(d1.isEmpty());
        System.out.println(d1.size());
        System.out.println(d1);
    }
}


