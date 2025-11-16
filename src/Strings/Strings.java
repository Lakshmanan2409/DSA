package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strings {
    public static void main(String[] args) {
//        System.out.println(Subset("","Lao"));
//        System.out.println("Laxo".substring(0,4));
//        System.out.println(StringPermutation("","Lax"));
//        String x = "lak";
//        PhonePad("","12");
//        System.out.println(Math.pow(10,3));
//        System.out.println(lengthOfLongestSubstring("bbbb"));
//        ZigZag("Lakshmananan",3);
        String s = "abcd";
        String qn = "abcdabcdabcd";
        System.out.println(Dup(s,qn));
    }
    public static int Dup(String x, String y){
        int n = (y.length()-x.length())/x.length();
        String process = x+"";
        for (int i = 1; i <= n+1; i++) {
            List<String> l = Subsetss("",process);
            if(l.contains(y)) {
//                System.out.println(i);
                return i;
            }
            ;
            process = process + x;
        }
        return -1;
    }
    public static ArrayList<String> Subsetss(String p,String up){
        if(up.isEmpty()) {
            return new ArrayList<>();
        }
        ArrayList<String> list = new ArrayList<>();
        list.add(up);
        for (int i = 0; i < up.length(); i++) {
            for (int j = i+1; j <= up.length(); j++) {
                String x = up.substring(i,j);
                if(!x.isEmpty())
                    list.add(x);
            }
        }
        return list;
    }

    public static void ZigZag(String s,int n){
        if(s.length()<=1){return;}
        char[][] res = new char[n][s.length()];
        int i=0,j=0,k=0;
        while(k<s.length()){
            if(i==0){
                for (int l = 0; l < res.length-1; l++) {
                    res[i][j]=s.charAt(k);
                    i++;k++;
                }
            }
            if(i==n-1){
                for (int l = i; l > 0 ; l--) {
                    res[i][j] = s.charAt(k);
                    i--;j++;k++;
                }
            }
        }
        String x ="";
        for (int l = 0; l < n ; l++) {
            for (int m = 0; m < s.length(); m++) {
                if(res[l][m]!=0){
                    x+=res[l][m];
                }
            }
        }
        System.out.println(x);
    }

    public static List<String> StringPermutation(String p, String up){
        if(up.isEmpty()){
//            System.out.println(p);
            List<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }
        List<String> res = new ArrayList<>();
        char ch = up.charAt(0);
        int count=0;
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            res.addAll(StringPermutation(f+ch+s,up.substring(1)));
        }
        return res;
    }

    public static void PhonePad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char)('a'+ i);
            PhonePad(p+ch,up.substring(1));
        }
    }

    public static int lengthOfLongestSubstring(String s) {
        if(s.length()==0){return 0;}
        String res ="";
        int i=0, count=0,sum=0;
        while(i<s.length()){
            if(res.contains(s.charAt(i)+"")){
                count = res.length() - res.indexOf(s.charAt(i));
                res = res.substring(res.indexOf(s.charAt(i))+1)+s.charAt(i);
            }
            else{
                res=res+s.charAt(i);
                count++;
            }
            sum=Math.max(sum,count);
            i++;
        }
        return sum;
    }

    public static boolean isPalindrome(String s){
        int n = s.length();
        if(n==0){ return false; }
        if(n==1){ return false; }
        for (int i = 0; i < n/2; i++) {
            if(s.charAt(i)!=s.charAt(n-1-i))
                return false;
        }
        return true;
    }
    public static String SubSetPalindrome(String s){
        ArrayList<String> x = Subset("",s);
        int n = x.size();
        for (int i = 0; i < n; i++) {
            if(isPalindrome(x.get(i))){
                return x.get(i);
            }
        }
        return x.get(0);
    }
    public static ArrayList<String> Subset(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = Subset(p+ch,up.substring(1));
        ArrayList<String> right = Subset(p,up.substring(1));
        left.addAll(right);
        return left;
    }

    public static void DiceProb(String p, int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6 && i<=target ; i++) {
            DiceProb(p+i,target-i);
        }
    }
}
