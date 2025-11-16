package PatternProgs;

public class pattern17 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row < 2*n; row++) {
            int k = (row>n)? 2*n-row: row;
            for (int space = 1; space <= n-k; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*k-1; col++) {
                int m = (col>k)? 2*k-col: col;
                System.out.print(k-m+1);
            }
            System.out.println();
        }
    }
}
