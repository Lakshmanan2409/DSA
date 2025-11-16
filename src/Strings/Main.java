package Strings;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Subsetss("","mango"));
//        System.out.println("mango".substring(0,1));
        System.out.println(Dup("abcd","cdabcdab"));
        String x = "Lakshmanan";
        System.out.println(x.replace('a','d'));
        System.out.println(x);
    }
    public static int Dup(String x, String y){
        int n = (y.length()-x.length());
        if(n<=0){
            String temp = x+"";
            for (int i = 0; i < 3; i++) {
                if(temp.contains(y))
                    return i;
                temp+=x;
            }
        }
        else
            n=y.length();
        String process = x+"";
        int res = 1;
        for (int i = 0; process.length()<y.length()+x.length(); i++) {
            process+=x;
            res++;
        }
        for (int i = 0; i <= 2; i++) {
            if(process.contains(y)) {
                return res+i;
            }
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
}
