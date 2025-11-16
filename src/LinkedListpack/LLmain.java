package LinkedListpack;

import java.util.LinkedList;
import java.util.Queue;

public class LLmain {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(6);
        list.insert(5);
        list.insert(4);
        list.insert(3);
        list.insert(2);
        list.display();
        list.insert(7);
        list.insert(8);
        list.display();
        list.delete(6);
        list.display();
        LinkedList<Integer> q = new LinkedList<>();
    }
}
