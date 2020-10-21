package Leetcode;

public class Leetcode665_非递减数列 {
    public boolean checkPossibility(int[] nums) {
        if(null==nums||0==nums.length){
            return true;
        }
        int res=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                res--;
            }
            if(res<0){
                return false;
            }
        }
        return true;

    }

}
