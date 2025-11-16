package OOP;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c;
        try{
            c=a/b;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Is Always Run");
        }
    }
}
