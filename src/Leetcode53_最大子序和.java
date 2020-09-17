public class Leetcode53_最大子序和 {
    //本题动态规划因为只与上一个数的状态有关，所以可以省略DP数组
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}



//一开始写了个二维DP数组的，内存超限了

/*class Solution {
    public int maxSubArray(int[] nums) {
        int len=nums.length;
        if(nums.length==0)
        {
            return 0;
        }
        int max=nums[0];
        int[][] dp=new int[len][len];
        for(int i=0;i<len;i++){
            dp[i][i]=nums[i];
            if(dp[i][i]>max){
                max=dp[i][i];
            }
        }
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                dp[i][j]=dp[i][j-1]+dp[j][j];
                // System.out.println("i:"+i+"  j:"+j+"  dp[i][j]:"+dp[i][j]);
                if(dp[i][j]>max){
                    max=dp[i][j];

                }
            }
        }
        return max;

    }
}*/
