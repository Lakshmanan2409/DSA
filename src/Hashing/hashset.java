package Hashing;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> s = new HashSet<>();
        s.add("lax");
        s.add("aaa");
        s.add("lax");
        System.out.println(s.add("lax"));
        System.out.println(s.add("l"));
        System.out.println(s.size());
        for(String x : s){
            System.out.println(x);
        }
//        String l = "lax";
//        System.out.println(s);
//        System.out.println(s.contains(l));
    }
}
