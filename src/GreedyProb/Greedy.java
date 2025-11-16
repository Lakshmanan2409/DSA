package GreedyProb;

import java.util.ArrayList;
import java.util.Arrays;

public class Greedy {
    public static void main(String[] args) {
//        String a = "Lakhsmanan";
//        System.out.println(Arrays.toString(a.toCharArray()));
//        System.out.println(a.toLowerCase());
//        System.out.println(a.toUpperCase());
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println(a.get(0));
    }
    public static int trainTime(int[] arr, int[] dep, int n){
        if(n==1){ return 1; }
        Arrays.sort(arr);
        Arrays.sort(dep);
        int j = 1, count=1,res=0;
        for (int i = 0; i < n-1; i++) {
            if(dep[i] > arr[j]){
                count++;
            }
            else{
                res=Math.max(res,count);
                count--;
                j++;
            }
        }
        return count;
    }

    public static int Meeting(int[] start, int[] end, int n){
        if(n<=1) { return n;}
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                if(end[j]<end[j-1]){
                    swap(end,j,j-1);
                    swap(start,j,j-1);
                }
            }
        }
        int j=0,count=1;
        for (int i = 1; i < n; i++) {
            if(end[j]<=start[i]){
                count++;
                j=i;
            }
        }
        return count;
    }

    private static int[] swap(int[] start, int j, int i) {
        int x = start[j];
        start[j] = start[i];
        start[i] = x;
        return start;
    }

}
