package PatternProgs;

import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            int k = 2 * n - 2 * row;
            for (int space = 1; space <= k; space++) {
                System.out.print(" ");
            }
            for (int col = k + row + 1; col <= 2 * n; col++) {
                System.out.print(2*n-col+1);
            }
            System.out.println();
        }
    }
}
