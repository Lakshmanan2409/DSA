package PatternProgs;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=69;
        for (int row = n; row >=65 ; row--) {
            for (int col = 1; col <= n-row+1 ; col++) {
                System.out.print((char)(row+col-1));
            }
            System.out.println();
        }
    }
}
