import java.util.ArrayList;
import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        String sample = "leetcode";
//        System.out.println(sample.substring(3,5));
        StringBuilder n = new StringBuilder();
        n.append(5);
        n.append(3.23);
        n.append('v');
        n.append("LAKSHMANAN");
        char[] c = "lakshman".toCharArray();
        System.out.println(n.indexOf("LA",1));
        System.out.println(Arrays.toString(n.toString().toCharArray()));
        System.out.println(Arrays.toString(c));
    }
    public static String largestNumber(int[] nums) {
            for(int i=0;i<nums.length;i++){
                for(int j=1;j<nums.length-i;j++){
                    if(isLarger(nums[j],nums[j-1])){
                        swap(nums, j, j - 1);
                    }
                }
            }
            String s = "";
            for (int i = nums.length-1; i >= 0; i--) {
                s+=nums[i];
            }
            return s;
        }

    public static boolean isLarger(int x, int y) {
        int n =(int) (Math.log10(x)+1);
        int m =(int) (Math.log10(y)+1);
        while(n!=0 && m!=0){
            if(n==m){
                return y>x;
            }
            else if(n==1){
                return (x <= y/(int)(Math.pow(10,m-1)));
            }
            else if(m==1){
                 return (x/(int)(Math.pow(10,n-1)) < y);
            }
            else if(x/(int)(Math.pow(10,n-1)) > y/(int)(Math.pow(10,m-1)))
                return false;
            else if(x/(int)(Math.pow(10,n-1)) < y/(int)(Math.pow(10,m-1))){
                return true;
            }
            x=x%(int)(Math.pow(10,n-1));
            y=y%(int)(Math.pow(10,m-1));
            n--;m--;
        }
        if(n==0){
            return false;}
        return true;
    }

    public static int[] swap(int[] a, int i, int j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            return a;
    }
}

