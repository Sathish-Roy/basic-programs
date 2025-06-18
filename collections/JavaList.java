//import java.util.ArrayList;
//import java.util.Collection;
import java.util.*;
public class JavaList {
    public static void main(String []args){
        List<Integer> d=new ArrayList();
        d.add(1);
        d.add(2);
        d.add(1,3);
        d.add(4);
        System.out.println(d);
        d.remove(2);
        System.out.println(d);
        System.out.println(d.contains(3));
        System.out.println(d.isEmpty());
        System.out.println(d.size());

    }
}
