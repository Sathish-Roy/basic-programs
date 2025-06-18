import java.util.*;
public class java_Queue {
    public static void main(String []args){
        PriorityQueue<Integer> d1=new PriorityQueue();
        d1.add(1);
        d1.add(2);
        d1.add(3);
        d1.add(4);
        System.out.println(d1);
//        d.remove(2);
        d1.poll();
        System.out.println(d1);
        System.out.println(d1.contains(3));
        System.out.println(d1.isEmpty());
        System.out.println(d1.size());
        System.out.println(d1.peek());
    }
}


