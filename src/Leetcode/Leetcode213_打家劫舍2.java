package Leetcode;

public class Leetcode213_打家劫舍2 {
    public int rob(int[] nums) {
        if(null==nums||nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }

        int len=nums.length;
        if(len%2==0){
            return run(nums,0,len);
        }

        else{
            return Math.max(run(nums,0,len-1),run(nums,1,len));
        }
    }
    public int run(int[] nums,int begin,int end){
        int pre1=0;
        int pre2=0;
        for(int i=begin;i<end;i++){
            int cur=Math.max(pre1+nums[i],pre2);
            pre1=pre2;
            pre2=cur;
        }
        return pre2;
    }
}
