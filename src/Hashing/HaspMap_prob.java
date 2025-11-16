package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HaspMap_prob {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[][] queries = {
                {1,0},
                {-3,1},
                {-4,0},
                {2,3}
        };
        System.out.println(Arrays.toString(sumEvenAfterQueries(nums, queries)));
    }
    public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        HashMap<Integer,Integer> x = new HashMap<>();
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            x.put(i,nums[i]);
        }
        for (int i = 0; i < queries.length; i++) {
            nums[queries[i][1]]+=queries[i][0];
            x.put(queries[i][1],nums[queries[i][1]]);
            for(Map.Entry<Integer,Integer> z :x.entrySet()){
                if(z.getValue()%2==0)
                    res[i]+=z.getValue();
            }
        }
        return res;
    }
}
