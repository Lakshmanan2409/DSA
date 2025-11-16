package BasicProb;

import java.util.Scanner;

public class BitwiseOps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);
        System.out.println(~b);
        System.out.println(a<<1);
        System.out.println(b>>1);
        System.out.println(a>>>1);
    }
}
