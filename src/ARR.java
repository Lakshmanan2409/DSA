import java.util.TreeSet;

public class ARR {
    public static void main(String[] args) {
        int[] x = {1,2};
        int[] y = {3,4};
        System.out.println(findMedianSortedArrays(x,y));
        TreeSet<Integer> z = new TreeSet<>();
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            double res=0;
            int median = (nums1.length+nums2.length)/2;
            int check = (nums1.length+nums2.length)%2;
            int[] x = new int[nums1.length+nums2.length];
            int i=0,j=0,k=0;
            while(k<(nums1.length+nums2.length)){
                if(i==nums1.length){
                    x[k]=nums2[j];
                    j++;
                    k++;
                }
                else if(j==nums2.length){
                    x[k] = nums1[i];
                    i++;
                    k++;
                }
                else if(nums1[i]<nums2[j]){
                    x[k] = nums1[i];
                    i++;
                    k++;
                }
                else{
                    x[k] = nums2[j];
                    j++;
                    k++;
                }
            }
            if(check==1){
                res = x[median];
                return res;
            }
            else{
                res = (x[median]+x[median-1])/2;
                return res;
            }
        }
    }
