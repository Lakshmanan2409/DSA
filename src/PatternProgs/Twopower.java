package PatternProgs;

import java.util.Scanner;

public class Twopower {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        System.out.println(isPowerOfTwo(x));
    }
    static boolean isPowerOfTwo(int n) {
        if(n==1||n==2)
            return true;
        else if(n%2==0)
            return isPowerOfTwo(n/2);
        return false;
    }
}
