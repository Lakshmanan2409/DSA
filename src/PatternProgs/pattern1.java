package PatternProgs;

public class pattern1 {
    public static void main(String[] args) {
        int[] arr=new int[6];
        for (int j = 1; j <= 5; j++) {
            for (int i = 1; i <= 5; i++) {
                if(i<=j)
                    System.out.print(i);
            }
            System.out.println();
        }
    }
}
