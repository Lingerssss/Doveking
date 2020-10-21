package Leetcode;

public class Leetcode122_买卖股票的最佳时机2 {
    public int maxProfit(int[] prices) {
        if(null==prices||0==prices.length){
            return 0;
        }
        int res=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]-prices[i-1]>0){
                res=res+prices[i]-prices[i-1];
            }
        }
        return res;

    }
}
