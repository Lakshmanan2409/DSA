package Sorting;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = { 1,3,5,7,2,4,6 };
        Insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Bubble(int[] arr){
        if(arr.length == 0){ return; }
        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1] > arr[j]){
                    int x = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = x;
                    swap = true;
                }
            }
            if(!swap)
                return;
        }
    }

    public static void Selection(int[] arr){
        if(arr.length==0 || arr.length==1 ){ return; }
        for (int i = 0; i < arr.length; i++) {
            int max = GetMax(arr,0,arr.length-i);
            int x = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[max];
            arr[max] = x;
        }
    }

    private static int GetMax(int[] arr, int i, int i1) {
        int max = i;
        if(i1 == i){ return arr[max]; };
        for (int j = i+1; j < i1; j++) {
            if(arr[j]>arr[max])
                max = j;
        }
        return max;
    }

    public static void Insertion(int[] arr){
        if(arr.length == 0){ return; }
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                    if(arr[j] < arr[j-1]){
                        int x = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = x;
                    }
                    else{
                        break;}
            }
        }
    }

}
