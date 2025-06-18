
//import java.util.ArrayList;
//import java.util.Collection;
import java.util.*;
public class Java_Vector {
    public static void main(String []args){
        Vector<Integer> d=new Vector();
        d.add(1);
        d.add(2);
        d.add(3);
        d.add(4);
        System.out.println(d);
        d.remove(2);
        System.out.println(d);
        System.out.println(d.contains(3));
        System.out.println(d.isEmpty());
        System.out.println(d.size());

    }
}

