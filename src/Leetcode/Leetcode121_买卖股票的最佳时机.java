package Leetcode;

public class Leetcode121_买卖股票的最佳时机 {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int res=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            if(prices[i]-min>res){
                res=prices[i]-min;
            }
        }
        return res;
    }
}
