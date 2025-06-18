//import java.util.ArrayList;
//import java.util.Collection;
import java.util.*;
public class Java_Stack {
    public static void main(String []args){
        Stack<Integer> d1=new Stack();
        d1.add(1);
        d1.add(2);
        d1.add(3);
        d1.add(4);
        d1.push(77);
        System.out.println(d1);
//        d.remove(2);
        d1.pop();
        System.out.println(d1);
        System.out.println(d1.contains(3));
        System.out.println(d1.isEmpty());
        System.out.println(d1.size());
        System.out.println(d1.peek());
    }
}


