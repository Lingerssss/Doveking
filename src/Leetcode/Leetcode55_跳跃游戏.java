public class Leetcode55_跳跃游戏 {
    public boolean canJump(int[] nums) {
        int len=nums.length;

        //长度为1直接true
        if (len == 1) {
            return true;
        }
        //定义max为可到达的最大长度
        int max = 0;
        for (int i = 0; i < len - 1; i++) {
            //判断是否可到达
            if (i <= max) {
                //判断是否满足条件
                if (i + nums[i] >= len - 1) {
                    return true;
                }
                //更新max
                if (i + nums[i] >= max) {
                    max=i+nums[i];
                }
            }
            else {
                return false;
            }


        }
        return false;
    }
}
