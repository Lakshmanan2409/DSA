import java.util.ArrayList;
import java.util.Arrays;


public class Soln {
    static int z = 5;
    public static void main(String[] args) {
//        int x = 5;
//        int y = x;
//        x = 6;
//        System.out.println(x+" "+y);
//        System.out.printf("%.2f",Math.sqrt(35));
//        System.out.println();
//        System.out.println((int)(Math.log10(12345)+1));
//        int[] a = new int[5];
//        Arrays.fill(a,5);
//        final int lakshman = 5;
//        System.out.println(Arrays.toString(a));
        int[] x = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(x,9)));
        System.out.println("lakshmanan".contains("kph"));
    }
    public static int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(i,target-nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            l.remove((Object)(target-nums[i]));
            if(l.contains(nums[i])){
                return new int[]{l.indexOf(nums[i]),i};
            }
            l.add(i,target-nums[i]);
        }
        return new int[]{-1,-1};
    }
}
