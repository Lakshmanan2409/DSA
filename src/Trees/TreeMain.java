package Trees;

import java.util.TreeMap;
import java.util.TreeSet;

import static Trees.BinarySearchTree.leftCeiling;

public class TreeMain{
    public static void main(String[] args) {
//        int[] a = {4,2,7,8,13,11,100};
//        leftCeiling(a,7);
//
//        TreeSet<Integer> A =new TreeSet<>();
//        for (int i = 0; i < a.length; i++) {
//            A.add(a[i]);
//            System.out.println(A.higher(a[i]));
//        }
//
//        Node1 node1 = new Node1(5);
//        Node1 node2 = new Node1(3);
//        Node1 node3 = new Node1(7);
//        node1.left = node3;
//        node1.right = node2;
//        int M = 0;
//        int N = 1000;
//        BinarySearchTree node = new BinarySearchTree();
//
//        System.out.println(node.CheckBSD(node1,M,N));

        {
            TreeSet<Integer> s = new TreeSet<>();       // Self balancing tree
            s.add(1);
            s.add(100);
            s.add(28);
            s.add(50);
            s.add(0);
            s.add(10);
            s.add(99);
            s.add(99);

            s.lower(30);
            s.higher(30);
            s.floor(30);
            s.ceiling(30);
            System.out.println(s.pollFirst());
            System.out.println(s.pollLast());
            System.out.println(s);
//            System.out.println(s);
            System.out.println();

            TreeMap<Integer, String> t = new TreeMap<Integer, String>();     // Self balancing tree
            t.put(10, "Lax");
            t.put(5, "L");
            t.put(8, "La");
//            t.remove(10);

            t.lowerEntry(8);
            t.higherEntry(9);
            t.ceilingEntry(8);
            System.out.println(t.floorEntry(8));

            t.lowerKey(8);
            t.higherKey(9);
            System.out.println(t.floorKey(9));
            System.out.println(t);

            System.out.println(t.ceilingEntry(9).getValue());
            System.out.println(t.ceilingEntry(9).getKey());
        }  // TreeSet & TreeMap functions

    }
    private static class Node1 extends BinarySearchTree.Node {
        private Node1 left;
        private Node1 right;
        private int key;

        public Node1(int key) {
            super(key);
        }

        public Node1(int key, Node1 left, Node1 right) {
            super(key, left, right);
        }
    }
}
