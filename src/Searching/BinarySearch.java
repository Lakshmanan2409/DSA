package Searching;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(binary(arr,4));
    }
    public static int binary(int[] arr, int target){
        if(arr.length == 0){ return -1; }
        int start=0, end=arr.length-1;
        int mid = start + (end-start)/2;
        while(mid>=0 && mid<arr.length){
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] < target)
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
}
