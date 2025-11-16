package Arrayss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arr_SubArr {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            x.add(i+1);
            y.add(i+1);
        }
        String str = "";
        for (int i = 0; i < x.size(); i++) {
            str+=x.get(i);
        }
        System.out.println(str);
        System.out.println(SubSeq("",str));
        System.out.println(SubArr(y));

    }
    public static ArrayList<List<Integer>> SubArr(ArrayList<Integer> x){
        ArrayList<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < x.size(); i++) {
            for (int j = i+1; j < x.size(); j++) {
                if(!x.subList(i,j).isEmpty()){
                    res.add(x.subList(i,j));
                }
            }
        }
        return res;
    }

    public static ArrayList<ArrayList<Integer>> SubSeq(String p,String up){
        if(up.isEmpty()){
            ArrayList<ArrayList<Integer>> temp = new ArrayList<>();
            temp.add(new ArrayList<>());
            for (int i = 0; i < p.length(); i++) {
                temp.get(0).add(p.charAt(i)-'0');
            }
            return temp;
        }
        int x = up.charAt(0)-'0';
        ArrayList<ArrayList<Integer>> left = SubSeq(p+x,up.substring(1,up.length()));
        ArrayList<ArrayList<Integer>> right = SubSeq(p,up.substring(1,up.length()));
        left.addAll(right);
        return left;
    }

}
