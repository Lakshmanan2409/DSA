package Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class Hash {
    public static void main(String[] args) {
        hash(4);
        insert(4);
        insert(5);
        insert(6);
        insert(7);
        insert(8);
        insert(9);
        insert(10);
        System.out.println(search(4));
    }
    static int bucket;
    static ArrayList<LinkedList<Integer>> table;
    public static void hash(int b){
        bucket = b;
        table = new ArrayList<LinkedList<Integer>>(bucket);
        for (int i = 0; i < bucket; i++) {
            table.add(new LinkedList<>());
        }
    }
    public static void insert(int key) {
        int row = key % bucket;
        table.get(row).add(key);
    }
    public static void delete(int key) {
        int row = key % bucket;
        table.get(row).remove(key);
    }
    public static boolean search(int key){
        int row = key%bucket;
        return table.get(row).contains(key);
    }
}
