package GreedyProb;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class CoinProb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(MinCoins(n));
    }

    static ArrayList MinCoins(int n) {
        TreeSet<Integer> x = new TreeSet<>();
        x.add(1); x.add(2); x.add(5); x.add(10); x.add(20); x.add(50);
        x.add(100); x.add(200); x.add(500); x.add(1000); x.add(2000);
        ArrayList<Integer> res = new ArrayList<>();
        System.out.println(x);
        while(n!=0){
            res.add(x.floor(n));
            n-=x.floor(n);
        }
        return res;
    }
}
