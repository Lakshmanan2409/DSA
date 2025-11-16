package PatternProgs;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        for (int i = 1; i <= 2 * r - 1; i++) {
            int k = i;
            if (i > r)
                k = 2 * r - i;
            for (int space = 0; space <r-k ; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= k; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

