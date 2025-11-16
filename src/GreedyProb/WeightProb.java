package GreedyProb;

public class WeightProb {
    class Solution
    {
        double fractionalKnapsack(int W, Item arr[], int n)
        {
            if(n==0){ return n; }
            if(n==1){
                if(arr[0].weight<=W)
                    return arr[0].value;
            }
            double sum = 0;
            for (int i = 0; i < n; i++) {
                if(arr[i].weight<=W){
                    sum+=arr[i].value;
                    W-=arr[i].weight;
                }
                else if(W!=0 && W<arr[i].weight ){
                    double x = arr[i].value;
                    x = (x/arr[i].weight)*W;
                    sum+=x;
                }
            }
            return sum;
        }
    }
    class Item {
        int value, weight;
        Item(int x, int y){
            this.value = x;
            this.weight = y;
        }
    }
}
