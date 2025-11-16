package PatternProgs;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for (int row = 1; row <= n ; row++) {
            for (int space = 1; space <= n-row; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <=2*row-1 ; col++) {
                if (col > row) {
                    System.out.print(row-(col - row));
                    System.out.print(" ");
                }
                    else {
                    System.out.print(col);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
