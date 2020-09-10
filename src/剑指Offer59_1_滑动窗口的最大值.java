/*
public class 剑指Offer59_1_滑动窗口的最大值 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int left=0,right=0;
        int[] res=new int[nums.length-k+1];
        int sum=0;
        for(;right<nums.length;right++){
            if(k>0){
                sum+=nums[right];
                k--;
            }
            res[]

            else {
                res=Math.max(res,sum);
                left++;
                sum=sum-nums[left];


        }

    }
        return res;
}
*/
