package Arrayss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arrt {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> d = new ArrayList<>();
        int[] arr = new int[5];
        d.add(30);
        x.add(15);
        x.add(30);
        System.out.println(x.remove((Object)(15)));
        System.out.println(x);
//        int[] arr = {5,4,3,2,1};
//        int length = arr.length;
//        int count = 0;
//        Arrays.sort(arr);
//        for (int j = 0; j < length - 1; j++) {
//            if (arr[j] > arr[j + 1]) {
//                count++;
//                int temp = arr[j];
//                arr[j] = arr[j + 1];
//                arr[j + 1] = temp;
//                j = -1;
//            }
//        }
//        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int i=0,sum=0;
        while(i<s.length()){
            if(s.charAt(i)=='I'){
                if(i<s.length()&&s.charAt(i+1)=='V'){
                    sum+=4;
                    i++;}
                else if(i<s.length()&&s.charAt(i+1)=='X'){
                    sum+=9;
                    i++;}
                else{
                    sum+=1;}
            }
            else if(s.charAt(i)=='V')
                sum+=5;
            else if(s.charAt(i)=='X'){
                if(i<s.length()&&s.charAt(i+1)=='L'){
                    sum+=40;
                    i++;}
                else if(i<s.length()&&s.charAt(i+1)=='C'){
                    sum+=90;
                    i++;}
                else{
                    sum+=5;
                    i--;}
            }
            else if(s.charAt(i)=='L')
                sum+=50;
            else if(s.charAt(i)=='C'){
                if(i<s.length()&&s.charAt(i+1)=='D'){
                    sum+=400;
                    i++;}
                else if(i<s.length()&&s.charAt(i+1)=='M'){
                    sum+=900;
                    i++;}
                else{
                    sum+=1000;
                    i--;}
            }
            else if(s.charAt(i)=='D')
                sum+=500;
            else if(s.charAt(i)=='M')
                sum+=1000;
            i++;
        }
        return sum;
    }
    public static String LexicographicOrder(String S){
        String result="";
        String extra ="";
        char[] ch = S.toCharArray();
        Arrays.sort(ch);
        int i=0;
        while(i<S.length()){
            if(!result.contains(ch[i]+"")){
                result+=ch[i]+"";
            }
            else{
                extra+=ch[i]+"";
            }
            i++;
        }
        result+=extra;
        System.out.print(result);
        return result;
    }
}
