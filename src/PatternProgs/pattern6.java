package PatternProgs;

import java.util.Scanner;

import static java.lang.Math.min;

public class pattern6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for (int row = 1; row <= 2*n-1; row++) {
            int k= row>n ? k=2*n-row : row;
            for (int col = 1; col <= 2*n-1; col++) {
                int m= col>n ? m=2*n-col : col;
//                if(n<m){
//                    System.out.print(5);
//                }
//                else{
                    System.out.print(n-min(k,m)+1+" ");
//                }
            }
            System.out.println();
        }
    }
}
