package GreedyProb;

import java.util.ArrayList;

public class MaxProfit {
    class Solution
    {
        int[] JobScheduling(Job arr[], int n)
        {
            if(n==0){return new int[]{-1,-1};}
            if(n==1){return new int[]{arr[0].id,arr[0].profit};}
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < n-i; j++) {
                    if(arr[j].profit>arr[j-1].profit){
                        swap(arr,j,j-1);
                    }
                }
            }
            ArrayList<Integer> a = new ArrayList<>();
            int count = 0,sum=0;
            for (int i = 0; i < n; i++) {
                if(a.get(arr[i].deadline)!=arr[i].deadline){
                    a.add(arr[i].deadline,arr[i].profit);
                    count++;
                    sum+=arr[i].profit;
                }
            }
            return new int[]{count,sum};
        }

        private Job[] swap(Job[] a, int j, int i) {
            Job x = new Job(a[j].id,a[j].profit,a[j].deadline);
            a[j] = a[i];
            a[i] = x;
            return a;
        }
    }

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z;
    }
}
}
