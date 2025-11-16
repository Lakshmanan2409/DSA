package Strings;

import java.util.ArrayList;

public class LongestPalinSubString {
    public static void main(String[] args) {
//        System.out.println(longestPalindrome(""));
        System.out.println("strings".substring(1,4));
    }

    public static String longestPalindrome(String s) {
        ArrayList<String> x = Subset("",s);
        int n = x.size();
        String res = "";
        for (int i = 0; i < n; i++) {
            if(isPalindrome(x.get(i)) && res.length()<x.get(i).length()){
                res=x.get(i);
            }
        }
        return res;
    }
    public static ArrayList<String> Subset(String p,String up){
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
    public static boolean isPalindrome(String s){
        int n = s.length();
        if(n==0){ return false; }
        if(n==1){ return true; }
        for (int i = 0; i < n/2; i++) {
            if(s.charAt(i)!=s.charAt(n-1-i))
                return false;
        }
        return true;
    }
}
