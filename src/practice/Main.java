package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
//        System.out.printf("%.2f",0.1111111f);
//        System.out.println();
//        System.out.println((int)(Math.log10(456))+1);
//        int[] a = {1,2,3,4,5,5,6,7,8};
//        System.out.println(Arrays.toString(CountDup(a,5)));
//        String x = "hello";
//        MissingAlphabet(x);
//        System.out.println(NoOfIntegers(101,200));
//        int[] a = {10,2,3,4,5};
//        TenMultiples(a);
//        System.out.println(Arrays.toString(a));
//        System.out.println(isAnagram("ac","bb"));
        int[] a = { 19, 7, 0, -17, 8, -7, 3, 16, 6, -19, -8, 11, -19, 14, 5, -5, 1, 6, -1, 13};
//        System.out.println(SubArray(a,20,8));
        char[][] ch = new char[2][3];
        System.out.println(Arrays.toString(ch));
    }

    public static int SubArray(int[] a, int N, int target){
        int res=0, sum=0, i=0, j=0;
        while(i<N && j<N){
            sum+=a[j];
            if(sum==target && j-i+1>res){
                res = j-i+1;
                j++;
            }
            else
                j++;
            if(j==N-1){
                sum=0;
                i++;
                j=i;
            }
        }
        return res;
    }

    public static void MissingAlphabet(String x){
        ArrayList<Character> str = new ArrayList<>(200);
        int j = 97;
        for (int i = 0; i <= 26; i++) {
            str.add(i,(char)(j));
            j++;
        }
        for (int i = 0; i < x.length(); i++) {
            if(str.contains(x.charAt(i))){
                str.remove((x.charAt(i)-97));
            }
        }
        String S = "";
        for (int i = 0; i < str.size()-1; i++) {
            S = S + str.get(i);
        }
        System.out.println(S);
    }

    public static int[] RotateArray(int[] a,int k){
        if(a.length == k) { return a; }
        Arrays.toString(a);
        k = k % a.length;
        int[] temp = new int[a.length];
        System.arraycopy(a, 0, temp, 0, a.length);
        for (int i = k; i < a.length; i++) {
            a[i] = temp[i-k];
        }
        for (int i = 0; i < k; i++) {
            a[i] = temp[a.length-k+i];
        }
        return a;
    }

    public static int[] TenMultiples(int[] a){
        int[] temp = new int[a.length];
        int j = 0;
        System.arraycopy(a, 0, temp, 0, a.length);
        for (int i = 0; i < a.length; i++) {
            if(temp[i]%10 != 0)
                a[j++] = temp[i]; }
        for (int i = 0; i < a.length; i++) {
            if(temp[i]%10 == 0)
                a[j++] = temp[i];
        }
        return a;
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){ return false; }
        int x = 0, y = 0;
        for(int i=0; i<s.length(); i++)
            x = x + s.charAt(i);
        for(int i=0; i<t.length(); i++)
            y = y + t.charAt(i);
        return x==y;
    }

    public static int NoOfIntegers(int start, int end){
        int count = 0;
        for (int i = start; i <= end; i++) {
            if(isRepeat(i))
                count++;
        }
        return count;
    }
    private static boolean isRepeat(int i) {
        ArrayList<Integer> x = new ArrayList<>();
        while(i != 0){
            if(x.contains(i%10)) {
                return false;
            }
            x.add(i%10);
            i = i/10;
        }
        return true;
    }

    public static int[] CountDup(int[] a, int target){
        int i = 0,y=-1, count=0;
        while(i < a.length){
            if(a[i]==target) {
                count++;
                if(count==1)
                    y=i;
            }
            i++;
        }
        return new int[]{y,y+count-1};
    }
}
