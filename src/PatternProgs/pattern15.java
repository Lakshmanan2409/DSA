package PatternProgs;

public class pattern15 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row < 2*n; row++) {
            int k = (row>n)? 2*n-row:row;
            for (int space = 1; space <= n-k; space++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if(2*(k-1)-1>=0){
                for (int space = 1; space < 2 * (k - 1); space++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
