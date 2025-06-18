
import java.util.*;

public class Java_TreeMap {
    public static void main(String[] args){
        Map<Integer,String> d=new TreeMap();
        d.put(1,"apple");
        d.put(5,null);
        d.put(3,"roy");
        d.put(2,"sathish");
        System.out.println(d);
        d.remove(1);
        System.out.println(d);
        System.out.println(d.containsKey(3));
        System.out.println(d.containsValue("roy"));
        System.out.println(d.isEmpty());
        System.out.println(d.keySet());
        System.out.println(d.values());
    }
}
