package StackandQueue;
import java.util.*;


public class PriorityQueuess {
    public static void main(String[] args) {
        PriorityQueue<Integer> p =new PriorityQueue<Integer>(Collections.reverseOrder());
        p.add(10);
        p.add(30);
        p.add(40);
        p.add(20);
        p.add(5);
        System.out.println(Arrays.toString(p.toArray()));
        Queue<Integer> q = new LinkedList<>();
    }
}
