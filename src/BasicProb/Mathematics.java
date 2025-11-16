package BasicProb;

import java.util.Scanner;

public class Mathematics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int a=in.nextInt();
        System.out.println(CountDigit(566556)+"  "+Math.pow(2,3));
        BinaryForm(31);
    }
    static boolean prime(int n){
        int x=2;
        while(x*x <= n){
            if(n%x == 0)
                return false;
            x++;
        }
        return x*x > n;
    }

    static void primeFactor(int n){
        if(n<=1) return;
        for(int i=2; i*i<=n ;i++){
            while(n%i==0){
                System.out.println(i);
                n=n/i;
            }
        }
        if(n>1)
            System.out.println(n);
    }

    static void AllDivisors(int n){
        for (int i = 1; i*i <= n; i++) {
            if(n%i == 0) {
                System.out.println(i);
                if(i != n/i)
                    System.out.println(n/i);
            }
        }
    }

    static boolean Armstrong(int n){
        int sum = 0,temp = n;
        while(temp != 0){
            int rem = temp % 10;
            sum += rem*rem*rem;
            temp = temp/10;
        }
        return n == sum;
    }

    static boolean PalindromeStr(String str){
        int x=str.length();
        int i=0;
        if(x == 1){ return true; }
        if(str == null){ return false; }
        while(i <= x/2){
            if(str.charAt(i) == str.charAt(x-1-i))
                i++;
            else
                return false;
        }
        return true;
    }

    static boolean PalindromeNum(int n){
        int x = n,res = 0;
        while(x != 0){
            res = res*10 + x%10;
            x = x/10;
        }
        return res==n;
    }

    static int CountDigit(int n){
//        int x=0;
//        while(n != 0){
//            int rem=n%10;
//            x++;
//            n=n/10;
//        }
//        return x;
        return (int)(Math.log10(n)+1);
    }

    static int Power(int n, int x){
        int res = 1;
        while(x>0){
            res = res * n;
            x--;
        }
        return res;
    }

    static int Fac(int n){
        int res=1;
        while(n!=0){
            res *= n;
            n--;
        }
        return res;
    }

    static int trailZero(int n){
        int res = 0;
        for (int i = 5; i <= n; i=i*5) {
            res = res + n/i;
        }
        return res;
    }

    static int GCD(int a, int b){
        while(a!=b){
            if(a < b)
                b = b - a;    // if(b==0)  return a;
            else
                a = a - b;    //else return GCD(b,a%b);
        }
        return a;
    }

    static int LCM(int a, int b){
        return (a*b)/GCD(a,b);


    }

    static int BinaryForm(int n){
        if(n<=1) return n;
        String res = "";
        while(n!=0){
            if(n%2==0)
                res="0"+res;
            else
                res="1"+res;
            n=n/2;
        }
        System.out.println(res);
        return 0;
    }  //not finished yet

}
