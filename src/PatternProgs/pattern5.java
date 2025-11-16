package PatternProgs;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for (int row = 1; row <= 2*n-1 ; row++) {
            int k = row > n ? k =2*n-row : row;
            for (int space = 1; space <= n-k; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <=2*k-1 ; col++) {
                if (col > k) {
                    System.out.print((col - k)+1);
                    System.out.print(" ");
                }
                else {
                    System.out.print(k-col+1);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
